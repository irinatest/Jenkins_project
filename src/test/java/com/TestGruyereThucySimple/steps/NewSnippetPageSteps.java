package com.TestGruyereThucySimple.steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.TestGruyereThucySimple.pages.MainPage;
import com.TestGruyereThucySimple.pages.NewSnippetPage;

public class NewSnippetPageSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	NewSnippetPage newSnippetPage;
	MainPage mainPage;
	
    @Step
    public boolean verifyTitleIsPresentOnPage() {
    	return newSnippetPage.pageTitleIsPresent();
    }
    
    @Step
    public void addTextInTextBox(String textToAdd){
    	newSnippetPage.clickOnTextBox();
    	newSnippetPage.addSnippetText(textToAdd);
    }
    
    @Step
    public void clickSubmitButton(){
    	newSnippetPage.clickSubmitButton();
    }
}