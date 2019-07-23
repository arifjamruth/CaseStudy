package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import browser1.Utilityclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef3N {
	WebDriver driver;
	
	@Given("^User opens the browser and User enters username and password$")
	public void user_opens_the_browser_and_User_enters_username_and_password() throws Throwable {
		driver = Utilityclass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/login.htm");
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@When("^User searches headphone in the search box \"([^\"]*)\"$")
	public void user_searches_headphone_in_the_search_box(String arg1) throws Throwable {
		//String b="head";
		System.out.println("1");
		 // driver.findElement(By.id("myInput")).sendKeys("headphone");
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys(arg1);
		  System.out.println("2");
		  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		  System.out.println("3");
			String a=driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(1) > center:nth-child(1) > h4")).getText();
			Assert.assertEquals(a, arg1);
			driver.close();

	}

	@Then("^Validating the search result$")
	public void validating_the_search_result() throws Throwable {

		System.out.println("Search engine provides an acccurate result");


	}

}
