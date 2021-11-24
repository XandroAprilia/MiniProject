package qaautomation.october2021.YMTest;

import org.testng.annotations.Test;

import october.automation.pages.YMBase.BaseYopmail;
import october.automation.pages.YMBase.CommonPage;
import utils.TestUtility;

public class YMTestRun extends BaseWebTest {

	CommonPage commonPage = new CommonPage(driver, explicitWait);
	BaseYopmail findMail = new BaseYopmail(driver, explicitWait);

	@Test
	public void testSwitching() {
		
		String inputEmail = "automationtest";
		findMail.searchEmail(inputEmail);
		TestUtility.hardWait(1);
		
		commonPage.siFrame();
		findMail.getPesan();
	}
}
