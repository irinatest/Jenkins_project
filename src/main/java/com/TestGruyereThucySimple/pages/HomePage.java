package com.TestGruyereThucySimple.pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;


public class HomePage extends PageObject {

    @FindBy(css="a[href='/230554551334/login']")
    private WebElementFacade logInButton;

    public void open_page() {  
    		open();
    }

    public void clickSignInButton(){
    	logInButton.click(); 
    }
}