package picocontainerStepDefinations;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;

public class CommonMethods {

	WebDriver driver;
	public CommonMethods(SharedMemory share)
	{
		driver=share.setup();
	}
	@Given("^user need to be on HRM login page$")
	public void user_need_to_be_on_HRM_login_page() throws Throwable {
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

}
