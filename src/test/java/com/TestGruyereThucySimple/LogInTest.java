package com.TestGruyereThucySimple;

import junit.framework.Assert;
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


@RunWith(ThucydidesRunner.class)
public class LogInTest {

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

 
    @Test
    public void LogIn() {
    	homePageSteps.is_the_home_page();
    	homePageSteps.click_Signin_button();
    	String username="lola";
    	String password="lola";
    	logInPageSteps.login(username, password);
    	Assert.assertTrue(mainPageSteps.verifyPageTitle());    	
    }

} 