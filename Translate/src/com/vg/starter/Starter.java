package com.vg.starter;

import com.gtranslate.Language;
import com.gtranslate.Translator;

public class Starter {

	public static void main(String[] args) {
		Translator translate = Translator.getInstance();
		
		String text = translate.translate("Hello world", Language.ENGLISH, Language.AFRIKAANS);
		System.out.println(text);
	}

}