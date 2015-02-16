package com.TestGruyereThucySimple.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class MainPage extends PageObject {

	@FindBy(css = "h2[class='has-refresh']")
	private WebElementFacade pageTitle;

	@FindBy(linkText = "New Snippet")
	private WebElementFacade newSnippetButton;

	@FindBy(linkText = "My Snippets")
	private WebElementFacade mySnippetsButton;

	@FindBy(css = "a[href='/230554551334/upload.gtl']")
	private WebElementFacade uploadButton;

	public boolean pageTitleIsPresent() {
		return pageTitle.getText().equals("Gruyere: Home");
	}

	public void clickNewSnipButton() {
		newSnippetButton.click();
	}

	public void clickSnippetsButton() {
		mySnippetsButton.click();
	}

	public void clickUploadButton() {
		uploadButton.click();
	}

}