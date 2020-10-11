package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class VBoxDemo extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			 // Create the Label for the Name
	        Label nameLbl = new Label("Name:");
	        // Create the TextField for the Name
	        TextField nameFld = new TextField();
	        // Create the Label for the Password
	        Label passwordLbl = new Label("Password:");
	        // Create the TextField for the Password
	        TextField passwordFld = new TextField();
	        // Create the Login-Button
	        Button loginBtn = new Button("Login");
	        
		    //Instantiating the HBox class  
		    VBox hbox = new VBox();    
		      
		    //Setting the space between the nodes of a HBox pane 
		    hbox.setSpacing(10);    
		      
		    //Setting the margin to the nodes 
		    hbox.setMargin(nameLbl, new Insets(20, 5, 20, 20)); 
		    hbox.setMargin(nameFld, new Insets(20, 20, 20, 5)); 
		    hbox.setMargin(passwordLbl, new Insets(20, 5, 20, 20));
		    hbox.setMargin(passwordFld, new Insets(20, 20, 20, 5));  
		    hbox.setMargin(loginBtn, new Insets(20, 20, 20, 20));  
		      
		    // Add the children to the HBox
		    hbox.getChildren().addAll(nameLbl, nameFld, passwordLbl, passwordFld, loginBtn);
		    
		    Scene scene = new Scene(hbox);
		    // Set the title of the Stage
		    primaryStage.setTitle("VBox Login Example");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
