package io.github.nateacoffey.Gui;


import io.github.nateacoffey.ConjugationPractice;
import io.github.nateacoffey.InputOutput.TextAreaPrint;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class GuiController {
	
	@FXML private TextArea outputTextArea;
	@FXML private Button helpButton;
	@FXML private TextField inputTextBox;
	@FXML private ContextMenu helpText;
	private ConjugationPractice conjugationPractice;
	
	
	@FXML private void onEnter(ActionEvent event){
		
		conjugationPractice.inputValues(inputTextBox.getText());
		inputTextBox.selectAll();
		
	}
	
	public void initialize() {
		conjugationPractice = new ConjugationPractice();
		
		
		//setup button to show help box
		ContextMenu contextMenu = new ContextMenu();
		
		String tooltipText = "Using the given verb ending and tense, type the correct conjugation.\n"
				+ "Assume る refers to 五段動詞 and いる/える refers to 一段動詞.\n"
				+ "Type SHOW to show the correct conjugation.\n"
				+ "Type QUIT to exit the program.";
		
		MenuItem tooltip = new MenuItem(tooltipText);
		
		contextMenu.getItems().add(tooltip);
	
		helpButton.setContextMenu(contextMenu);
		
		
		TextAreaPrint consolePrint = new TextAreaPrint();
		consolePrint.setOutputTextArea(outputTextArea);
		
		
		//setup ConjugationMap
		conjugationPractice.setup();
	}
}











