/**
 * Making an Interface with a Short Greeting
 * 
 * @author Michelle Nguyen
 * @version 2024-07-31
 */


// IMPORT STATEMENTS
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


public class GUIDriver extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		// FONTS
		Font tf = new Font ("Arial", 72);		// Title
		Font font1 = new Font("Arial", 18);		// Regular Text
		
		// VERTICAL BOX (Core of the Interface)
		VBox vbox = new VBox(20);		// In parameters, the padding between elements in vbox
		
		// TITLE
		Label title = new Label("Welcome");
		title.setFont(tf);
		
		// STYLING VERTICAL BOX
		vbox.setAlignment(Pos.CENTER);		// Aligns the vbox
		vbox.getChildren().add(title);		// Adds "Welcome" to the vbox
		
		// HORIZONTAL BOX (Input Row)
		HBox hbox = new HBox(10);		// In parameters, the padding between prompt and text field
		hbox.setAlignment(Pos.CENTER);		
		
		// INPUT FIELD
		Label label = new Label("Name:");
		label.setFont(font1);
		hbox.getChildren().add(label);		// Adds prompt
		vbox.getChildren().add(hbox);		// Adds the hbox to the vbox
		
		TextField f1 = new TextField();		// Name input field
		hbox.getChildren().add(f1);			// Add the name text field to the hbox, next to prompt
		
		Button confirm = new Button("Confirm");
		vbox.getChildren().add(confirm);	// Adds the button to the vbox
		
		// BUTTON ACTION (CONFIRM)
		/*
		 * setOnAction() is what should happen when the button is clicked
		 * e -> { ... } is a lambda expression that provides the code for what happens
		 * 
		 * Lambda Expression: "[A short block of code which takes in parameters and returns a value
		 * similar to methods but don't need a name and can be implemented in the body of a method.]"
		 * -- W3Schools
		 */
		Label greeting = new Label("Hello " + f1.getText() + "!");
		confirm.setOnAction(e -> {
			try {
				greeting.setText("Hello " + f1.getText() + "!");
				greeting.setFont(font1);
				greeting.setAlignment(Pos.CENTER);
				vbox.getChildren().add(greeting);
			} catch (Exception f) {}
		});
		
		// FINAL STEPS
		/*
		 * "A stage allows you to insert a scene, which contains the content displayed in the window"
		 * "A scene represents the physical contents of a JavaFX application"
		 */
		Scene scene = new Scene(vbox, 600, 800);	// (Box, Width, Height)
		stage.setScene(scene);						// Adds the scene to the stage
		stage.setTitle("Interface");	// Title of Interface
		stage.show();					// Required for Interface to Launch (1/2)
	}

	public static void main(String[] args) {
		launch(args);	// Required for Interface to Launch (2/2)
	}
}
