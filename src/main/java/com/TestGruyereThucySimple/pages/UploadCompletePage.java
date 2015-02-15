package com.TestGruyereThucySimple.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("https://google-gruyere.appspot.com/230554551334/snippets.gtl")
public class UploadCompletePage extends PageObject {

	@FindBy(xpath="//h2[contains(text(),'Gruyere: Upload')]")
	private WebElementFacade pageTitleText;
	
	@FindBy(xpath="//b[contains(text(),'File uploaded!')]")
	private WebElementFacade textToValidateUpload;
	
		
    public boolean pageTitleIsPresent(){
    	return pageTitleText.getText().equals("Gruyere: Upload Complete");
    }
    
    public boolean textValidatesUpload(){
    	return textToValidateUpload.getText().contains("File uploaded!");
    }
    
   
}