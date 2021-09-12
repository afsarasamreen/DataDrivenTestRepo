package cucumberTags;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags={"@Smoke,@Functional"},
		features= {"src/test/resources/CucumberTagsFeatures"},
		glue={"cucumberTags"},
		plugin= {
				"pretty",
				"html:target/cucumberhtmlreportstags",
				"json:target/cucumberjasonreporttags.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/extentreportstags.html"
		}
		)
public class CucumberTagsRunner {

}
