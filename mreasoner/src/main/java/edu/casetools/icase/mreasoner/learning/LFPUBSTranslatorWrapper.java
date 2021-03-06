package edu.casetools.icase.mreasoner.learning;

import edu.casetools.mreasoner.lfpubs2m.core.LFPUBS2MTranslator;

public class LFPUBSTranslatorWrapper {

	LFPUBS2MTranslator translator;
	
	public LFPUBSTranslatorWrapper(){
		translator = new LFPUBS2MTranslator(true);
	}
	
	public String translate(String filename, boolean debug){
		return translator.getTranslation(filename);
	}

	
}
