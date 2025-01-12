package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.constatns;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {
	WebDriver driver = Hooks.driver; // Access the shared driver instance

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		driver.get("http://Google.com");
		System.out.println("Hello There");
	}

	@Then("enter text {string}")
	public void enter_text(String enteredname) {
		driver.findElement(By.xpath("//textarea[@aria-label=\"Search\"]")).sendKeys(enteredname);
		WebElement clickSearch = driver.findElement(By.xpath("//textarea[@aria-label=\"Search\"]"));
		clickSearch.sendKeys(Keys.ENTER);
		String title="TestMqvars";
		constatns.mqVars.put("homePageTitle",title);
	}

}
