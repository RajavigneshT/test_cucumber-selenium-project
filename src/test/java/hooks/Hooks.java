package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.constatns;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	public static WebDriver driver; // Shared WebDriver instance

	@Before
	public void setUp() {
		System.out.println("Initializing Firefox browser");

		// Set the path to the GeckoDriver executable
		System.setProperty("webdriver.geckodriver.driver", "D:\\Drivers\\geckodriver");

		// Initialize the FirefoxDriver
		driver = new FirefoxDriver();

		// Maximize the browser window
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		System.out.println(constatns.mqVars.get("homePageTitle"));
		System.out.println("Closing Firefox browser");

		// Quit the WebDriver instance
		if (driver != null) {
			driver.quit();
		}
	}
}