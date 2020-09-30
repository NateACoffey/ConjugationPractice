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
	
	
	private Stage helpDialog() {
		
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setMinWidth(600);
		window.setMinHeight(225);
		
		Label label = new Label();
		Label label2 = new Label();
		Label label3 = new Label();
		Label label4 = new Label();
		
		label.setText("Using the given verb ending and tense, type the correct conjugation.");
		label.setFont(new Font(16.0));
		label2.setText("Assume る refers to 五段動詞 and いる/える refers to 一段動詞.");
		label2.setFont(new Font(16.0));
		label3.setText("Type SHOW to show the correct conjugation.");
		label3.setFont(new Font(16.0));
		label4.setText("Type QUIT to exit the program.");
		label4.setFont(new Font(16.0));
		
		Button closeButton = new Button("OK");
		closeButton.setOnAction(e -> window.close());
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, label2, label3, label4, closeButton);
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
	
	public void initialize() {
		conjugationPractice = new ConjugationPractice();
		
		//send TextArea for printing
		TextAreaPrint consolePrint = new TextAreaPrint();
		consolePrint.setOutputTextArea(outputTextArea);
		
		
		//setup ConjugationMap
		conjugationPractice.setup();
	}
}











