package com.fbistech.SubDealer_TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.SubDealer.Transaction_HistorySubDealer;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;

public class Transaction_HistorySubDealer_TestCase {
	 
	
	public static Properties prop;
	 
	public static FileInputStream input;
	
	Transaction_HistorySubDealer checkTransactionHistory;

	AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
	


	
	@BeforeMethod
	public void setUp()
	{
		initializePropFile();
		checkTransactionHistory = new Transaction_HistorySubDealer(driver);
	}
	
	
	
	 
	@Test(priority = 1)
	public void verifySubDealerCanCheckTransactionHistory() throws Exception
	{ 
		String viewTransactionHistory = checkTransactionHistory.
				validateSubdealerCheck_TransactionHistory(prop.getProperty("checkTransactionHistory"));
		System.out.println(viewTransactionHistory);
		Thread.sleep(19000);
	}
		

	
	
	@AfterMethod  
	public void tearDown() throws Exception
	{
		Thread.sleep(6000);
//		driver.quit(); 
	} 
	
	
	
	
	
	public void initializePropFile() 
	{
		try  
		{
//			Now instantiate by calling the constructor of properties  
			prop = new Properties();
				
//			Instantiate 
			FileInputStream input = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/fbistech/config/config.properties");	

//			Load file input stream 
			prop.load(input);	
		}
		
		
		catch (FileNotFoundException e) 
		{ 
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
