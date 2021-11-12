package Controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = FXMLLoader.load(Main.class.getResource("/View/Main.fxml"));
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("MainScreen");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
//	public Main() {
//		
//	}
	public static void main(String[] args) {
		launch(args);
		
		
	}
}
