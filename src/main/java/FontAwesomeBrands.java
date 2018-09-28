import com.jfoenix.controls.JFXButton;
import javafx.geometry.Orientation;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import org.kordamp.ikonli.Ikon;
import org.kordamp.ikonli.javafx.FontIcon;

public class FontAwesomeBrands extends BorderPane {

    public FontAwesomeBrands() {

        FlowPane flowPane = new FlowPane(Orientation.HORIZONTAL);
        flowPane.setHgap(5);
        flowPane.setVgap(5);

        for(Ikon ikon: org.kordamp.ikonli.materialdesign.MaterialDesign.values()) {
            FontIcon graphic = FontIcon.of(ikon, 32);
            JFXButton btn = new JFXButton(ikon.toString(), graphic);
            btn.setContentDisplay(ContentDisplay.TOP);

            flowPane.getChildren().add(btn);
        }

        flowPane.prefWidthProperty().bind(widthProperty().subtract(5));

        setCenter(new ScrollPane(flowPane));
    }
}
