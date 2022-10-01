package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Notification {
	WebDriver driver;
	
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

	@And("^I enter the name of user$")
	public void I_enter_the_name_of_user() throws Throwable {
		driver.findElement(By.className("app-aware-link global-nav__primary-link--active global-nav__primary-link")).sendKeys("trino hutasoit");
	}


}
