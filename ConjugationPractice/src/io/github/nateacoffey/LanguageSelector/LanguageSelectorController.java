package io.github.nateacoffey.LanguageSelector;

import java.io.IOException;

import io.github.nateacoffey.Gui.GuiController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LanguageSelectorController {
	
	@FXML private ChoiceBox<String> choiceBox;
	@FXML private AnchorPane content;
	
	public void SwitchScenes(ActionEvent event) {
		
		if(choiceBox.getValue() != null) {
			
			String language = choiceBox.getValue().toString();
			
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/io/github/nateacoffey/Gui/Gui.fxml"));
				Parent root = loader.load();
				
				Scene guiControllerScene = new Scene(root);
				
				//Sends data to the controller before showing
				GuiController guiController = loader.getController();
				guiController.assignLanguage(language);
				guiController.setHelp();
				
				Node node = (Node) event.getSource();
				Stage stage = (Stage) node.getScene().getWindow();
				
				
				stage.setScene(guiControllerScene);
				stage.show();
				
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	}
	
	public void initialize() {
		
        String[] availableLanguage = {"SPANISH", "JAPANESE"};
        
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll(availableLanguage);
        
        choiceBox.getItems().addAll(list);
        choiceBox.setStyle("-fx-font-size:20; -fx-text-alignment:center");
        
	}
	
}
