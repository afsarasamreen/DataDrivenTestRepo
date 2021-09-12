package multiplescenarioDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Feature1StepDef {
	WebDriver driver;
	@Given("^user need to be on HRM page$")
	public void user_need_to_be_on_HRM_page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "D:\\selniumfiles\\chromeDriver92\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	   System.out.println("Welcome");
	}

	@When("^user enters username$")
	public void user_enters_username() throws Throwable {
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin"); 
	   System.out.println("Welcome2");

	}

	@Then("^check value present in username$")
	public void check_value_present_in_username() throws Throwable {
		 String value= driver.findElement(By.id("txtUsername")).getAttribute("value");  
         Assert.assertEquals("Admin", value);
  	   System.out.println("Welcome3");

	}
}
