package cucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"}, glue = {"stepDefinations"},plugin = {"pretty","html:target/cucumberHTMLReportJunit",
		"json:target/cucumberJunitJSON.json","junit:target/cucumber.xml"},dryRun = false,monochrome = true,strict = true)//tags ="@smokeTest,@RegTest"
public class TestRunnerJUnit  {

}