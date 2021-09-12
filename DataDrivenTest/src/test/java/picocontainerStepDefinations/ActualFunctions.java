package picocontainerStepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ActualFunctions {
	WebDriver driver;
	public ActualFunctions(SharedMemory share)
	{
		driver=share.setup();
	}
	@When("^user enters username in textbox$")
	public void user_enters_username_in_textbox() throws Throwable {
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}

	@When("^user enters password$")
	public void user_enters_password() throws Throwable {
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
  
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    driver.findElement(By.id("btnLogin")).click();
 
	}

	@Then("^veriy title of current page$")
	public void veriy_title_of_current_page() throws Throwable {
	  String actualTitle=driver.getCurrentUrl();
	  boolean status=actualTitle.contains("dashboard");
	  Assert.assertEquals(true,status);
	}

	@Then("^veriy text present in username feild$")
	public void veriy_text_present_in_username_feild() throws Throwable {
	   String value= driver.findElement(By.id("txtUsername")).getAttribute("value");
        Assert.assertEquals("Admin", value);
	}
}
