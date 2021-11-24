package october.automation.pages.MMTripBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.TestUtility;

public class HomeMakeMyTrip extends BasePage {
	
	By hilangkanIklan = By.xpath("//span[@class='langCardClose']");

	By clickFrom = By.cssSelector(".loginModal.displayBlock.modalLogin.dynHeight.personal");
	By clickFrom2 = By.xpath("//span[normalize-space()='From']");
	
	By inputFrom = By.xpath("//input[@placeholder='From']");
	By chooseFrom = By.xpath("//p[normalize-space()='New Delhi, India']");
	
	By inputTo = By.xpath("//input[@placeholder='To']");
	By chooseTo = By.xpath("//p[normalize-space()='Jakarta, Indonesia']");
	
	By chooseCalen = By.xpath("//span[normalize-space()='DEPARTURE']");
	By chooseDate = By.xpath("//div[@aria-label='Mon Nov 22 2021']");

	By searchButton = By.xpath("//a[normalize-space()='Search']");
	
	By cheapButton = By.xpath("(//div[contains(@class,'clusterTabHeadList makeFlex')])[2]");
	
	By hargaMurah = By.xpath("(//div[@class='appendBottom15'])[1]");
	
	
	public HomeMakeMyTrip(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver.get(), this);
	}
	
	public void From(String fDes) {
		clickAndWaitByXpath(hilangkanIklan);
		clickAndWaitByXpath(clickFrom);		
		clickAndWaitByXpath(clickFrom2);
		setText(inputFrom, fDes);
		TestUtility.hardWait(1);
		clickAndWaitByXpath(chooseFrom);
	}
	
	public void ToDestination(String user) {
		setText(inputTo, user);
		TestUtility.hardWait(1);
		clickAndWaitByXpath(chooseTo);	
		TestUtility.hardWait(1);
	}
	
	public void CalenDepar(String date) {
		clickAndWaitByXpath(chooseCalen);
		clickAndWaitByXpath(chooseDate);
		TestUtility.hardWait(1);
		clickAndWaitByXpath(searchButton);
	}

	public void HargaTermurah() {
		// TODO Auto-generated method stub
		clickAndWaitByXpath(cheapButton);
		String cheapPrice = getText(hargaMurah);
		System.out.println(cheapPrice);
	}
	
}
