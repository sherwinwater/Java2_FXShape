package content;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShapeStage extends Stage{
    
    private Rectangle r1 = new Rectangle(30, 50, 150, 200);
    private Pane pane = new Pane(r1);
    private Scene scene = new Scene(pane, 400, 600);
    
    public ShapeStage(){
        setRectangle();
        setScene(scene);
    }
    
    
    private void setRectangle(){
        r1.setFill(Color.AQUA);
    }
}
