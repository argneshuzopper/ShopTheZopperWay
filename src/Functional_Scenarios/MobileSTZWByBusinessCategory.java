package Functional_Scenarios;

import junit.framework.Assert;

import org.testng.annotations.Test;

import App_Functions.OpenHomePage;
import Page_Objects.App_Constants;
import Page_Objects.App_Data;

//Test Case Info: In this test case we are verifying whether  search results is displayed or not when we do Shop The Zopper Way for mobile
// By Business Filter by skipping budget

@SuppressWarnings("deprecation")
public class MobileSTZWByBusinessCategory extends BaseTest {

	@Override
	@Test
	public void executeTestCase() throws Exception {
		try{
			startTestCase(" MobileSTZWByBusiness");
			info("Call the Home page function of application");
			OpenHomePage.openHomePage();
			clickClassName(App_Constants.Open_Navigation_Drawer);
			info("open the navigation drawer of the app");
			clickName(App_Constants.NavDrawer_Mobile_tablets_link);
			info("open mobile and tablets link of the app");
			Assert.assertTrue(findElementByName(
					App_Constants.MobileAndTablets_text).getText().equals(
					App_Data.MobileAndtabletstext));
//			Assert.assertTrue(findElementByName(
//					App_Constants.MoreCategories_text).getText().equals(
//					App_Data.MoreCategoriestext));
			info("entered the assertion to verify the page");
			waitForElement();
			for (int i = 0; i < 2; i++) {
				swipeWithAxis(0, 1000, 0, 250, 3000);
			}
			info("swipe the android phone page");
			//clickId(App_Constants.AndroidPhoneGoAhead_id);
			

			clickId(App_Constants.ShopTheZopperWayMobile_id);
			info("Click on Mobile option of Shop the zopper way");
			//waitforpresenceOfElement("SKIP");
			//waitforpresenceOfElement("NEXT");
		//element =findElementByName(App_Constants.STZWSkip_text);
		//	wait.until(ExpectedConditions.refreshed(element);
		//TouchAction act = new TouchAction(driver);
	//	act.tap(680, 294);
			//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("com.zopperapp.dev:id/pb_location_parent")));
			invisibilityOfElementLocated(App_Constants.PageSpinner_id);
			//longwaitForElement();
		//driver.tap(1, 665, 309, 1);
			clickName(App_Constants.STZWSkip_text);
			//driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'SKIP')][@index=2]")).click();
			info("Click on Skip link");
			clickXpath(App_Constants.STZWBusiness_xpath);
			info("click on Business button");
			clickXpath(App_Constants.STZWGaming_xpath);
			info("click on Small button");
			Assert.assertTrue(findElementByXpath(App_Constants.STZWFirstMobileProduct_text).isEnabled());
			info("first assertion verification");
			Assert.assertTrue(findElementByXpath(App_Constants.STZWSecondMobileproduct_text).isEnabled());
			info("seconf assertion verification");
			clickClassName(App_Constants.ProductDetailsBackbutton_class);
			info("clicking back button");
			waitforpresenceOfElement(App_Data.FindMobilestext);
			waitforpresenceOfElement("SKIP");
			waitforpresenceofxpathElement(App_Data.XpathofSecondElement);
			clickXpath(App_Constants.STZWPhotos_xpath);
			info("clicking on Large button");
			Assert.assertTrue(findElementByXpath(App_Constants.STZWFirstMobileProduct_text).isEnabled());
			info("first assertion verification");
			Assert.assertTrue(findElementByXpath(App_Constants.STZWSecondMobileproduct_text).isEnabled());
			info("seconf assertion verification");
			clickClassName(App_Constants.ProductDetailsBackbutton_class);
			info("clicking back button");
			waitforpresenceOfElement(App_Data.FindMobilestext);
			waitforpresenceOfElement("SKIP");
			clickXpath(App_Constants.STZWBusiness_xpath);
			info("clicking on Jumbo button");
			Assert.assertTrue(findElementByXpath(App_Constants.STZWFirstMobileProduct_text).isEnabled());
			info("first assertion verification");
			Assert.assertTrue(findElementByXpath(App_Constants.STZWSecondMobileproduct_text).isEnabled());
			info("second assertion verification");
			endTestCase(" MobileSTZWByBusinesss");
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			takeSnapShot("D:\\takeScreenshots", "MobileSTZWByBusiness");
			throw(e);
			
		}
		
	}

}
