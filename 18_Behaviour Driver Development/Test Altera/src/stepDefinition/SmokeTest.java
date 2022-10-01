package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	WebDriver driver;
	//Test LOgin
	
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
	}

	@When("^I enter my username and password correctly$")
	public void I_enter_my_username_and_password_correctly() throws Throwable {
	   driver.findElement(By.id("username")).sendKeys("kristinatampubolon45@gmail.com");
	   driver.findElement(By.id("password")).sendKeys("Linkedin1901");
	}

	@Then("^I am on the home page$")
	public void I_am_on_the_home_page() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
	}
}
	
