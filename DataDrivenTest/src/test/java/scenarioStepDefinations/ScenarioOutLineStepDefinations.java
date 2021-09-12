package scenarioStepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutLineStepDefinations {
	private WebDriver driver;
	@Given("^user need to be on HRM Login Page$")
	public void user_need_to_be_on_HRM_Login_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\selniumfiles\\chromeDriver92\\chromedriver.exe" );
	    driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("^user enters \"([^\"]*)\" username$")
	public void user_enters_username(String username) throws Throwable {
	   driver.findElement(By.id("txtUsername")).sendKeys(username);
	}

	@Then("^check  username present in feild or not$")
	public void check_username_present_in_feild_or_not() throws Throwable {
		   String uname=driver.findElement(By.id("txtUsername")).getAttribute("value");
   Assert.assertEquals("Admin",uname);
	}

}
