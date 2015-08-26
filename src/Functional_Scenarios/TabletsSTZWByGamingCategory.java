package Functional_Scenarios;

import junit.framework.Assert;

import org.testng.annotations.Test;

import App_Functions.OpenHomePage;
import Page_Objects.App_Constants;
import Page_Objects.App_Data;

//Test Case Info: In this test case we are verifying whether search results is displayed or not when we do Shop The Zopper Way for tablets
//By Reading Filter by skipping budget

@SuppressWarnings("deprecation")
public class TabletsSTZWByGamingCategory extends BaseTest {

	@Override
	@Test
	public void executeTestCase() throws Exception {
		try {
			startTestCase("TabletsSTZWByGaming");
			info("Call the Home page function of application");
			OpenHomePage.openHomePage();
			clickClassName(App_Constants.Open_Navigation_Drawer);
			info("open the navigation drawer of the app");
			clickName(App_Constants.NavDrawer_Mobile_tablets_link);
			info("open mobile and tablets link of the app");
			Assert.assertTrue(findElementByName(
					App_Constants.MobileAndTablets_text).getText().equals(
					App_Data.MobileAndtabletstext));

			info("entered the assertion to verify the page");
			waitForElement();
			for (int i = 0; i < 2; i++) {
				swipeWithAxis(0, 1000, 0, 250, 3000);
			}
			info("swipe the android phone page");

			clickId(App_Constants.ShopTheZopperWayTablet_id);
			info("Click on Tablets option of Shop the zopper way");
			invisibilityOfElementLocated(App_Constants.PageSpinner_id);
			//longwaitForElement();
			//driver.tap(1, 665, 309, 1);
			clickName(App_Constants.STZWSkip_text);
			// driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'SKIP')][@index=2]")).click();
			info("Click on Skip link");
			clickXpath(App_Constants.STZWPhotos_xpath);
			info("click on Gaming button");
			clickXpath(App_Constants.STZWGaming_xpath);
			info("click on Calling button");
			Assert.assertTrue(findElementByXpath(
					App_Constants.STZWFirstMobileProduct_text).isEnabled());
			info("first assertion verification");
			Assert.assertTrue(findElementByXpath(
					App_Constants.STZWSecondMobileproduct_text).isEnabled());
			info("seconf assertion verification");
			clickClassName(App_Constants.ProductDetailsBackbutton_class);
			info("clicking back button");
			invisibilityOfElementLocated(App_Constants.PageSpinner_id);
			clickXpath(App_Constants.STZWPhotos_xpath);
			info("Clicking on Non calling button");
			Assert.assertTrue(findElementByXpath(
					App_Constants.STZWFirstMobileProduct_text).isEnabled());
			info("first assertion verification");
			Assert.assertTrue(findElementByXpath(
					App_Constants.STZWSecondMobileproduct_text).isEnabled());

			endTestCase("TabletsSTZWByGaming");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			takeSnapShot("D:\\takeScreenshots", "TabletsSTZWByGaming");
			throw(e);
		}

		
	}

}
