package io.github.nateacoffey;


import java.io.IOException;
import java.io.PrintStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	private static PrintStream originalOut = System.out;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("Gui/Gui.fxml"));
			Scene scene = new Scene(root, 800, 450);
			
			primaryStage.setTitle("Conjugation Practice");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String args[]) {
		
		launch(args);
		
		System.setOut(originalOut);
		
	}
	
}