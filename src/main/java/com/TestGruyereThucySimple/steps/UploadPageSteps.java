package com.TestGruyereThucySimple.steps;


import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.TestGruyereThucySimple.pages.MainPage;
import com.TestGruyereThucySimple.pages.NewSnippetPage;
import com.TestGruyereThucySimple.pages.UploadPage;

public class UploadPageSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	NewSnippetPage newSnippetPage;
	MainPage mainPage;
	UploadPage uploadPage;
	
    @Step
    public boolean verifyTitleIsPresentOnPage() {
    	return uploadPage.pageTitleIsPresent();
    }
    
    @Step
    public void clickButtonChooseFile(){
    	uploadPage.clickChooseFileButton();
    }
    
    @Step
    public void clickUploadButtonFile(){
    	uploadPage.clickUploadFileButton();
    }
    
    @Step
    public static void setClipboardData(String path) throws AWTException{
    	StringSelection stringSelection=new StringSelection(path);
    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null); 	
    }
    
}