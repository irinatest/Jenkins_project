package com.TestGruyereThucySimple.pages;

import java.io.BufferedWriter;

import org.jruby.ast.NewlineNode;
import org.jruby.ir.operands.Array;
import org.junit.Assert;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.IOException;

public class MySnippetsPage extends PageObject {

	@Managed(uniqueSession = true)
	public WebDriver driver;

	@FindBy(css = "h2[id='user_name']")
	private WebElementFacade mySnippetsTitle;

	@FindBy(css = "div[id='0']")
	private WebElementFacade firstSnippet;

	@FindBy(css = "a[href='/230554551334/']")
	private WebElementFacade homeButton;

	// page title validation
	public boolean mySnippetsTitleIsPresent() {
		return mySnippetsTitle.getText().equals("My Snippets");
	}

	public String firstSnippetInList() {
		return firstSnippet.getText();
	}

	public void clickHomeButton() {
		homeButton.click();
	}

	// extract data from "My snippets"
	public  void snippetsTableCellValue() throws IOException {

//		List<WebElement> column = getDriver().findElements(
//				By.cssSelector("tr td div"));
		
		List<WebElement> column = getDriver().findElements(
				By.xpath("//*//table//tbody//tr//td//div"));
		
		File file=new File("C://Users/irinaneagu/Desktop/Test2.txt");
		//if the file doesn't exist, create it
		if(!file.exists()){
			file.createNewFile();
		}
		
		FileWriter fw=new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw=new BufferedWriter(fw);
		
		List<String> a = new ArrayList<String>();
		for (WebElement i : column) {
			a.add(i.getText().toString());
			
		}
		bw.write("\n \t"+a.toString());		
		bw.close();
	}
}