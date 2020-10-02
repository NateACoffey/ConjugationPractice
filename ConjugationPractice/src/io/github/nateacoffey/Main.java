package io.github.nateacoffey;


import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("LanguageSelector/LanguageSelector.fxml"));
			Scene scene = new Scene(root, 800, 450);
			primaryStage.setTitle("Conjugation Practice");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			primaryStage.setOnCloseRequest(e -> closeProgram(primaryStage));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void closeProgram(Stage primaryStage) {
		primaryStage.close();
	}
	
	public static void main(String args[]) {
		
		launch(args);
		
	}
	
}