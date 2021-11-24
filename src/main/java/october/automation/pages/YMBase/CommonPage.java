package october.automation.pages.YMBase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPage extends BasePage {

	public CommonPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver.get(), this);
	}

	public void openURL(String url) {
		driver.get().get(url);
	}

	public void runJavaScriptCommand(String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript(script);
	}

	public void acceptAlert() {
		driver.get().switchTo().alert().accept();
	}
	
	public void siFrame() {
		WebElement iFrame = driver.get().findElement(By.xpath("//iframe[@id='ifmail']"));
		driver.get().switchTo().frame(iFrame);
	}


}
