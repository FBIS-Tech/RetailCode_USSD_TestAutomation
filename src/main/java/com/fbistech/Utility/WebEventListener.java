package com.fbistech.Utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.fbistech.BasePage.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class WebEventListener extends BasePage implements WebDriverEventListener{

	/* This is WebDriver Fire Event-- to generate selenium action logs this is call from TestBase Class */
	
	public WebEventListener(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	public void beforeNavigateTo(String url, WebDriver driver)
	{
		System.out.println("Before navigating to: '" + url + "'");	
	}
	 
	
	public void afterNavigateTo(String url, WebDriver driver) 
	{
		System.out.println("Navigate to:'" + url + "'");	
	}	
	
	
	public void beforeChangeValueOf(WebElement element, WebDriver driver) 
	{
		System.out.println("Value of the:" + element.toString() + " before any changes made");
	} 
	
	
	public void afterChangeValueOf(WebElement element, WebDriver driver) 
	{
		 System.out.println("Element value changed to: "  + element.toString());	
	}
	

	public void beforeClickOn(WebElement element, WebDriver driver)
	{
		System.out.println("Trying to click on: "  + element.toString());
	}	
	 
	
	public void afterClickOn(WebElement element, WebDriver driver) 
	{
		System.out.println("Clicked on: "  + element.toString());		
	}
	
	
	public void beforeNavigateBack(WebDriver driver)
	{
		System.out.println("Navigating back to prevoius page");		
	}

		
	public void afterNavigateBack(WebDriver driver)
	{
		System.out.println("Navigated back to prevoius page");		
	}
	
	
	public void beforeNavigateForward(WebDriver driver)
	{
		System.out.println("Navigating forward to next page");		
	}

	
	public void afterNavigateForward(WebDriver driver)
	{
		System.out.println("Navigated forward to next page");			
	}
	
/*	for any error that occure in testing this method take the screen shot of such error */
	public void onException(Throwable error, WebDriver driver) 
	{
		System.out.println("Exeption occured: " + error);	
		
		try 
		{
			TestUtil.takeScreenshotAtEndOfTest();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}	
	}		
	
	
	
	public void beforeFindBy(By by, WebElement element, WebDriver driver)
	{
		System.out.println("Trying to find Element By: "  + by.toString());			
	}

	
	public void afterFindBy(By by, WebElement arg1, WebDriver arg2) 
	{
		System.out.println("Found Element By: " + by.toString());		
	}
	
	
	/*
	 *  non overridden methods of WebListener class
	 */
	
	public void beforeScript(String script, WebDriver driver) 
	{
		// TODO Auto-generated method stub
	}
	
	public void afterScript(String script, WebDriver driver)
	{
		// TODO Auto-generated method stub
	}
	
	public void beforeAlertAccept(WebDriver driver) 
	{
		// TODO Auto-generated method stub	
	}
	
	public void afterAlertAccept(WebDriver driver) 
	{
		// TODO Auto-generated method stub
	}


		
	public void afterAlertDismiss(WebDriver driver)
	{
		// TODO Auto-generated method stub	
	}

	public void beforeAlertDismiss(WebDriver driver)
	{
		// TODO Auto-generated method stub
	}
	public void beforeNavigateRefresh(WebDriver driver) 
	{
		// TODO Auto-generated method stub
	}
	
	public void afterNavigateRefresh(WebDriver driver) 
	{
		// TODO Auto-generated method stub
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) 
	{
		// TODO Auto-generated method stub
		
	}
	
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) 
	{
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	

	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub
		
	}

	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}


	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	
	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	

}
