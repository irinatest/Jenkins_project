package com.TestGruyereThucySimple.steps;



import java.io.IOException;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.TestGruyereThucySimple.pages.MySnippetsPage;

public class MySnippetsPageSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MySnippetsPage mySnippetsPage;
	
    @Step
    public boolean verifymySnippetsTitleIsPresent() {
    	return mySnippetsPage.mySnippetsTitleIsPresent();
    }
   
    @Step
    public String extractFirstSnippet(){
    	return mySnippetsPage.firstSnippetInList();
    }
    
    @Step
    public void clickOnHomeButton(){
    	mySnippetsPage.clickHomeButton();
    }
   
    @Step
    public void extractAllSnippets() throws IOException{
    	mySnippetsPage.snippetsTableCellValue();
    }
}