package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import browser1.Utilityclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;

	@Given("^User opens the browser$")
	public void user_opens_the_browser() throws Throwable {
		driver = Utilityclass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/login.htm");

	}

	@When("^User enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_username_and_password(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("^Validates the user credentials$")
	public void validates_the_user_credentials() throws Throwable {
		
		//WebDriverWait wait= new WebDriverWait(driver, 50);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Home")));
		//Assert.assertEquals(driver.getTitle(), "Home");
		System.out.println("Login Successfully !!");

	}

	@Given("^User have logged in with the credentials$")
	public void user_have_logged_in_with_the_credentials() throws Throwable {
		System.out.println("Home Page");
		driver = Utilityclass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("^User searches headphone in the search box$")
	public void user_searches_headphone_in_the_search_box() throws Throwable {
		//String b="head";
		System.out.println("1");
		 // driver.findElement(By.id("myInput")).sendKeys("headphone");
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("headphone");
		  System.out.println("2");
		  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		  System.out.println("3");


	}

	@Then("^Validating the outcome$")
	public void validating_the_outcome() throws Throwable {
		String a=driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(1) > center:nth-child(1) > h4")).getText();
		Assert.assertEquals(a, "Headphone");
		System.out.println("Search engine provides an acccurate result");
	}
}
