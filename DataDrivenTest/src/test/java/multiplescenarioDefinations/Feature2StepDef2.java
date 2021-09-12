package multiplescenarioDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Feature2StepDef2 {
	WebDriver driver;
	@Given("^user need to be on google page$")
	public void user_need_to_be_on_google_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "D:\\selniumfiles\\chromeDriver92\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://www.google.com");
	}

	@When("^user enters text$")
	public void user_enters_text() throws Throwable {
	   driver.findElement(By.name("q")).sendKeys("mobiles");
	}

	@Then("^check value present in searchbox$")
	public void check_value_present_in_searchbox() throws Throwable {
		  String value= driver.findElement(By.name("q")).getAttribute("value");
           Assert.assertEquals("mobiles",value);
	}
}
