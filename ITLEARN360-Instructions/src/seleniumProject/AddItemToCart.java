package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddItemToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("http://ect.itlearn360.com/customer/login");
        driver.manage().window().maximize();
        
                WebElement customer_icon= driver.findElement(By.xpath("/html/body/nav/div/ul/li[2]/a"));
        customer_icon.click();
    
                    driver.findElement(By.name("email")).sendKeys("training@infotek-solutions.com");
        driver.findElement(By.name("password")).sendKeys("Test1234$");
        driver.findElement(By.id("customerloginForm")).click();
    
                   //Go to home page and add items to cart 

        WebDriverWait wait=new WebDriverWait(driver, 20);
        WebElement home= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText( "Home")));
        home.click();
        
        WebElement addCart= driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/p/a"));
        addCart.click();
        
        
        WebElement cart_button_top=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/nav/div/ul/li[3]/a")));
        cart_button_top.click();
	}

}
