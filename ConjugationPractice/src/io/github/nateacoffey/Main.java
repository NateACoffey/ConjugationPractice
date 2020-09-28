package io.github.nateacoffey;

public class Main {
	
    public static void main(String args[]) {
    	
    	System.out.println("Loading...\n");
    	
    	Thread thread = new Thread(new ConjugationPractice());
    	
    	thread.start();
    	
    }
    
}