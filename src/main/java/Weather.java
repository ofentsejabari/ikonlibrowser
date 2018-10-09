import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.GlyphIcons;
import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIcon;
import de.jensd.fx.glyphs.weathericons.WeatherIcon;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;

public class Weather extends BorderPane {

    public Weather() {

        FlowPane flowPane = new FlowPane(Orientation.HORIZONTAL);
        flowPane.setHgap(5);
        flowPane.setVgap(5);

        for(GlyphIcons icon: WeatherIcon.values()) {
            JFXButton btn = new JFXButton("", GlyphsDude.createIcon(icon, "32"));
            btn.setTooltip(new Tooltip(icon.toString()));
            btn.setContentDisplay(ContentDisplay.TOP);

            flowPane.getChildren().add(btn);
        }

        TextField tf = new TextField();
        tf.setPrefColumnCount(200);
        tf.setStyle("-fx-border-radius:20;");
        tf.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if(!newValue.isEmpty()) {
                    flowPane.getChildren().clear();

                    for (GlyphIcons icon: WeatherIcon.values()) {

                        if (icon.toString().toLowerCase().contains(newValue.toLowerCase())) {

                            JFXButton btn = new JFXButton("", GlyphsDude.createIcon(icon, "32"));
                            btn.setTooltip(new Tooltip(icon.toString()));
                            btn.setContentDisplay(ContentDisplay.TOP);

                            flowPane.getChildren().add(btn);
                        }
                    }
                }else{
                    for(GlyphIcons icon: WeatherIcon.values()) {
                        JFXButton btn = new JFXButton("", GlyphsDude.createIcon(icon, "32"));
                        btn.setTooltip(new Tooltip(icon.toString()));
                        btn.setContentDisplay(ContentDisplay.TOP);

                        flowPane.getChildren().add(btn);
                    }
                }
            }
        });

        HBox con = new HBox(tf);
        con.setPadding(new Insets(5));

        setTop(con);

        flowPane.prefWidthProperty().bind(widthProperty().subtract(5));

        setCenter(new ScrollPane(flowPane));
    }
}
