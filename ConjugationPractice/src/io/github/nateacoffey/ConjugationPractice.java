package io.github.nateacoffey;


import java.util.Map;

import io.github.nateacoffey.ConjugationMap.RandomTenseAndEnding;
import io.github.nateacoffey.ConjugationMap.MapMaker.Language;
import io.github.nateacoffey.ConjugationMap.MapMaker.Languages.Japanese;
import io.github.nateacoffey.ConjugationMap.MapMaker.Languages.Spanish;
import io.github.nateacoffey.InputOutput.CompareInputToCorrect;
import io.github.nateacoffey.InputOutput.TextAreaPrint;
import javafx.application.Platform;


public class ConjugationPractice {
	
	private Map<String, Map<String, String>> conjugatedTenses;
	private RandomTenseAndEnding randomTenseAndEnding = new RandomTenseAndEnding();
	private String[] tenseAndEnding;
	private CompareInputToCorrect compareInputToCorrect = new CompareInputToCorrect();
	private TextAreaPrint consolePrint = new TextAreaPrint();
	private Language mapMaker;
	
	private int attempts = 0;
	private String answer;
	private String language;
	
	public void setup(String language) {
		
		this.language = language;
		
		if(mapMaker != null) {
			mapMaker = null;
		}
		
		switch(this.language) {
			case "SPANISH":
				mapMaker = new Spanish();
				break;
			case "JAPANESE":
				mapMaker = new Japanese();
				break;
		}
		
		conjugatedTenses = mapMaker.fillMap(); 
		
		setAndPrintNewRandomTenseAndEnding();
		
	}
	
	private void setAndPrintNewRandomTenseAndEnding() {
		
		tenseAndEnding = randomTenseAndEnding.getRandomTenseandEnding(language);
		
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
