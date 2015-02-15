package com.TestGruyereThucySimple.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("https://google-gruyere.appspot.com/230554551334/snippets.gtl")
public class UploadPage extends PageObject {

	@FindBy(xpath="//h2[contains(text(),'Upload')]")
	private WebElementFacade pageTitleText;
	
	@FindBy(css="input[type='file']")
	private WebElementFacade chooseFileButton;
	
	@FindBy(css="a[href *='upload']")
	private WebElementFacade uploadFileButton;
	
    public boolean pageTitleIsPresent(){
    	return pageTitleText.getText().equals("Gruyere: Upload");
    }
    
    public void clickChooseFileButton(){
    	chooseFileButton.click();
    }
    
    public void clickUploadFileButton(){
    	uploadFileButton.click();
    }
    
   
}