package com.TestGruyereThucySimple.steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import com.TestGruyereThucySimple.pages.LogInPage;

public class LogInPageSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LogInPage 	logInPage;
	
    @Step
    public boolean verifyPage() {
    	return logInPage.buttonIsPresentOnLogInPage();
    }
    
    @Step
    public void enterUsername(String user) {
    	logInPage.enterUserName(user);
    }
    
    @Step
    public void enterPassword(String pass) {
    	logInPage.enterPassword(pass);
    }
    
    @Step
    public void clickLoginButton() {
    	logInPage.clickLogin();
    }
    
    @StepGroup
	public void login(String username, String password) {		
    	enterUsername(username);
    	enterPassword(password);
    	clickLoginButton();
	}
}