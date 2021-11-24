package october.automation.pages.YMBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseYopmail extends BasePage {
	
	By inputSearch = By.xpath("//input[@id='login']");
	By enterSearch = By.xpath("//i[@class='material-icons-outlined f36']");
	By ambilPesan = By.xpath("//div[@id='mail']");
	
	public BaseYopmail(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	public void searchEmail(String email) {
		clickAndWaitByXpath(inputSearch);
		setText(inputSearch, email);
		enterTextByXpath(inputSearch);
	}
	
	public void getPesan() {
		String pesanYopmail = getText(ambilPesan);
		System.out.println(pesanYopmail);
	}

}
