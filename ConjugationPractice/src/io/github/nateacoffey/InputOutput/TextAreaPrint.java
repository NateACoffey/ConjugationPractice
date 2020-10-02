package io.github.nateacoffey.InputOutput;

import javafx.scene.control.TextArea;

public class TextAreaPrint {
	
	private static TextArea outputTextArea = null;
	
	public void setOutputTextArea(TextArea outputTextArea) {
		TextAreaPrint.outputTextArea = outputTextArea;
	}
	
	public void printAnswer(String answer) {

		outputTextArea.appendText("The correct conjugation is: " + answer + "\n\n");
		
	}
	
	public void println(String[] tenseAndEnding) {
		
		outputTextArea.appendText("＊Conjugate -" + tenseAndEnding[1] + " into: " + tenseAndEnding[0] + "＊\n");
	}
	
	public void println(String input, boolean correct) {
		
		outputTextArea.appendText(input + " is " + ((correct) ? "correct!\n\n" : "incorrect. \n"));
	}
	
}
