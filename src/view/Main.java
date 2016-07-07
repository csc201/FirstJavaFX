package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class Main extends Application {

    private static Stage primaryStage;

    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        ScrollBar verScrollBar = new ScrollBar();
        ScrollBar horScrollBar = new ScrollBar();

        //Group root = new Group();
        Scene mainScene = new Scene(root, bounds.getWidth(),bounds.getHeight());
/*
        TextField listOfTextField[] = new TextField[100];
        GridPane listPane = new GridPane();
        //BorderPane borderPane = new BorderPane();
        verScrollBar.setOrientation(Orientation.VERTICAL);
        verScrollBar.setLayoutX(mainScene.getWidth());
        verScrollBar.setMax(3000);
        verScrollBar.setMin(0);
        verScrollBar.setUnitIncrement(10);
        verScrollBar.setPrefHeight(mainScene.getHeight());
        horScrollBar.setLayoutY(mainScene.getHeight());
        horScrollBar.setMax(3000);
        horScrollBar.setMin(0);
        horScrollBar.setUnitIncrement(10);
        horScrollBar.setPrefWidth(mainScene.getWidth());

        for(int i=0; i<listOfTextField.length; i++) {
            listOfTextField[i] = new TextField("textfieldsdfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff "+ i);
            listOfTextField[i].setMinWidth(3000);
            listPane.add(listOfTextField[i],0,i);
        }
*/
 /*       verScrollBar.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println(-newValue.doubleValue());
                listPane.setLayoutY(-newValue.doubleValue());
            }
        });

        horScrollBar.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println(-newValue.doubleValue());
                listPane.setLayoutX(-newValue.doubleValue());
            }
        });
        root.getChildren().addAll(listPane,verScrollBar,horScrollBar);
*/
        /*
        verScrollBar.setLayoutX(mainScene.getWidth()-verScrollBar.getWidth());
        verScrollBar.setMin(0);
        verScrollBar.setOrientation(Orientation.VERTICAL);
        verScrollBar.setPrefHeight(180);
        verScrollBar.setMax(360);

        horScrollBar.setOrientation(Orientation.HORIZONTAL);

*/
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(mainScene);
        primaryStage.setFullScreen(true);
//        primaryStage.setX(bounds.getMinX());
//        primaryStage.setY(bounds.getMinY());
//        primaryStage.setWidth(bounds.getWidth());
//        primaryStage.setHeight(bounds.getHeight());
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
