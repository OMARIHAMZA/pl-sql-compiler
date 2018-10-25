package uiback;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import models.Token;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;
import org.reactfx.Subscription;
import utils.AntlrUtils;
import utils.CustomLineNumberFactory;
import utils.FilesUtils;

import java.io.IOException;
import java.time.Duration;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main extends Application {

    private CodeArea codeArea;
    private ExecutorService executor;

    public static void main(String[] args) throws IOException {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        executor = Executors.newSingleThreadExecutor();
        codeArea = new CodeArea();
        codeArea.replaceText(FilesUtils.getPreviousSession());
        codeArea.setParagraphGraphicFactory(CustomLineNumberFactory.get(codeArea));
        Subscription cleanupWhenDone = codeArea.multiPlainChanges()
                .successionEnds(Duration.ofMillis(1))
                .supplyTask(this::computeHighlightingAsync)
                .awaitLatest(codeArea.multiPlainChanges())
                .filterMap(t -> {
                    if (t.isSuccess()) {
                        return Optional.of(t.get());
                    } else {
                        t.getFailure().printStackTrace();
                        return Optional.empty();
                    }
                })
                .subscribe(this::applyHighlighting);
        Scene scene = new Scene(new StackPane(new VirtualizedScrollPane<>(codeArea)), 600, 400);
        scene.getStylesheets().add(Main.class.getResource("/uifront/pl-sql-keywords.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("PL/SQL Compiler");
        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        executor.shutdown();
        super.stop();
    }

    private Task<StyleSpans<Collection<String>>> computeHighlightingAsync() {
        String text = codeArea.getText();
        Task<StyleSpans<Collection<String>>> task = new Task<StyleSpans<Collection<String>>>() {
            @Override
            protected StyleSpans<Collection<String>> call() throws Exception {
                return computeHighlighting(text);
            }
        };
        executor.execute(task);
        return task;
    }

    private void applyHighlighting(StyleSpans<Collection<String>> highlighting) {
        codeArea.setStyleSpans(0, highlighting);
    }

    private static StyleSpans<Collection<String>> computeHighlighting(String text) {
        FilesUtils.saveSession(text);
        StyleSpansBuilder<Collection<String>> spansBuilder = new StyleSpansBuilder<>();
        int lastKwEnd = 0;
        for (Token keyword : AntlrUtils.getTokensFromText(text)) {
            String styleClass = "keyword";
            spansBuilder.add(Collections.emptyList(), (keyword.getStartIndex() - lastKwEnd));
            spansBuilder.add(Collections.singleton(styleClass), (keyword.getEndIndex() - keyword.getStartIndex()));
            lastKwEnd = keyword.getEndIndex();
        }
        spansBuilder.add(Collections.emptyList(), (text.length() - lastKwEnd));
        return spansBuilder.create();
    }
}