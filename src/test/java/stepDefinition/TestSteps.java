package stepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	public static WebDriver driver;

	@Given("^User is on homepage$")
	public void user_is_on_homepage() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.aa.com");
		driver.manage().window().maximize();
	}

	@When("^User enters originairport$")
	public void user_enters_originairport() throws Throwable {
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("PHX");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^User enters destinationairport$")
	public void user_enters_destinationairport() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm.destinationAirport\"]")).sendKeys("DFW");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^User clicks on sumbit button$")
	public void user_clicks_on_sumbit_button() throws Throwable {
		driver.findElement(By.id("flightSearchForm.button.reSubmit")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("^correct url is displayed$")
	public void correct_url_is_displayed() throws Throwable {
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.aa.com/sorry.html")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}
		driver.close();
	}
}
