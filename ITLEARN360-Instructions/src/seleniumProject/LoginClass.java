//By this selenium script, we will test the login process of e-commerce site. We will provide the correct email and password to login form and click on login button. 
//Here the are steps what we will perform to test login process
// 1. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
// 2. Initialize Webdriver object through ChromeDriver class.
// 3. Open login page of https://admin-demo.nopcommerce.com/login
// 4. Get reference of Email input box by locate the id method.
// 5. Clear the Email input box.
// 6. Get reference of Password input box by locate the id method.
// 7. Clear the Password input box.
// 8. Provide/Enter the correct email to email input box through reference.
// 9. Provide/Enter the correct password to password input box through reference.
// 10. Get reference of login button by locate the classname method.
// 11. Submit the button.
// 12. Close the web browser.
package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver browserObject;
		
//1.
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe" );
//2. 
		browserObject = new ChromeDriver();
//3.		
		browserObject.get("https://admin-demo.nopcommerce.com/login");
//4. 
		WebElement email=browserObject.findElement(By.id("Email"));
//5.
		email.clear();
//6. 
		WebElement password=browserObject.findElement(By.id("Password"));
//7. 
		password.clear();
//8. 
		email.sendKeys("admin@yourstore.com");
//9. 
		password.sendKeys("admin");
//10.
		WebElement button=browserObject.findElement(By.className("button-1"));
//11.
		button.submit();
//12. 
		browserObject.close();
		
		
		
	}

}
