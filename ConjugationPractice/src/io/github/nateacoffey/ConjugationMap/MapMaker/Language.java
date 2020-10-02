package io.github.nateacoffey.ConjugationMap.MapMaker;

import java.util.HashMap;
import java.util.Map;

public abstract class Language {
	
	protected String[] verbEndings;
	protected String[] verbTenses;
	
	
	public abstract Map<String, Map<String, String>> fillMap();
	
	//Builds inner map of conjugations
	protected Map<String, String> buildConjugationMap(String[] conjugation){
		
		Map<String, String> verbEndingConjugations = new HashMap<String, String>();
		
		for(int i = 0; i < verbEndings.length; ++i){
			verbEndingConjugations.put(verbEndings[i], conjugation[i]);
			}
		
		return verbEndingConjugations;
	}
	
	public String[] getVerbEndings() {
		return verbEndings;
	}
	
	public String[] getVerbTenses() {
		return verbTenses;
	}
	
}
