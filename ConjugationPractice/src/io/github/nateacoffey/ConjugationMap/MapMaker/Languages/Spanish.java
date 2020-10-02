package io.github.nateacoffey.ConjugationMap.MapMaker.Languages;

import java.util.Map;

import io.github.nateacoffey.ConjugationMap.MapMaker.Language;

import java.util.HashMap;

public class Spanish extends Language {
	private Map<String, Map<String, String>> verbTenseMap;
	
	private final String[] verbTenses =	{	"present first-person singular", "present second-person singular", "present third-person singular",
											"present first-person plural", "present second-person plural", "present first-person plural",
											"past preterite first-person singular", "past preterite second-person singular", "past preterite third-person singular",
											"past preterite first-person plural", "past preterite second-person plural", "past preterite first-person plural",
											"past imperfect first-person singular", "past imperfect second-person singular", "past imperfect third-person singular",
											"past imperfect first-person plural", "past imperfect second-person plural", "past imperfect first-person plural",
											"future first-person singular", "future second-person singular", "future third-person singular",
											"future first-person plural", "future second-person plural", "future first-person plural",
											"conditional first-person singular", "conditional second-person singular", "conditional third-person singular",
											"conditional first-person plural", "conditional second-person plural", "conditional first-person plural",
											"present subjunctive first-person singular", "present subjunctive second-person singular", "present subjunctive third-person singular",
											"present subjunctive first-person plural", "present subjunctive second-person plural", "present subjunctive first-person plural",
											"past subjunctive first-person singular", "past subjunctive second-person singular", "past subjunctive third-person singular",
											"past subjunctive first-person plural", "past subjunctive second-person plural", "past subjunctive first-person plural"
											};
	
	private final String[] verbEndings = {"ar", "er", "ir"};
	
	public Spanish() {
		super.verbTenses = this.verbTenses;
		super.verbEndings = this.verbEndings;
	}
	
