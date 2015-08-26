package App_Functions;

import junit.framework.Assert;

import org.testng.annotations.Test;

import Functional_Scenarios.BaseTest;
import Page_Objects.App_Constants;
import Page_Objects.App_Data;
import Utility.User_Defined_Function;

@SuppressWarnings("deprecation")

public class HomeAppliancesShopByZopperWay extends BaseTest {
	
	public static void homeapplicancesSTZW() throws InterruptedException{
		try{
		info("Call the Home page function of application");
		OpenHomePage.openHomePage();
		clickClassName(App_Constants.Open_Navigation_Drawer);
		info("open the navigation drawer of the app");
		clickName(App_Constants.NavDrawer_Home_Appliances_link);
		info("open Home Appliances link of the app");
		Assert.assertTrue(findElementByName(
				App_Constants.HomeAppliances_text).getText().equals(
				App_Data.HomeApplicancetext));
		info("entered the assertion to verify the page");
		waitForElement();
		for (int i = 0; i < 2; i++) {
			swipeWithAxis(0, 1000, 0, 250, 3000);
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
			User_Defined_Function.takeSnapShot("D:\\takeScreenshots", "HomeAppliancesShopByZopperWay");
			throw(e);
			
		}
	}

	@Override
	@Test
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
