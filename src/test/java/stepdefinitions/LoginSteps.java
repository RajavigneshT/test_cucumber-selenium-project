package stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.constatns;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utlity.*;

public class LoginSteps {
	WebDriver driver = Hooks.driver; // Access the shared driver instance

	@Given("I am on the login page")
	public void i_am_on_the_login_page() throws InterruptedException {
		//driver.get("http://Google.com");
		driver.get("https://www.flipkart.com/");
		Library library = new Library();
		library.takeScreenshot("Login Page");
		
		
		//System.out.println("Hello There");
		//enter_text("Raja");
	}

	@Then("enter text {string}")
	public void enter_text(String enteredname) throws InterruptedException {
		WebElement searchbox=driver.findElement(By.xpath("(//*[@title=\"Search for Products, Brands and More\"])[2]"));
		searchbox.sendKeys(enteredname);
		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		String phoneModel=driver.findElement(By.xpath("//*[@class=\"KzDlHZ\"]")).getText();
		System.out.println("Display Phone model:\n"+phoneModel );
		Library library = new Library();
		library.takeScreenshot("Product Page");
		
		String title = "TestMqvars";
		constatns.mqVars.put("mapphoneModel", phoneModel);
	}

}
