package cucumberTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPageObjects;

public class SeleniumTest {
	protected static WebDriver driver;

	@Test
	public void TestLogin() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.aa.com");
		driver.manage().window().maximize();

		// Create Object for page object class and pass driver
		LoginPageObjects pageobject = new LoginPageObjects(driver);

		pageobject.OriginAirportField().click();
		pageobject.OriginAirportField().clear();
		pageobject.OriginAirportField().sendKeys("PHX");

		// Call method from page object class and pass driver to the method
		LoginPageObjects.DestinationAirportField(driver).click();
		LoginPageObjects.DestinationAirportField(driver).clear();
		LoginPageObjects.DestinationAirportField(driver).sendKeys("DFW");
		pageobject.LeavingOnDate().click();
		Thread.sleep(5000);
		driver.findElement(By.id("flightSearchForm.button.reSubmit")).click();
	}
}
