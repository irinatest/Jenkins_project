package com.TestGruyereThucySimple;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

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
import com.TestGruyereThucySimple.steps.UploadCompletePageSteps;
import com.TestGruyereThucySimple.steps.UploadPageSteps;


@RunWith(ThucydidesRunner.class)
public class UploadTest {

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
    @Steps
    UploadPageSteps uploadPageSteps;
    @Steps
    UploadCompletePageSteps uploadCompletePageSteps;
 
    @Test
    public void uploadTextTest() throws AWTException, InterruptedException {
    	
    	homePageSteps.enterApp();
    	String username="lola";
    	String password="lola";
    	logInPageSteps.login(username, password);
    	mainPageSteps.clickOnUploadButton();
    	
    	uploadPageSteps.clickButtonChooseFile();
    	   	
    	//the path for the text file
//    	String path1 = "C:\\Users\\Iris\\Desktop\\images.jpg";
    	String path1 = "C:\\Users\\irinaneagu\\Desktop\\More_docs_Jenkins.txt";
    	
    	UploadPageSteps.setClipboardData(path1);   
    	
    	//native key strokes for CTRL, V and ENTER keys
    	Robot robot=new Robot();
    	//press Enter
//    	robot.keyPress(KeyEvent.VK_ENTER);
//    	robot.keyRelease(KeyEvent.VK_ENTER);
    	//robot.delay(1000);
    	//press CTRL+V
    	robot.keyPress(KeyEvent.VK_CONTROL);
    	robot.keyPress(KeyEvent.VK_V);
    	robot.keyRelease(KeyEvent.VK_CONTROL);
    	robot.keyRelease(KeyEvent.VK_V);
    	////press Enter
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
//    	
    	robot.delay(1000);
    	
    	   	
    	uploadPageSteps.clickUploadButtonFile();
    	
    	
    	Thread.sleep(1000);
    	//verify that the upload is done right
    	Assert.assertTrue("Not the right page!", uploadCompletePageSteps.verifyTitleIsPresentOnPage());
    	Assert.assertTrue("the file was not uploaded properly!", uploadCompletePageSteps.verifyTextForValidationIsPresentOnPage());
    }

} 