	@Override
	public Map<String, Map<String, String>> fillMap(){
		
		//correct conjugations
		final String[] presentFirstPersonSingular = {"o", "o", "o"};
		final String[] presentSecondPersonSingular = {"as", "es", "es"};
		final String[] presentThirdPersonSingular = {"a", "e", "e"};
		final String[] presentFirstPersonPlural = {"amos", "emos", "imos"};
		final String[] presentSecondPersonPlural = {"ais", "eis", "is"};
		final String[] presentThirdPersonPlural = {"an", "en", "en"};
		final String[] pastPreteriteFirstPersonSingular = {"e", "i", "i"};
		final String[] pastPreteriteSecondPersonSingular = {"aste", "iste", "iste"};
		final String[] pastPreteriteThirdPersonSingular = {"o", "o", "o"};
		final String[] pastPreteriteFirstPersonPlural = {"amos", "emos", "imos"};
		final String[] pastPreteriteSecondPersonPlural = {"asteis", "isteis", "isteis"};
		final String[] pastPreteriteThirdPersonPlural = {"aron", "ieron", "ieron"};
		final String[] pastImperfectFirstPersonSingular = {"aba", "ia", "ia"};
		final String[] pastImperfectSecondPersonSingular = {"abas", "ias", "ias"};
		final String[] pastImperfectThirdPersonSingular = {"aba", "ia", "ia"};
		final String[] pastImperfectFirstPersonPlural = {"abamos", "iamos", "iamos"};
		final String[] pastImperfectSecondPersonPlural = {"abais", "abais", "abais"};
		final String[] pastImperfectThirdPersonPlural = {"aban", "ian", "ian"};
		final String[] futureFirstPersonSingular = {"are", "ere", "ire"};
		final String[] futureSecondPersonSingular = {"aras", "eras", "iras"};
		final String[] futureThirdPersonSingular = {"ara", "era", "ira"};
		final String[] futureFirstPersonPlural = {"aremos", "eremos", "iremos"};
		final String[] futureSecondPersonPlural = {"arais", "erais", "irais"};
		final String[] futureThirdPersonPlural = {"aran", "eran", "iran"};
		final String[] conditionalFirstPersonSingular = {"aria", "eria", "iria"};
		final String[] conditionalSecondPersonSingular = {"arias", "erias", "irias"};
		final String[] conditionalThirdPersonSingular = {"aria", "eria", "iria"};
		final String[] conditionalFirstPersonPlural = {"ariamos", "eriamos", "iriamos"};
		final String[] conditionalSecondPersonPlural = {"ariais", "eriais", "iriais"};
		final String[] conditionalThirdPersonPlural = {"arian", "erian", "irian"};
		final String[] presentSubjunctiveFirstPersonSingular = {"e", "a", "a"};
		final String[] presentSubjunctiveSecondPersonSingular = {"es", "as", "as"};
		final String[] presentSubjunctiveThirdPersonSingular = {"e", "a", "a"};
		final String[] presentSubjunctiveFirstPersonPlural = {"emos", "amos", "amos"};
		final String[] presentSubjunctiveSecondPersonPlural = {"eis", "ais", "ais"};
		final String[] presentSubjunctiveThirdPersonPlural = {"en", "an", "an"};
		final String[] pastSubjunctiveFirstPersonSingular = {"ara", "iera", "iera"};
		final String[] pastSubjunctiveSecondPersonSingular = {"aras", "ieras", "ieras"};
		final String[] pastSubjunctiveThirdPersonSingular = {"ara", "iera", "iera"};
		final String[] pastSubjunctiveFirstPersonPlural = {"aramos", "ieramos", "ieramos"};
		final String[] pastSubjunctiveSecondPersonPlural = {"areis", "ierais", "ierais"};
		final String[] pastSubjunctiveThirdPersonPlural = {"aran", "ieran", "ieran"};
		
		
		//collection of the correct conjugations
		/****MUST BE THE SAME ORDER AS verbTenses****/
		String[][] tenseConjugations = {presentFirstPersonSingular, presentSecondPersonSingular, presentThirdPersonSingular,
										presentFirstPersonPlural, presentSecondPersonPlural,presentThirdPersonPlural,
										pastPreteriteFirstPersonSingular,pastPreteriteSecondPersonSingular,
										pastPreteriteThirdPersonSingular,pastPreteriteFirstPersonPlural,
										pastPreteriteSecondPersonPlural,pastPreteriteThirdPersonPlural,
										pastImperfectFirstPersonSingular,pastImperfectSecondPersonSingular,
										pastImperfectThirdPersonSingular,pastImperfectFirstPersonPlural,
										pastImperfectSecondPersonPlural,pastImperfectThirdPersonPlural,
										futureFirstPersonSingular,futureSecondPersonSingular,futureThirdPersonSingular,
										futureFirstPersonPlural,futureSecondPersonPlural,futureThirdPersonPlural,
										conditionalFirstPersonSingular,conditionalSecondPersonSingular,conditionalThirdPersonSingular,
										conditionalFirstPersonPlural,conditionalSecondPersonPlural,conditionalThirdPersonPlural,
										presentSubjunctiveFirstPersonSingular, presentSubjunctiveSecondPersonSingular, presentSubjunctiveThirdPersonSingular,
										presentSubjunctiveFirstPersonPlural, presentSubjunctiveSecondPersonPlural, presentSubjunctiveThirdPersonPlural,
										pastSubjunctiveFirstPersonSingular, pastSubjunctiveSecondPersonSingular, pastSubjunctiveThirdPersonSingular,
										pastSubjunctiveFirstPersonPlural, pastSubjunctiveSecondPersonPlural, pastSubjunctiveThirdPersonPlural
										};
		
		
		verbTenseMap = new HashMap<String, Map<String, String>>();
		
		//build entire map of conjugations and their related tenses
		for(int i = 0; i < verbTenses.length; ++i) {
			verbTenseMap.put(verbTenses[i], buildConjugationMap(tenseConjugations[i]));
		}
		
		return verbTenseMap;
	}
	
}
