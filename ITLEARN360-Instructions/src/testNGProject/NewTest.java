/*1. Open the browser.
2. Enter the url
3. Click on the shop button.
4. Click on home button
5. Testing homepage is having three sliders or not.
6. Clicking the image in the arrivals works or not.
7. Test whether it is navigating to next page where the user can add that book into his basket or not.
8. Clicking on Description tab for the book you clicked on works or not.
9.The description regarding that book the user clicked on should showing details or not.
10.Now click on reviews tab for the book you clicked on works or not.

*/

package testNGProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver browserObject;
  @Test (priority=1)
  public void f() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
browserObject = new ChromeDriver();
System.out.println("Open practiceautomationtesting.in");
browserObject.get("http://practice.automationtesting.in/");
browserObject.manage().window().maximize();
//Click on Shop//
browserObject.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();
Thread.sleep(3000);
// Click on Home//
browserObject.findElement(By.xpath("//*[@id=\"content\"]/nav/a")).click();
Thread.sleep(3000);
//Click on Image//
browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[1]/img")).click();
//click on add to basket//
browserObject.findElement(By.xpath("//*[@id=\"product-165\"]/div[2]/form/button")).click();


  } 
}
