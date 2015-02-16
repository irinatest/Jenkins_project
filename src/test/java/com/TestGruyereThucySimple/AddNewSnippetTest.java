package com.TestGruyereThucySimple;

import org.junit.Assert;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.TestGruyereThucySimple.steps.HomePageSteps;
import com.TestGruyereThucySimple.steps.LogInPageSteps;
import com.TestGruyereThucySimple.steps.MainPageSteps;
import com.TestGruyereThucySimple.steps.MySnippetsPageSteps;
import com.TestGruyereThucySimple.steps.NewSnippetPageSteps;


@RunWith(ThucydidesRunner.class)
public class AddNewSnippetTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "https://google-gruyere.appspot.com/230554551334/snippets.gtl")
    public Pages pages;

    @Steps
    HomePageSteps homePageSteps;
    @Steps
    LogInPageSteps logInPageSteps;
    @Steps
    MainPageSteps mainPageSteps;
    @Steps
    NewSnippetPageSteps newSnippetPageSteps;
    @Steps
    MySnippetsPageSteps mySnippetsPageSteps;
 
    @Test
    public void AddNewSnippet() {
    	homePageSteps.enterApp();
    	String username="lola";
    	String password="lola";
    	logInPageSteps.login(username, password);
    	mainPageSteps.clickOnNewSnippetButton();
    	Assert.assertTrue(newSnippetPageSteps.verifyTitleIsPresentOnPage());
    	String Snippet="snip snip snip";
    	newSnippetPageSteps.addTextInTextBox(Snippet);
    	newSnippetPageSteps.clickSubmitButton();
    	Assert.assertTrue(mySnippetsPageSteps.verifymySnippetsTitleIsPresent());
    	String extractedSnippet=mySnippetsPageSteps.extractFirstSnippet();
    	Assert.assertTrue(extractedSnippet.equals("snip snip snip"));
    	 	
    }

} 