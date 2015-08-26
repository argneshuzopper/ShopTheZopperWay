package App_Functions;

import org.testng.annotations.Test;

import Functional_Scenarios.BaseTest;
import Page_Objects.App_Constants;
import Utility.User_Defined_Function;

public class OpenHomePage extends BaseTest {
	
	@Test
	public static void openHomePage(){
		try {
			clickClassName(App_Constants.Skip_button);
			info("Clicking the skip button");
			clickName(App_Constants.DetectAutomatically_name);
			info("Clicking the Auto detect button");
			clickId(App_Constants.SkipButton_id);
			info("Clicking the Skip button of login page");
		} catch (Exception e) {
			e.printStackTrace();
			User_Defined_Function.takeSnapShot("D:\\takeScreenshots", "OpenHomePageFunction");
			throw(e);
		}
	}

	

	@Override
	@Test
	public void executeTestCase() throws Exception {
		
		
	}

}
