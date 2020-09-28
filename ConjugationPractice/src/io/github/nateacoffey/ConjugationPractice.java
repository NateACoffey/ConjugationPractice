package io.github.nateacoffey;


import java.util.Map;

import io.github.nateacoffey.Console.ConsolePrint;
import io.github.nateacoffey.Console.ConsoleReader;
import io.github.nateacoffey.Japanese.JapaneseMapMaker;


public class ConjugationPractice implements Runnable {
	
	private Map<String, Map<String, String>> conjugatedTenses;
	private RandomTenseAndEnding randomTenseAndEnding = new RandomTenseAndEnding();
	private String[] tenseAndEnding;
	private CompareInputToCorrect compareInputToCorrect = new CompareInputToCorrect();
	private ConsoleReader consoleReader = new ConsoleReader();
	private ConsolePrint consolePrint = new ConsolePrint();
	
	public void run() {
		
		JapaneseMapMaker mapMaker = new JapaneseMapMaker();
		conjugatedTenses = mapMaker.fillMap(); 
		
		//prints instructions
		consolePrint.open();
		
		
		boolean quit = false;
		
		while(!quit) {
			//grabs and prints random tense and verb ending
			tenseAndEnding = randomTenseAndEnding.getRandomTenseandEnding();
			consolePrint.println(tenseAndEnding);
			
			
			String answer = conjugatedTenses.get(tenseAndEnding[0]).get(tenseAndEnding[1]);
			boolean correct = false;
			int tries = 0;
			
			//loops until user reach 3 tries or until gets the answer correct
			while(!correct && tries < 3) {
				
				//waits for user input
				consoleReader.setString();
				String input = consoleReader.getInput();
				
				
				if(input.toLowerCase().equals("show")) {
					consolePrint.printAnswer(answer);
					tries = 0;
					break;
				}
				if(input.toLowerCase().equals("exit") || input.toLowerCase().equals("quit")) {
					consolePrint.exit();
					quit = true;
					break;
				}
				
				
				correct = compareInputToCorrect.equals(input, answer);
				
				consolePrint.println(correct);
				++tries;
			}
			
			//prints the answer if the user was not successful
			if(tries >= 3 && correct == false) {
				System.out.println();
				consolePrint.printAnswer(answer);
			}
			
			tries = 0;
		}
	}
}
