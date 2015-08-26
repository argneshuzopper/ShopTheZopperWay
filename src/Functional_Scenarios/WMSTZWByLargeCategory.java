package Functional_Scenarios;

import junit.framework.Assert;

import org.testng.annotations.Test;

import App_Functions.HomeAppliancesShopByZopperWay;
import Page_Objects.App_Constants;
import Page_Objects.App_Data;

@SuppressWarnings("deprecation")
public class WMSTZWByLargeCategory extends BaseTest {

	@Override
	@Test
	public void executeTestCase() throws Exception {
		try {
			startTestCase("WMSTZWByLargeCategory");
			info("Call the homeapplicancesSTZW function of application");
			HomeAppliancesShopByZopperWay.homeapplicancesSTZW();
			clickName(App_Constants.STZWWashingMachine_name);
			//longwaitForElement();
			info("Click on Washing machine option of Shop the zopper way");
			waitforpresenceOfElement(App_Data.FindWashingMachinestext);
			invisibilityOfElementLocated(App_Constants.PageSpinner_id);
			info("Executing explicit wait");
			clickXpath(App_Constants.STZWBusiness_xpath);
			info("click on Large button");
			clickName(App_Constants.STZWSkip_text);
			info("click on Skip link");
			clickXpath(App_Constants.STZWGaming_xpath);
			info("click on Semi Automatic button");
			Assert.assertTrue(findElementByXpath(
					App_Constants.STZWFirstMobileProduct_text).isEnabled());
			info("first assertion verification");
			Assert.assertTrue(findElementByXpath(
					App_Constants.STZWSecondMobileproduct_text).isEnabled());
			info("second assertion verification");
			clickClassName(App_Constants.ProductDetailsBackbutton_class);
			info("clicking back button");
			waitforpresenceOfElement(App_Data.FindWashingMachinestext);
			clickXpath(App_Constants.STZWPhotos_xpath);
			info("clicking on Top Loading button");
			Assert.assertTrue(findElementByXpath(
					App_Constants.STZWFirstMobileProduct_text).isEnabled());
			info("first assertion verification");
			Assert.assertTrue(findElementByXpath(
					App_Constants.STZWSecondMobileproduct_text).isEnabled());
			info("second assertion verification");
			clickClassName(App_Constants.ProductDetailsBackbutton_class);
			info("clicking back button");
			waitforpresenceOfElement(App_Data.FindWashingMachinestext);
			clickXpath(App_Constants.STZWBusiness_xpath);
			info("clicking on Front Loading button");
			Assert.assertTrue(findElementByXpath(
					App_Constants.STZWFirstMobileProduct_text).isEnabled());
			info("first assertion verification");
			Assert.assertTrue(findElementByXpath(
					App_Constants.STZWSecondMobileproduct_text).isEnabled());
			info("second assertion verification");

			endTestCase("WMSTZWByLargeCategory");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			takeSnapShot("D:\\takeScreenshots", "WMSTZWByLargeCategory");
			throw (e);
		}

	}

}
