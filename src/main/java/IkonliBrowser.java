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

        Tab materialDesign = new Tab("Material Design",
                new Label("("+org.kordamp.ikonli.materialdesign.MaterialDesign.values().length+")"));
        materialDesign.setContent(new MaterialDesign());

        Tab dashicons = new Tab("Dashicons");
        dashicons.setContent(new Dashicons());

        Tab fontAwesome = new Tab("FontAwesome");
        fontAwesome.setContent(new FontAwesome());

        Tab hawconsFilled = new Tab("HawconsFilled");
        hawconsFilled.setContent(new HawconsFilled());

        Tab hawconsStroke  = new Tab("HawconsStroke");
        hawconsStroke.setContent(new HawconStroke());

        Tab Ionicons4IOS  = new Tab("HawconsStroke");
        Ionicons4IOS.setContent(new Ionicons4IOS());

        Tab Ionicons4Logo  = new Tab("Ionicons4Logo");
        Ionicons4Logo.setContent(new Ionicons4Logo());

        Tab Ionicons4Material  = new Tab("Ionicons4Material");
        Ionicons4Material.setContent(new Ionicons4Material());

        Tab Material  = new Tab("Material");
        Material.setContent(new Material());

        Tab MetrizeIcons  = new Tab("MetrizeIcons");
        MetrizeIcons.setContent(new MetrizeIcons());

        Tab Octicons  = new Tab("Octicons");
        Octicons.setContent(new Octicons());

        Tab Themify  = new Tab("Themify");
        Themify.setContent(new Themify());

        Tab Websymbols  = new Tab("Websymbols");
        Websymbols.setContent(new Websymbols());

        tabPane.getTabs().addAll(materialDesign, dashicons, fontAwesome,
                hawconsFilled, hawconsStroke, Ionicons4IOS,
                Ionicons4Logo,Ionicons4Material, Material, MetrizeIcons, Octicons,
                Themify, Websymbols );


        container.setCenter(tabPane);
        Scene scene = new Scene(container, 1000, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
