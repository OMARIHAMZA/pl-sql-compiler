package uiback;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import models.DataMember;
import models.DataType;
import models.Token;
import models.TypeRepository;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;
import org.json.JSONException;
import org.reactfx.Subscription;
import utils.AntlrUtils;
import utils.CustomLineNumberFactory;
import utils.FilesUtils;

import java.io.IOException;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main extends Application {

    private CodeArea codeArea;
    private ExecutorService executor;

    public static void main(String[] args) throws IOException, JSONException {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        executor = Executors.newSingleThreadExecutor();
        codeArea = new CodeArea();
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
        codeArea.replaceText(FilesUtils.getPreviousSession());
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
        List<Token> mTokens = AntlrUtils.getTokensFromText(text);
        System.out.println("Size: " + mTokens.size());
        for (Token token : AntlrUtils.getTokensFromText(text)) {
            String styleClass = "";
            switch (token.getTokenType()) {
                case IDENTIFIER:
                    styleClass = "identifier";
                    break;

                case KEYWORD:
                    styleClass = "keyword";
                    break;

                case NUMBER:
                    styleClass = "number";
                    break;

                case STRING:
                    styleClass = "string";
                    break;
            }
            System.err.println("Style Span Length: " + token.getStartIndex() + "-" + lastKwEnd);
            spansBuilder.add(Collections.emptyList(), (token.getStartIndex() - lastKwEnd));
            spansBuilder.add(Collections.singleton(styleClass), (token.getEndIndex() - token.getStartIndex()));
            lastKwEnd = token.getEndIndex();
        }
        spansBuilder.add(Collections.emptyList(), (text.length() - lastKwEnd));
        return spansBuilder.create();
    }
}
