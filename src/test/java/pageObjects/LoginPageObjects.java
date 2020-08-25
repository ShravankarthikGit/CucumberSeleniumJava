package pageObjects;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPageObjects {
	private WebDriver driver;
	public LoginPageObjects (WebDriver driver) {
		this.driver = driver;
	}
	

	public WebElement OriginAirportField() {	
		WebElement origin = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		return origin;
	}
	
	public static WebElement DestinationAirportField(WebDriver driver) {	
		WebElement destination = driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm.destinationAirport\"]"));
		return destination;
	}
	

/*	public List<WebElement> Calendarbox () {	
		//List<WebElement> CalBox = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody//td"));
		List<WebElement> CalBoxFirst = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table//td"));
		
		List<WebElement> CalBoxLast = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table//td"));
		
		List<WebElement> CalBox = new ArrayList<>();

		CalBox.addAll(CalBoxFirst);
		CalBox.addAll(CalBoxLast);
		
		
		
		return CalBox;
	}*/
	
	public List<WebElement> CalendarboxFirst () {	
		List<WebElement> CalBox = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table//td"));
		return CalBox;
	}
	
	public List<WebElement> CalendarboxLast () {	
		List<WebElement> CalBox = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table//td"));
		return CalBox;
	}
	
	public WebElement LeavingOnDate() {	
		WebElement Leaveon = driver.findElement(By.xpath("//*[@id=\"aa-leavingOn\"]"));
		return Leaveon;
	}
	
	
	public WebElement ReturningFromDate() {	
		WebElement Leaveon = driver.findElement(By.xpath("//*[@id=\"aa-returningFrom\"]"));
		return Leaveon;
	}
	
}
