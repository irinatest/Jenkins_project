package com.TestGruyereThucySimple.steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.TestGruyereThucySimple.pages.MainPage;
import com.TestGruyereThucySimple.pages.NewSnippetPage;
import com.TestGruyereThucySimple.pages.UploadCompletePage;
import com.TestGruyereThucySimple.pages.UploadPage;

public class UploadCompletePageSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	NewSnippetPage newSnippetPage;
	MainPage mainPage;
	UploadPage uploadPage;
	UploadCompletePage uploadCompletePage;
	
    @Step
    public boolean verifyTitleIsPresentOnPage() {
    	return uploadCompletePage.pageTitleIsPresent();
    }
    
    @Step
    public boolean verifyTextForValidationIsPresentOnPage(){
    	return uploadCompletePage.textValidatesUpload();
    }  
}