package scenarioStepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/ScenarioOutlineFeatures"},
		glue={"scenarioStepDefinations"},
				plugin= {
						"pretty",
						"html:target/cucumberhtmlreportsscenarioOutline",
						"json:target/cucumberjasonreportmultiplescenarioOutline.json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/extentreportstagsscenariooutline.html"
				}
		)
public class ScenarioOutLineRunner {

}
