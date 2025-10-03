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

	@Given("I am on the landingpage")
	public void i_am_on_the_landingpage() throws InterruptedException {
		//driver.get("http://Google.com");
		driver.get("https://care-techfest-2025.netlify.app/#");
		Library library = new Library();
		library.takeScreenshot("LandingPage");
		Thread.sleep(1000);
		String buttontex=driver.findElement(By.xpath("//*[@id=\"enter-btn\"]")).getText();
		System.out.println("Button Name :::::"+buttontex);
		
		driver.findElement(By.xpath("//*[@id=\"enter-btn\"]")).click();
		
		
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
