package io.github.nateacoffey.ConjugationMap.MapMaker.Languages;

import java.util.Map;

import io.github.nateacoffey.ConjugationMap.MapMaker.Language;

import java.util.HashMap;

public class Japanese extends Language {
	private Map<String, Map<String, String>> verbTenseMap;
	
	private final String[] verbTenses =	{	"present polite", "present negative plain", "present negative polite",
											"past plain", "past polite", "past negative plain", "past negative polite",
											"conditional", "conditional negative", "te form",
											"volitional plain", "volitional polite",
											"potential plain", "potential polite", "potential negative plain", "potential negative polite",
											"causative plain", "causative polite", "causative negative plain", "causative negative polite"
											};
	
	private final String[] verbEndings = {"う", "く", "ぐ", "す", "つ", "ぬ", "ぶ", "む", "る", "いる", "える"};
	
	public Japanese() {
		super.verbTenses = this.verbTenses;
		super.verbEndings = this.verbEndings;
	}
	
	@Override
	public Map<String, Map<String, String>> fillMap(){
		
		//correct conjugations
		final String[] presentPolite = {"います", "きます", "ぎます", "します", "ちます", "にます", "びます", "みます", "ります", "います", "えます"};
		final String[] presentNegativePlain = {"わない", "かない", "がない", "さない", "たない", "なない", "ばない", "まない", "らない", "いない", "えない"};
		final String[] presentNegativePolite = {"いません", "きません", "ぎません", "しません", "ちません", "にません", "びません", "みません", "りません", "いません", "えません"};
		final String[] pastPlain = {"った", "いた", "いだ", "した", "った", "んだ", "んだ", "んだ", "った", "いた", "えた"};
		final String[] pastPolite = {"いました", "きました", "ぎました", "しました", "ちました", "にました", "びました", "みました", "りました", "いました", "えました"};
		final String[] pastNegativePlain = {"わなかった", "かなかった", "がなかった", "さなかった", "たなかった", "ななかった", "ばなかった", "まなかった", "らなかった", "いなかった", "えなかった"};
		final String[] pastNegativePolite = {"いませんでした", "きませんでした", "ぎませんでした", "しませんでした", "ちませんでした", "にませんでした", "びませんでした", "みませんでした", "りませんでした", "いませんでした", "えませんでした"};
		final String[] conditional = {"えば", "けば", "げば", "せば", "てば", "ねば", "べば", "めば", "れば", "いれば", "えれば"};
		final String[] conditionalNegative = {"わなければ", "かなければ", "がなければ", "さなければ", "たなければ", "ななければ", "ばなければ", "まなければ", "らなければ", "いらなければ", "えらなければ"};
		final String[] teForm = {"って", "いて", "いで", "して", "って", "んで", "んで", "んで", "って", "いて", "えて"};
		final String[] volitionalPlain = {"おう", "こう", "ごう", "そう", "とう", "のう", "ぼう", "もう", "ろう", "いよう", "えよう"};
		final String[] volitionalPolite = {"いましょう", "きましょう", "ぎましょう", "しましょう", "ちましょう", "にましょう", "びましょう", "みましょう", "りましょう", "いましょう", "えましょう"};
		final String[] potentialPlain = {"える", "ける", "げる", "せる", "てる", "ねる", "べる", "める", "れる", "いられる", "えられる"};
		final String[] potentialPolite = {"えます", "けます", "げます", "せます", "てます", "ねます", "べます", "めます", "れます", "いられます", "えられます"};
		final String[] potentialNegativePlain = {"えない", "けない", "げない", "せない", "てない", "ねない", "べない", "めない", "れない", "いられない", "えられない"};
		final String[] potentialNegativePolite = {"えません", "けません", "げません", "せません", "てません", "ねません", "べません", "めません", "れません", "いられません", "えられません"};
		final String[] causativePlain = {"わせる", "かせる", "がせる", "させる", "たせる", "なせる", "ばせる", "ませる", "らせる", "いさせる", "えさせる"};
		final String[] causativePolite = {"わせます", "かせます", "がせます", "させます", "たせます", "なせます", "ばせます", "ませます", "らせます", "いさせます", "えさせます"};
		final String[] causativeNegativePlain = {"わせない", "かせない", "がせない", "させない", "たせない", "なせない", "ばせない", "ませない", "らせない", "いさせない", "えさせない"};
		final String[] causativeNegativePolite = {"わせません", "かせません", "がせません", "させません", "たせません", "なせません", "ばせません", "ませません", "らせません", "いさせません", "えさせません"};
		
		
		//collection of the correct conjugations
		/****MUST BE THE SAME ORDER AS verbTenses****/
		String[][] tenseConjugations = {presentPolite, presentNegativePlain, presentNegativePolite,
										pastPlain, pastPolite, pastNegativePlain, pastNegativePolite,
										conditional, conditionalNegative, teForm,
										volitionalPlain, volitionalPolite,
										potentialPlain, potentialPolite, potentialNegativePlain, potentialNegativePolite,
										causativePlain, causativePolite, causativeNegativePlain, causativeNegativePolite
										};
		
		
		verbTenseMap = new HashMap<String, Map<String, String>>();
		
		//build entire map of conjugations and their related tenses
		for(int i = 0; i < verbTenses.length; ++i) {
			verbTenseMap.put(verbTenses[i], buildConjugationMap(tenseConjugations[i]));
		}
		
		return verbTenseMap;
	}
	
}
