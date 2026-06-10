package stepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.*;

public class LoginSteps {
	WebDriver driver = new ChromeDriver();
	
	@Given("User is on ecommerce home page")
	public void user_is_on_ecommerce_home_page() throws InterruptedException {
		
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();			
	    driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
	    Thread.sleep(10000);
	}

	@When("User enters valid credentials")
	public void user_enters_valid_credentials(String user, String password) {
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("password");
	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	}

	@Then("User is on accountpage")
	public void user_is_on_accountpage() {
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		Assert.assertTrue("The nopCommerce store logo is not displayed!", logo.isDisplayed());
	}

}
