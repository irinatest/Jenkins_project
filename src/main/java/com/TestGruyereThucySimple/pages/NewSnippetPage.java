package com.TestGruyereThucySimple.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("https://google-gruyere.appspot.com/230554551334/snippets.gtl")
public class NewSnippetPage extends PageObject {

	@FindBy(css = "textarea[name='snippet']")
	private WebElementFacade textBox;

	@FindBy(css = "input[value='Submit']")
	private WebElementFacade submitButton;

	@FindBy(xpath = "//h2[contains(text(),'New')]")
	private WebElementFacade pageTitleText;

	// page title validation
	public boolean pageTitleIsPresent() {
		return pageTitleText.getText().equals("Gruyere: New Snippet");
	}

	// click on textbox
	public void clickOnTextBox() {
		textBox.click();
	}

	// adaugare text
	public void addSnippetText(String text) {
		textBox.type(text);
	}

	// click submit button
	public void clickSubmitButton() {
		submitButton.click();
	}
}