package PracticeCucumber;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Depends{
	WebDriver driver;

	@Test(priority=0)
	public void openApp() {
		driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
	}
	
	@Test(priority=1,dependsOnMethods="openApp")
	public void login() { 
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}
	//div[@class='inventory_item_price' and text()='29.99']
	//*[text()='29.99']
	
	
	@Test(priority=3)
	public void priceDetails() {
		try {
			Thread.sleep(2000);
		WebElement price=driver.findElement(By.xpath("//*[text()='29.99']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
	@Test(priority=10)
	public void logout() {
		try {
			Thread.sleep(2000);
		driver.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		
	}
	
}
