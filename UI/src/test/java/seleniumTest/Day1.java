package seleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * WebDriverManager.edgedriver().setup(); WebDriver driver = new EdgeDriver();
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * driver.manage().window().maximize();
		 * //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		 * System.out.println(driver.getTitle());
		 * driver.findElement(By.xpath("//input[@name='email']")).sendKeys(
		 * "archukannan@gmail.com");
		 * driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Krishna");
		 * driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9841094592")
		 * ; driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Chennai");
		 * driver.findElement(By.xpath("//div[@id='load_box']//input[@name='username']")
		 * ).sendKeys("kannan");
		 * driver.findElement(By.cssSelector("div[id='load_box'] input[name='password']"
		 * )).sendKeys("abcd");
		 * wait.until(ExpectedConditions.presenceOfElementLocated((By.
		 * cssSelector("div[id='load_box'] input[value='Submit']")))).click();
		 */

		RegistrationPage page = new RegistrationPage("test");
		page.browser();
		page.webPage("https://www.way2automation.com/way2auto_jquery/index.php");

		page.sendKeys("xpath", "//input[@name='email']", "archukannan@gmail.com");
		page.sendKeys("xpath", "//input[@name='name']", "Krishna");
		page.sendKeys("xpath", "//input[@name='phone']", "9841094592");
		page.sendKeys("xpath", "//input[@name='city']", "Chennai");
		page.sendKeys("xpath", "//div[@id='load_box']//input[@name='username']", "kannan");
		page.sendKeys("css", "div[id='load_box'] input[name='password']", "abcd");		
		page.sendKeys("css", "div[id='load_box'] input[value='Submit']", "");

	}

}
