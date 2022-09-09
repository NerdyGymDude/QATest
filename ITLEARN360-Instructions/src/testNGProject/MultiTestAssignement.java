package testNGProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class MultiTestAssignement {
	
	WebDriver driver;
	@Test(priority = 1)
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Open practiceautomationtesting.in");
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();		 
	 driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();
	 Thread.sleep(3000);
	}
	  @Test (priority =2)
	  public void clickonHome() {
		  System.out.println("click on home");
		  driver.findElement(By.xpath("//*[@id=\"content\"]/nav/a")).click();
		  
	  }
	  
}




