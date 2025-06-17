package PracticeCucumber;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import WebPages.OrangeHRMPage;

public class OrangeAutomate {
WebDriver driver;
OrangeHRMPage orp;

@Test(priority=0)
public void setUp() {
	driver =new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
}

@Test(priority=1)
public void step1() {
	
	
	orp=new OrangeHRMPage(driver);
	
	orp.user("Admin");
	orp.pass("admin123");
	orp.log();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	orp.grade();
	orp.navigate();
	
	orp.adClick();
	
}












@Test(priority=10)
public void tearDown() {
	driver.close();
}


}
