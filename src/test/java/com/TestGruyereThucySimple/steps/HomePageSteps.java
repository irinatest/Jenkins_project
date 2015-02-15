package com.TestGruyereThucySimple.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import com.TestGruyereThucySimple.pages.HomePage;


public class HomePageSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	HomePage homePage;
    
    @Step
    public void is_the_home_page() {
    	homePage.open_page();
    }

    @Step
    public void click_Signin_button() {
    	homePage.clickSignInButton();
    }
    
    @StepGroup
    public void enterApp(){
    	is_the_home_page();
    	click_Signin_button();
    }
}