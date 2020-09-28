package io.github.nateacoffey.Console;

public class ConsolePrint {
	
	public void printAnswer(String answer) {
		System.out.println("The correct conjugation is: " + answer);
		System.out.println();
	}
	
	public void println(String[] tenseAndEnding) {
		
		System.out.println("＊＊Conjugate " + tenseAndEnding[1] + " into: " + tenseAndEnding[0] + "＊＊");
		
	}
	
	public void println(boolean correct) {
		
		System.out.print("That is " + ((correct) ? "correct!\n\n" : "incorrect. "));
		
	}
	
	public void open() {
		System.out.println("Using the given verb ending, type the correct conjugation to the verb tense.");
		System.out.println("Assume る refers to 五段動詞 and いる/える refers to 一段動詞");
		System.out.println("Type SHOW to show the correct conjugation.");
		System.out.println("Type QUIT to exit the program.");
		System.out.println("---------------------------\n");
		
	}
	
	public void exit() {
		System.out.println("Thanks for playing!");
	}
	
}
