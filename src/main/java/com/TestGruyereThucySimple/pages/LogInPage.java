package com.TestGruyereThucySimple.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class LogInPage extends PageObject {

	@FindBy(css = "input[type='submit']")
	private WebElementFacade loginButton;

	@FindBy(css = "input[type='text']")
	private WebElementFacade userNameButton;

	@FindBy(css = "input[type='password']")
	private WebElementFacade passwordButton;

	public boolean buttonIsPresentOnLogInPage() {
		return loginButton.isPresent();
	}

	public void enterUserName(String username) {
		userNameButton.click();
		userNameButton.type(username);
	}

	public void enterPassword(String password) {
		passwordButton.click();
		passwordButton.type(password);
	}

	public void clickLogin() {
		loginButton.click();
	}

}