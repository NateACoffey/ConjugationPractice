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
											"past subjunctive first-person plural", "past subjunctive second-person plural", "past subjunctive first-person plural",
											"present progressive", "past perfect participle"
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
		final String[] presentSecondPersonPlural = {"áis", "éis", "ís"};
		final String[] presentThirdPersonPlural = {"an", "en", "en"};
		
		final String[] pastPreteriteFirstPersonSingular = {"é", "í", "í"};
		final String[] pastPreteriteSecondPersonSingular = {"aste", "iste", "iste"};
		final String[] pastPreteriteThirdPersonSingular = {"ó", "ió", "ió"};
		final String[] pastPreteriteFirstPersonPlural = {"amos", "imos", "imos"};
		final String[] pastPreteriteSecondPersonPlural = {"asteis", "isteis", "isteis"};
		final String[] pastPreteriteThirdPersonPlural = {"aron", "ieron", "ieron"};
		
		final String[] pastImperfectFirstPersonSingular = {"aba", "ía", "ía"};
		final String[] pastImperfectSecondPersonSingular = {"abas", "ías", "ías"};
		final String[] pastImperfectThirdPersonSingular = {"aba", "ía", "ía"};
		final String[] pastImperfectFirstPersonPlural = {"ábamos", "íamos", "íamos"};
		final String[] pastImperfectSecondPersonPlural = {"abais", "íais", "íais"};
		final String[] pastImperfectThirdPersonPlural = {"aban", "ían", "ían"};
		
		final String[] futureFirstPersonSingular = {"aré", "eré", "iré"};
		final String[] futureSecondPersonSingular = {"arás", "erás", "irás"};
		final String[] futureThirdPersonSingular = {"ará", "erá", "irá"};
		final String[] futureFirstPersonPlural = {"aremos", "eremos", "iremos"};
		final String[] futureSecondPersonPlural = {"aráis", "eráis", "iráis"};
		final String[] futureThirdPersonPlural = {"arán", "erán", "irán"};
		
		final String[] conditionalFirstPersonSingular = {"aría", "ería", "iría"};
		final String[] conditionalSecondPersonSingular = {"arías", "erías", "irías"};
		final String[] conditionalThirdPersonSingular = {"aría", "ería", "iría"};
		final String[] conditionalFirstPersonPlural = {"aríamos", "eríamos", "iríamos"};
		final String[] conditionalSecondPersonPlural = {"aríais", "eríais", "iríais"};
		final String[] conditionalThirdPersonPlural = {"arían", "erían", "irían"};
		
		final String[] presentSubjunctiveFirstPersonSingular = {"e", "a", "a"};
		final String[] presentSubjunctiveSecondPersonSingular = {"es", "as", "as"};
		final String[] presentSubjunctiveThirdPersonSingular = {"e", "a", "a"};
		final String[] presentSubjunctiveFirstPersonPlural = {"emos", "amos", "amos"};
		final String[] presentSubjunctiveSecondPersonPlural = {"éis", "áis", "áis"};
		final String[] presentSubjunctiveThirdPersonPlural = {"en", "an", "an"};
		
		final String[] pastSubjunctiveFirstPersonSingular = {"ara", "iera", "iera"};
		final String[] pastSubjunctiveSecondPersonSingular = {"aras", "ieras", "ieras"};
		final String[] pastSubjunctiveThirdPersonSingular = {"ara", "iera", "iera"};
		final String[] pastSubjunctiveFirstPersonPlural = {"áramos", "iéramos", "iéramos"};
		final String[] pastSubjunctiveSecondPersonPlural = {"areis", "oerais", "oerais"};
		final String[] pastSubjunctiveThirdPersonPlural = {"aran", "ieran", "ieran"};
		
		final String[] presentPregressive = {"ando", "iendo", "iendo"};
		final String[] pastPerfectParticiple = {"ado", "ido", "ido"};
		
		
		
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
										pastSubjunctiveFirstPersonPlural, pastSubjunctiveSecondPersonPlural, pastSubjunctiveThirdPersonPlural,
										presentPregressive, pastPerfectParticiple
										};
		
		
		verbTenseMap = new HashMap<String, Map<String, String>>();
		
		//build entire map of conjugations and their related tenses
		for(int i = 0; i < verbTenses.length; ++i) {
			verbTenseMap.put(verbTenses[i], buildConjugationMap(tenseConjugations[i]));
		}
		
		return verbTenseMap;
	}
	
}
