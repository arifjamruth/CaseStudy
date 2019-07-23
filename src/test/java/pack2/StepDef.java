package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import browser1.Utilityclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	WebDriver driver;
	
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
		 driver = Utilityclass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/login.htm");
	}
	
	@When("^I complete action username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_complete_action_username_and_password(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
		
		System.out.println("Login Successfully !!");
		driver.close();

	}
}
