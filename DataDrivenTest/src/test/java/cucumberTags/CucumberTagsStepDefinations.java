package cucumberTags;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberTagsStepDefinations {
	WebDriver driver;
	@Given("^user need to be on hrm login page$")
	public void user_need_to_be_on_hrm_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\selniumfiles\\chromeDriver92\\chromedriver.exe" );
	    driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("^user enter username$")
	public void user_enter_username() throws Throwable {
		   driver.findElement(By.id("txtUsername")).sendKeys("Admin");

	}

	@Then("^check username present in the feild or not$")
	public void check_username_present_in_the_feild_or_not() throws Throwable {
		 String uname=driver.findElement(By.id("txtUsername")).getAttribute("value");
		 System.out.println(uname); 
		 Assert.assertEquals("Admin",uname);
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
	   driver.close();
	}

	@When("^user enter password$")
	public void user_enter_password() throws Throwable {
		   driver.findElement(By.id("txtPassword")).sendKeys("admin123");

	}

	@Then("^check password present in the feild or not$")
	public void check_password_present_in_the_feild_or_not() throws Throwable {
		 String pass=driver.findElement(By.id("txtPassword")).getAttribute("value");
		System.out.println(pass);
		 Assert.assertEquals("admin123",pass);   
	}
}
