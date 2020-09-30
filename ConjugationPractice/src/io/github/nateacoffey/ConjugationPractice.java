package io.github.nateacoffey;


import java.util.Map;

import io.github.nateacoffey.ConjugationMap.RandomTenseAndEnding;
import io.github.nateacoffey.ConjugationMap.Japanese.JapaneseMapMaker;
import io.github.nateacoffey.InputOutput.CompareInputToCorrect;
import io.github.nateacoffey.InputOutput.TextAreaPrint;
import javafx.application.Platform;


public class ConjugationPractice {
	
	private Map<String, Map<String, String>> conjugatedTenses;
	private RandomTenseAndEnding randomTenseAndEnding = new RandomTenseAndEnding();
	private String[] tenseAndEnding;
	private CompareInputToCorrect compareInputToCorrect = new CompareInputToCorrect();
	private TextAreaPrint consolePrint = new TextAreaPrint();
	
	private int attempts = 0;
	private String answer;
	
	
	public void setup() {
		
		JapaneseMapMaker mapMaker = new JapaneseMapMaker();
		conjugatedTenses = mapMaker.fillMap(); 
		
		setAndPrintNewRandomTenseAndEnding();
		
	}
	
	private void setAndPrintNewRandomTenseAndEnding() {
		
		tenseAndEnding = randomTenseAndEnding.getRandomTenseandEnding();
		answer = conjugatedTenses.get(tenseAndEnding[0]).get(tenseAndEnding[1]);
		
		consolePrint.println(tenseAndEnding);
		
	}
	
	public void inputValues(String input) {
		
		boolean correct = false;
		
		
		if(input.toLowerCase().equals("show") || input.toLowerCase().equals("answer")) {
			//auto-fail attempts
			attempts = 3;
			
		}else if(input.toLowerCase().equals("exit") || input.toLowerCase().equals("quit")) {
			//terminate program
			Platform.exit();
			
		}else{
			correct = compareInputToCorrect.equals(input, answer);
			
			consolePrint.println(input, correct);
			++attempts;
		}
		
		
		if((attempts >= 3 && !correct) || correct) {
			
			if(!correct) consolePrint.printAnswer(answer);
			
			setAndPrintNewRandomTenseAndEnding();
			attempts = 0;
			
		}
		
	}
}
