package io.github.nateacoffey.Gui;


import io.github.nateacoffey.ConjugationPractice;
import io.github.nateacoffey.InputOutput.TextAreaPrint;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class GuiController {
	
	@FXML private TextArea outputTextArea;
	@FXML private Button helpButton;
	@FXML private TextField inputTextBox;
	
	private ConjugationPractice conjugationPractice;
	private String language;
	private String[] helpText;
	
	private Stage helpDialog() {
		
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setMinWidth(600);
		window.setMinHeight(225);
		
		Button closeButton = new Button("OK");
		closeButton.setOnAction(e -> window.close());
		
		VBox layout = new VBox(10);
		
		for(String s : helpText) {
			
			Label label = new Label();
			label.setText(s);
			label.setFont(new Font(16.0));
			
			layout.getChildren().add(label);
		}
		layout.getChildren().add(closeButton);
		
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		
		return window;
		
	}
	
	@FXML private void showTooltip(ActionEvent event) {
		
		Stage window = helpDialog();
		window.showAndWait();
		
	}
	
	@FXML private void onEnter(ActionEvent event){
		
		conjugationPractice.inputValues(inputTextBox.getText());
		inputTextBox.selectAll();
		
	}
	
	public void setHelp() {
		
		String helpTextFirst = "Using the given verb ending and tense, type the correct conjugation.";
		String antepenultimate = "";
		String helpTextPenultimate = "Type SHOW to show the correct conjugation.";
		String helpTextLast = "Type QUIT to exit the program.";
		
		switch(language) {
		case "SPANISH":
			helpText = new String[7];
			helpText[0] = helpTextFirst;
			helpText[1] = "Assume all ending are regular verbs. Accents matter.";
			helpText[2] = "Windows: alt + (á: 0225 é: 0233 í: 0237 ó: 0243)";
			helpText[3] = "Mac: option + e -> letter\n";
			helpText[4] = antepenultimate;
			helpText[5] = helpTextPenultimate;
			helpText[6] = helpTextLast;
			break;
		case "JAPANESE":
			helpText = new String[5];
			helpText[0] = helpTextFirst;
			helpText[1] = "Assume る refers to 五段動詞 and いる/える refers to 一段動詞.";
			helpText[2] = antepenultimate;
			helpText[3] = helpTextPenultimate;
			helpText[4] = helpTextLast;
			break;
		}
		
	}
	
	public void assignLanguage(String language) {
		this.language = language;
		
		setHelp();
		
		fakeInitialize();
	}
	
	public void fakeInitialize() {
		conjugationPractice = new ConjugationPractice();
		
		//send TextArea for printing
		TextAreaPrint consolePrint = new TextAreaPrint();
		consolePrint.setOutputTextArea(outputTextArea);
		
		//setup ConjugationMap
		conjugationPractice.setup(language);
	}
}











