package utils;

import java.util.function.Function;
import java.util.function.IntFunction;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import org.fxmisc.richtext.GenericStyledArea;
import org.reactfx.collection.LiveList;
import org.reactfx.value.Val;

public class CustomLineNumberFactory implements IntFunction<Node> {
    private static final Insets DEFAULT_INSETS = new Insets(0.0D, 5.0D, 0.0D, 5.0D);
    private static final Paint DEFAULT_TEXT_FILL = Color.web("#666");
    private static final Font DEFAULT_FONT;
    private static final Background DEFAULT_BACKGROUND;
    private final Val<Integer> nParagraphs;
    private final IntFunction<String> format;

    public static IntFunction<Node> get(GenericStyledArea<?, ?, ?> area) {
        return get(area, (digits) -> {
            return "%1$" + digits + "s";
        });
    }

    public static IntFunction<Node> get(GenericStyledArea<?, ?, ?> area, IntFunction<String> format) {
        return new CustomLineNumberFactory(area, format);
    }

    private CustomLineNumberFactory(GenericStyledArea<?, ?, ?> area, IntFunction<String> format) {
        this.nParagraphs = LiveList.sizeOf(area.getParagraphs());
        this.format = format;
    }

    public Node apply(int idx) {
        Val<String> formatted = this.nParagraphs.map((n) -> {
            return this.format(idx + 1, n.intValue());
        });
        Label lineNo = new Label();
        lineNo.setFont(DEFAULT_FONT);
        lineNo.setBackground(DEFAULT_BACKGROUND);
        lineNo.setTextFill(DEFAULT_TEXT_FILL);
        lineNo.setPadding(DEFAULT_INSETS);
        lineNo.setAlignment(Pos.TOP_RIGHT);
        lineNo.getStyleClass().add("lineno");
        lineNo.textProperty().bind(formatted.conditionOnShowing(lineNo));
        return lineNo;
    }

    private String format(int x, int max) {
        int digits = (int)Math.floor(Math.log10((double)max)) + 1;
        return String.format((String)this.format.apply(digits), x);
    }

    static {
        DEFAULT_FONT = Font.font("monospace", FontPosture.REGULAR, 12.0D);
        DEFAULT_BACKGROUND = new Background(new BackgroundFill(Color.web("#F0F0F0"), (CornerRadii)null, (Insets)null));
    }
}
