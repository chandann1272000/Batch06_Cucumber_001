package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverini.DriverInit;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends DriverInit{
	
	@After
	public void afterTest() {
		driver.close();
	}
	
	@Given("User navigate to adactin login page")
	public void user_navigate_to_adactin_login_page() {
	    
	    driver.get("https://adactinhotelapp.com/");
	    
	}

	@When("User enter username and password {string} and {string}")
	public void user_enter_username_and_password_and(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.id("login")).click();
		System.out.println("User successfully loged in to his account");
		
	}
	
	@Given("User in search hotel page")
	public void user_in_search_hotel_page() {
		System.out.println("user is in search hotel page");
	   
	}

	@When("user fill the details like <{string}>, <{string}> and<{string}>")
	public void user_fill_the_details_like_and(String loca, String hot, String type) throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("cn1272000");
		driver.findElement(By.id("password")).sendKeys("cn@1272000");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		WebElement loc=driver.findElement(By.xpath("//select[@name='location']"));
		WebElement hotel=driver.findElement(By.id("hotels"));
		WebElement roomty=driver.findElement(By.id("room_type"));
		Select s=new Select(loc);
		s.selectByIndex(2);
		Select s1=new Select(hotel);
		s1.selectByIndex(1);
		Select s2=new Select(roomty);
		s2.selectByIndex(1);
		
	}

	@Then("User click on Search button")
	public void user_click_on_search_button() {
		driver.findElement(By.id("Submit")).click();
	}
	

}
