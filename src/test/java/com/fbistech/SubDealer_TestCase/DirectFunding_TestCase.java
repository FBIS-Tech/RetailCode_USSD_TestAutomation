 package com.fbistech.SubDealer_TestCase;

import org.testng.annotations.Test;

import com.fbistech.SubDealer.DirectFunding_SubDealerToCustomer;
import com.fbistech.SubDealer.DirectFunding_SubDealerToDealer_NotUpline;
import com.fbistech.SubDealer.DirectFunding_SubDealerToDealer_Upline;
import com.fbistech.SubDealer.DirectFunding_SubDealerToRetailer_NotOnDownline;
import com.fbistech.SubDealer.DirectFunding_SubDealerToRetailer_OnDownline;
import com.fbistech.SubDealer.DirectFunding_SubDealerToSubDealer_NotOnSameDealer;
import com.fbistech.SubDealer.DirectFunding_SubDealerToSubDealer_OnSameDealer;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.android.AndroidDriver;

public class DirectFunding_TestCase {

	

//public class DirectFunding_SubDealer_TestCase extends BasePage {
//	
//	public DirectFunding_SubDealer_TestCase()
//	{
//		super(driver);
//
//	}

	AndroidDriver driver = LaunchMobileUtility.getAndroidDriver();

	

	
	@Test(priority = 1)

	public void verifySubDealerCannotFundCustomer()throws Exception
	{
		DirectFunding_SubDealerToCustomer subDealerFundCustomer = new DirectFunding_SubDealerToCustomer(driver);
		
		String getWalletBalanceText = subDealerFundCustomer.validateSubDealerFundCustomer();
		System.out.println(getWalletBalanceText);
		
		Thread.sleep(19000);

	}
	
	
	@Test(priority = 2)

	public void verifySubDealerCannotFundDealer_NotUpline()throws Exception
	{
		DirectFunding_SubDealerToDealer_NotUpline subDealerFundDealer_NotUpline = new DirectFunding_SubDealerToDealer_NotUpline(driver);
		
		String getWalletBalanceText = subDealerFundDealer_NotUpline.validateSubDealerFundDealer_NotUpline();
		System.out.println(getWalletBalanceText);
		
		Thread.sleep(19000);

	}
	
	
	
	@Test(priority = 3)
	public void verifySubDealerCannotFund_DealerUpLine()throws Exception
	{
		DirectFunding_SubDealerToDealer_Upline subDealerToFundDealer_Upline = new DirectFunding_SubDealerToDealer_Upline(driver);

		String getWalletBalanceText = subDealerToFundDealer_Upline.validateSubDealerFundDealer_NotUpline();
		System.out.println(getWalletBalanceText);
		Thread.sleep(19000);
	}
	
	 
	
	@Test(priority = 4)
	public void verifySubDealerCannotFundRetailer_NotOnDownLine()throws Exception
	{
		DirectFunding_SubDealerToRetailer_NotOnDownline subDealerFundRetailer_NotOnDownline = new DirectFunding_SubDealerToRetailer_NotOnDownline(driver);

		String getWalletBalanceText = subDealerFundRetailer_NotOnDownline.validatesubdealerFundRetailer_NotOnDownline();
		System.out.println(getWalletBalanceText);
		Thread.sleep(19000);
	}
	  
	
	
	@Test(priority = 5)
	public void verifySubDealerCanFund_RetailerOnDownLine()throws Exception
	{
		DirectFunding_SubDealerToRetailer_OnDownline subDealerToRetailer_OnDownline = new DirectFunding_SubDealerToRetailer_OnDownline(driver);
		
		String getWalletBalanceText = subDealerToRetailer_OnDownline.validatesubdealerFundRetailer_OnDownline();
		System.out.println(getWalletBalanceText);
		Thread.sleep(19000);

//		subDealerFundRetailer_OnDownline.subdealerToFundRetailer_OnDownline(prop.getProperty("subDealerToRetailerDownline"), prop.getProperty("subDealer_PIN"));
	}
	 

	
	@Test(priority = 6)
	public void verifySubDealerCannotFundSubDealer_NotOnSameDealer()throws Exception
	{
		DirectFunding_SubDealerToSubDealer_NotOnSameDealer subDealerFundSubdealer_NotOnSameDealer = new DirectFunding_SubDealerToSubDealer_NotOnSameDealer(driver);

		String getWalletBalanceText = subDealerFundSubdealer_NotOnSameDealer.subdealerFundSubdealer_NotOnSameDealer();
		System.out.println(getWalletBalanceText);
		Thread.sleep(19000);
		
//		subDealerFundRetailer_OnDownline.subdealerToFundRetailer_OnDownline(prop.getProperty("subDealerToRetailerDownline"), prop.getProperty("subDealer_PIN"));
	}
	
	
	
	
	@Test(priority = 7)
	public void verifySubDealerCanFund_SubDealerOnSameDealer()throws Exception
	{
		DirectFunding_SubDealerToSubDealer_OnSameDealer subDealerToFundSubdealer_OnSameDealer = new DirectFunding_SubDealerToSubDealer_OnSameDealer(driver);

		String getWalletBalanceText = subDealerToFundSubdealer_OnSameDealer.SubdealerFundSubdealer_OnSameDealer();
		System.out.println(getWalletBalanceText);
		Thread.sleep(19000);
		
//		subDealerFundRetailer_OnDownline.subdealerToFundRetailer_OnDownline(prop.getProperty("subDealerToRetailerDownline"), prop.getProperty("subDealer_PIN"));
	
	}

 	
	
}