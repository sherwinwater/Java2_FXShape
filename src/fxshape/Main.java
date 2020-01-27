package fxshape;

import content.ShapeStage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Main extends Application {
    
    private Rectangle rect1 = new Rectangle(30, 50, 150, 200);
    private Pane pane = new Pane(rect1);
    private Scene scene = new Scene(pane, 500, 500);
    
    @Override
    public void start(Stage primaryStage) {
        rect1.setStrokeWidth(5);
        rect1.setStroke(Color.RED);
        rect1.setFill(Color.BLUE);
        
        
        ShapeStage sStage = new ShapeStage();
        sStage.show();
        
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("FXShape Homework");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
