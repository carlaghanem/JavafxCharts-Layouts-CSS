package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;

public class StackandFlowDemo extends Application {
    
    public static void main(String[] args) {
        
        Application.launch(args);
    }
    
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("StackPane and FlowPane");
        
        Group root = new Group();
        Scene scene = new Scene(root, 700, 300, Color.WHITE);
        
        Text txt1 = new Text("FlowPane");
        txt1.setX(180);
        txt1.setY(20);
        txt1.setFill(Color.BLACK);
        txt1.setFont(Font.font("Bell Gothic Std", FontWeight.BOLD, 15));
        
        Text txt2 = new Text("StackPane");
        txt2.setX(500);
        txt2.setY(20);
        txt2.setFill(Color.BLACK);
        txt2.setFont(Font.font("Bell Gothic Std", FontWeight.BOLD, 15));
        
        root.getChildren().addAll(txt1,txt2);
        
        Rectangle r1 = new Rectangle(150,150);
        r1.setFill(Color.YELLOW);
        
        Rectangle r2 = new Rectangle(100,100);
        r2.setFill(Color.CYAN);
        
        Rectangle r3 = new Rectangle(50,50);
        r3.setFill(Color.BLACK);
        
        FlowPane fl = new FlowPane();
        fl.setLayoutY(30);
        fl.setAlignment(Pos.CENTER);
        fl.setPrefSize(400, 270);
        fl.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,
                                                          null,new BorderWidths(3))));
        fl.getChildren().addAll(r1,r2,r3);

        Rectangle r4 = new Rectangle(150,150);
        r4.setFill(Color.YELLOW);
        
        Rectangle r5 = new Rectangle(100,100);
        r5.setFill(Color.CYAN);
        
        Rectangle r6 = new Rectangle(50,50);
        r6.setFill(Color.BLACK);
        
        StackPane st = new StackPane();
        st.setLayoutX(400);
        st.setLayoutY(30);
        st.setAlignment(Pos.CENTER);
        st.setPrefSize(300, 270);
        st.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,
                                                          null,new BorderWidths(3))));
        st.getChildren().addAll(r4,r5,r6);
        
        root.getChildren().addAll(fl,st);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}