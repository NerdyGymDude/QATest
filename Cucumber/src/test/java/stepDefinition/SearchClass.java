package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SearchClass {
	ChromeDriver driver;
	@Given("I am on google page {string}")
	public void i_am_on_google_page(String string) {
		// Write code here that turns the phrase above into concrete actions
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		        driver = new ChromeDriver();
		        driver.get(string);
	    
	}

	@When("I search = {string}")
	public void i_search(String string) {
		  // Write code here that turns the phrase above into concrete actions
				driver.findElement(By.name("q")).sendKeys(string);
	    
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		 // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("btnK")).submit();
		 
		 
	   
	}
	@Then("Open the Selenium Python Link")
	public void open_the_selenium_python_link() {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/div/a/h3")).click();
	  
	}
}
