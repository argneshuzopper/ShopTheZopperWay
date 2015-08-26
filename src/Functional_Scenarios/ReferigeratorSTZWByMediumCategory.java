package Functional_Scenarios;

import junit.framework.Assert;

import org.testng.annotations.Test;

import App_Functions.HomeAppliancesShopByZopperWay;
import Page_Objects.App_Constants;
import Page_Objects.App_Data;

@SuppressWarnings("deprecation")
public class ReferigeratorSTZWByMediumCategory extends BaseTest {

	@Override
	@Test
	public void executeTestCase() throws Exception {
		try {
			startTestCase("ReferigeratorSTZWByMediumCategory");
			info("Call the homeapplicancesSTZW function of application");
			HomeAppliancesShopByZopperWay.homeapplicancesSTZW();
			clickName(App_Constants.STZWReferigerator_name);
			info("Click on Referigerator option of Shop the zopper way");
			//longwaitForElement();
			waitforpresenceOfElement(App_Data.FindRefrigeratortext);
			info("Executing explicit wait");
			clickXpath(App_Constants.STZWPhotos_xpath);
			info("click on Medium button");
			waitforpresenceOfElement("SKIP");
			waitforpresenceOfElement("NEXT");
			invisibilityOfElementLocated(App_Constants.PageSpinner_id);
			clickName(App_Constants.STZWSkip_text);
			info("click on Skip link");
			clickXpath(App_Constants.STZWGaming_xpath);
			info("click on Single Door button");
			Assert.assertTrue(findElementByXpath(
					App_Constants.STZWFirstMobileProduct_text).isEnabled());
			info("first assertion verification");
			Assert.assertTrue(findElementByXpath(
					App_Constants.STZWSecondMobileproduct_text).isEnabled());
			info("second assertion verification");
			clickClassName(App_Constants.ProductDetailsBackbutton_class);
			info("clicking back button");
			waitforpresenceOfElement(App_Data.FindRefrigeratortext);
			waitforpresenceofxpathElement(App_Data.XpathofSecondElement);
			clickXpath(App_Constants.STZWPhotos_xpath);
			info("clicking on Double Door button");
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
			info("clicking on Multi Door button");
			Assert.assertTrue(findElementByXpath(
					App_Constants.STZWFirstMobileProduct_text).isEnabled());
			info("first assertion verification");
			Assert.assertTrue(findElementByXpath(
					App_Constants.STZWSecondMobileproduct_text).isEnabled());
			info("second assertion verification");

			endTestCase("ReferigeratorSTZWByMediumCategory");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			takeSnapShot("D:\\takeScreenshots", "ReferigeratorSTZWByMediumCategory");
			throw (e);
		}
		
	}

}
