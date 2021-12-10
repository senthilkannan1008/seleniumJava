package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPage {
	
	String browser;
	WebDriver driver;

	public RegistrationPage(String browserDriver) {
		this.browser = browserDriver;

	}

	public void browser() {
		switch (browser) {
		case "CHROME":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "EDGE":

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		}

	}

	public void webPage(String page) {
		driver.get(page);
	}

	public void sendKeys(String locator, String locRef , String locValue) {
		if (locator == "xpath" && locValue != null) {
			driver.findElement(By.xpath(locRef)).sendKeys(locValue);
		} else if (locator == "css" && locValue == null ){
			driver.findElement(By.cssSelector(locRef)).click();
		}else if (locator == "css" && locValue != null ){
			driver.findElement(By.cssSelector(locRef)).sendKeys(locValue);
		}
	}

}