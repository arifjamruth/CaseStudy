package pack4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browser1.Utilityclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef4 {
	WebDriver driver;
	
@Given("^Alex has registered to the TestMeApp$")
public void alex_has_registered_to_the_TestMeApp() throws Throwable {
	driver = Utilityclass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/login.htm");
	driver.findElement(By.name("userName")).sendKeys("Lalitha");
	driver.findElement(By.name("password")).sendKeys("Password123");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
}

@When("^Alex searches for a particular product like headphones$")
public void alex_searches_for_a_particular_product_like_headphones() throws Throwable {
	System.out.println("1");
	 // driver.findElement(By.id("myInput")).sendKeys("headphone");
	driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("headphone");
	  System.out.println("2");
	  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	  System.out.println("3");
	 
}

@When("^try to proceed to payment with adding to the cart$")
public void try_to_proceed_to_payment_with_adding_to_the_cart() throws Throwable {
	System.out.println("Search engine provides an acccurate result");
	 driver.findElement(By.partialLinkText("Add to cart")).click();
	  driver.findElement(By.partialLinkText("Cart")).click();
	  String check= driver.findElement(By.xpath("//h4[@class='nomargin']")).getText();
	  System.out.println(check);
}

@Then("^TestMeApp does show the cart item$")
public void testmeapp_does_show_the_cart_item() throws Throwable {
	System.out.println("Search engine provides an acccurate result");
}
}
