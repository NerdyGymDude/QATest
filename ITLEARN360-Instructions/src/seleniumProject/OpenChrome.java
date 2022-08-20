// In this selenium code we are opening google website link using chromeDriver
// Steps to perform 
// 1. setup the property of chromedriver to open google page through chrome web browser.
// 2. Initialize Webdriver object through ChromeDriver class.
// 3. Open the http://www.google.com/ link using get method.

package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		browserObject.get("http://www.google.com");
		
		
		}

}
