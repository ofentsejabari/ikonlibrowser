import com.jfoenix.controls.JFXTabPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;

import javafx.stage.Stage;

public class IkonliBrowser extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane container = new BorderPane();

        JFXTabPane tabPane = new JFXTabPane();

        Tab materialDesign = new Tab("Material Design");
        materialDesign.setContent(new MaterialDesign());

        Tab material = new Tab("Material icons");
        material.setContent(new Material());

        Tab dashicons = new Tab("OctIcons");
        dashicons.setContent(new Dashicons());

        Tab weather = new Tab("Weather Icons");
        weather.setContent(new Dashicons());

        Tab fontAwesome = new Tab("FontAwesome");
        fontAwesome.setContent(new FontAwesome());


        tabPane.getTabs().addAll(materialDesign, material, weather, dashicons, fontAwesome);//,
                /*hawconsFilled, hawconsStroke, Ionicons4IOS,
                Ionicons4Logo,Ionicons4Material, Material, MetrizeIcons, Octicons,
                Themify, Websymbols );*/


        container.setCenter(tabPane);
        Scene scene = new Scene(container, 1000, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
