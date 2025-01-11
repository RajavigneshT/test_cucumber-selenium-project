package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", // Path to your feature files
		glue = { "stepdefinitions", "hooks" }, // Package containing step defs and

		plugin = { "pretty", "html:target/cucumber-reports.html" }, monochrome = true)
public class TestRunner {

	// No code needed here. Cucumber will run based on annotations.
}
