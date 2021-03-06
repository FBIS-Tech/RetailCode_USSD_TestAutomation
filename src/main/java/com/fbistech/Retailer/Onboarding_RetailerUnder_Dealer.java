package com.fbistech.Retailer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Onboarding_RetailerUnder_Dealer extends BasePage {
	
	public Onboarding_RetailerUnder_Dealer(AppiumDriver driver)
	{
		super(driver);
	}
	
	

	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement digits_InputField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement dial_Button;
	

	@AndroidFindBy(xpath = "//*[@resource-id='com.android.phone:id/input_field']")
	private AndroidElement text_InputField;
	
	@AndroidFindBy(xpath = "//*[@text='SEND']")
	private AndroidElement sendText_Button;
	

	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement onboardingConfirmation;
	
	
	@AndroidFindBy(xpath = "//*[@text='CANCEL']")
	private AndroidElement cancel_Button;
//	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Button;
//	
//	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Close\"]")
//	private AndroidElement smsCancel_Btn;
	

	
	
	
//	*878*22*1*Dealer-RCode# .......Sub-dealer onboard under Dealer
//	*878*22*2*Dealer-RCode# .......Retailer onboard under Dealer
	
//	*878*22*3*Sub-dealer-RCode#....Retailer onboard under Sub-dealer

	
	public String validateRetailerOnboardUnderDealer() throws Exception
	{
//		Dial Short code 
		digits_InputField.sendKeys("*878*878*22*2*00#");
		dial_Button.click();
		Thread.sleep(3000);
		
//		Enter Retailer's name 
		text_InputField.sendKeys("Joseph Retailer");
		sendText_Button.click();
		Thread.sleep(3000);
		
//		Enter Sub-Region 
		text_InputField.sendKeys("Lagos");
		sendText_Button.click();
		Thread.sleep(4000);
 
//		Enter more than 4 digits to create PIN
		text_InputField.sendKeys("123456");
		sendText_Button.click();
		Thread.sleep(4000); 
		
//		Enter 4 digits PIN
		text_InputField.sendKeys("1234");
		sendText_Button.click();
		Thread.sleep(4000);
		
		
//		Enter wrong PIN to Confirm PIN
		text_InputField.sendKeys("123567");
		sendText_Button.click();
		Thread.sleep(4000);
		
//		Enter 4 digits PIN to confirm PIN
		text_InputField.sendKeys("1234");
//		sendText_Btn.click();
		Thread.sleep(6000);
		cancel_Button.click();
		
		String onboardingDetails = onboardingConfirmation.getText();
		Thread.sleep(6000);
		
		Thread.sleep(6000);
//		ok_Button.click();
		
//		balanceOK_Btn.click();
//		Thread.sleep(10000);
//		smsCancel_Btn.click();
		
		return onboardingDetails;

	}
}
