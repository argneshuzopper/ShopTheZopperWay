package Functional_Scenarios;

import junit.framework.Assert;

import org.testng.annotations.Test;

import App_Functions.OpenHomePage;
import Page_Objects.App_Constants;
import Page_Objects.App_Data;


@SuppressWarnings("deprecation")
public class ACSTZWBySmallAnyOtherCategory extends BaseTest {

	@Override
	@Test
	public void executeTestCase() throws Exception {
		try{
			startTestCase("ACSTZWBySmallAnyOtherCategory");
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
			waitforpresenceOfElement(App_Constants.STZWAC_name);
			clickName(App_Constants.STZWAC_name);
			info("Click on Ac option of Shop the zopper way");
			//longwaitForElement();
			waitforpresenceOfElement(App_Data.FindAirConditionerstext);
			invisibilityOfElementLocated(App_Constants.PageSpinner_id);
			info("Executing Explicit wait");
			clickXpath(App_Constants.STZWGaming_xpath);
			info("click on Small button");
			clickXpath(App_Constants.STZWPhotos_xpath);
			info("click on Any Other button");
			clickXpath(App_Constants.STZWGaming_xpath);
			info("click on window button");
			Assert.assertTrue(findElementByXpath(App_Constants.STZWFirstMobileProduct_text).isEnabled());
			info("first assertion verification");
			Assert.assertTrue(findElementByXpath(App_Constants.STZWSecondMobileproduct_text).isEnabled());
			info("seconf assertion verification");
			clickClassName(App_Constants.ProductDetailsBackbutton_class);
			info("clicking back button");
			invisibilityOfElementLocated(App_Constants.PageSpinner_id);
			waitforpresenceOfElement(App_Data.FindAirConditionerstext);
			info("Executing explicit wait");
			clickXpath(App_Constants.STZWPhotos_xpath);
			info("clicking on Split button");
			Assert.assertTrue(findElementByXpath(App_Constants.STZWFirstMobileProduct_text).isEnabled());
			info("first assertion verification");
			Assert.assertTrue(findElementByXpath(App_Constants.STZWSecondMobileproduct_text).isEnabled());
			info("second assertion verification");
			
			endTestCase("ACSTZWBySmallAnyOthercategory");
		}catch(Exception e){
			System.out.println(e.getMessage());
			takeSnapShot("D:\\takeScreenshots", "ACSTZWBySmallAnyotherCategory");
			throw(e);
		}
		
		
	}

	
}
