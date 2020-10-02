package io.github.nateacoffey.ConjugationMap;

import io.github.nateacoffey.ConjugationMap.MapMaker.Language;
import io.github.nateacoffey.ConjugationMap.MapMaker.Languages.Japanese;
import io.github.nateacoffey.ConjugationMap.MapMaker.Languages.Spanish;

public class RandomTenseAndEnding {
	
	private Language mapMaker;
	
	public void setLanguage(String language) {
		switch(language) {
			case "JAPANESE":
				mapMaker = new Japanese();
				break;
			case "SPANISH":
				mapMaker = new Japanese();
				break;
		}
	}
	
	public String[] getRandomTenseandEnding(String language) {
		
		switch(language) {
			case "SPANISH":
				mapMaker = new Spanish();
				break;
			case "JAPANESE":
				mapMaker = new Japanese();
				break;
		}
		
		String[] listOfTenses = mapMaker.getVerbTenses();
		String[] listOfEndings = mapMaker.getVerbEndings();
		
		//grabs random tense from MapMaker.java array and a random verb ending
		String tense = listOfTenses[(int) (Math.random() * listOfTenses.length)];
		String ending = listOfEndings[(int) (Math.random() * listOfEndings.length)];
		
		
		return new String[] {tense, ending};
	}
	
}
