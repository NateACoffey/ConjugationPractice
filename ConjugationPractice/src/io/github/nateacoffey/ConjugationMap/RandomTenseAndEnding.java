package io.github.nateacoffey.ConjugationMap;

import io.github.nateacoffey.ConjugationMap.Japanese.JapaneseMapMaker;

public class RandomTenseAndEnding {
	
	public String[] getRandomTenseandEnding() {
		
		JapaneseMapMaker mapMaker = new JapaneseMapMaker();
		
		String[] listOfTenses = mapMaker.getVerbTenses();
		String[] listOfEndings = mapMaker.getVerbEndings();
		
		//grabs random tense from MapMaker.java array and a random verb ending
		String tense = listOfTenses[(int) (Math.random() * listOfTenses.length)];
		String ending = listOfEndings[(int) (Math.random() * listOfEndings.length)];
		
		
		return new String[] {tense, ending};
	}
	
}
