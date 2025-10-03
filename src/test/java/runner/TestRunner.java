package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", // Path to your feature files
        tags="@Ecomweb",
		glue = { "stepdefinitions", "hooks" }, // Package containing step defs and
		//plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" },
		monochrome = true)
public class TestRunner {

	// No code needed here. Cucumber will run based on annotations.
}
