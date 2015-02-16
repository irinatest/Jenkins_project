package com.TestGruyereThucySimple.steps;



import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.TestGruyereThucySimple.pages.MainPage;

public class MainPageSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MainPage mainPage;
	
	@Step
    public void openMainPage() {
		mainPage.open();
    }
	
    @Step
    public boolean verifyPageTitle() {
    	return mainPage.pageTitleIsPresent();
    }
    
    @Step
    public void clickOnNewSnippetButton() {
    	 mainPage.clickNewSnipButton();
    }
   
    @Step
    public void clickOnMySnippetsButton() {
    	 mainPage.clickSnippetsButton();
    }
    
    @Step
    public void clickOnUploadButton() {
    	 mainPage.clickUploadButton();
    }
}