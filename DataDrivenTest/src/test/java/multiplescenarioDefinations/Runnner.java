package multiplescenarioDefinations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/multipleFeatures"},
		glue={"multiplescenarioDefinations"},
				plugin= {
						"pretty",
						"html:target/cucumberhtmlreportsmultiple",
						"json:target/cucumberjasonreportmultiple.json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/extentreportstagsmultiple.html"
				}
		)
public class Runnner {

}
