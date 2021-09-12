package picocontainerStepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/picocontainerFeatures"},
		glue= {"picocontainerStepDefinations"},
				plugin= {
						"pretty",
						"html:target/cucumberhtmlreportspicocontainer",
						"json:target/cucumberjasonreportpicocontainer.json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/extentreportstagspicocontainer.html"
				}
		)
public class Runner {

}
