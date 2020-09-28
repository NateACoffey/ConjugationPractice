package io.github.nateacoffey.Console;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConsoleReader {
	
	
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	private String input = "";
	
	
	public void setString() {
		try {
			
			input = reader.readLine();
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public String getInput() {
		return input;
	}
	
}
