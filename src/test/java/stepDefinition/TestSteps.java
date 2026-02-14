package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration; // Modern replacement for TimeUnit

public class TestSteps {
    public static WebDriver driver;

    @Given("User is on homepage") // Simplified Cucumber 7 syntax
    public void user_is_on_homepage() {
        // Automatically manages the chromedriver version for you
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        // Selenium 4 uses Duration instead of TimeUnit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.aa.com");
        driver.manage().window().maximize();
    }

    @When("User enters originairport")
    public void user_enters_originairport() {
        driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("PHX");
    }

    @When("User enters destinationairport")
    public void user_enters_destinationairport() {
        driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm.destinationAirport\"]")).sendKeys("DFW");
    }

    @When("User clicks on sumbit button")
    public void user_clicks_on_sumbit_button() {
        driver.findElement(By.id("flightSearchForm.button.reSubmit")).click();
    }

    @Then("correct url is displayed")
    public void correct_url_is_displayed() {
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("sorry.html")) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Failed. Current URL: " + currentUrl);
        }
        driver.quit(); // Better practice than close() to kill the process
    }
}
