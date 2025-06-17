package WebPages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRMPage {
	
	
	WebDriver driver;
	public OrangeHRMPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
			}

	
	@FindBy(xpath = "//input[@name='username']")
	WebElement ele1;

	public void user(String name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(ele1));
	    ele1.sendKeys(name);
	}

	
	@FindBy(xpath="//input[@name='password']")
	WebElement ele2;
	public void pass(String name) {
		ele2.sendKeys(name);
	}
		
	@FindBy(xpath="//button[@type='submit']")
	WebElement ele3;
	public void log() {
		ele3.click();
	}
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement up;
	public void grade() {
	up.click();
	}
	public void navigate() {
        Set<String> windows=driver.getWindowHandles();
        String parent=driver.getWindowHandle();
        for(String all:windows) {
     	   if(!all.equals(parent)) {
     		   driver.switchTo().window(all);
     		   String name1=driver.getTitle();
     		   System.out.println("prints windows"+" "+name1);
     		   driver.switchTo().defaultContent();
     		   
     		   
     	   }
     	   
        }
}
	
@FindBy(xpath="//span[text()='Admin']")
WebElement admin;
public void adClick() {
	admin.click();
}
	
	
	
	
	
	
}
