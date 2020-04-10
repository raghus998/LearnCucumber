package cucumberRunner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/java/features"},glue = {"stepDefinations"},plugin = {"pretty","html:target/cucumberTestNG",
"json:target/cucumberTestngJson.json"},monochrome = true,strict = true)
//@Test
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {
@Test
public void testA()
{
	
}
}
