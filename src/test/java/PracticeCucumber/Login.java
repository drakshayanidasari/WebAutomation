package PracticeCucumber;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import WebPages.LoginPage;

public class Login {
WebDriver driver;
LoginPage lg=new LoginPage(driver);


		@Test(priority=0)
		public void setUp() {
			driver =new ChromeDriver();
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().deleteAllCookies();
		}
		@Test(priority=8)
		public void staticTable() {
	    lg.selectTable();
         lg.selectRow();
	    
		}
	    @Test(priority=1,enabled=false)
		public void log() {
			
    lg.name("admin");
    lg.password("admin123");
    lg.number("47924712323232");
    lg.colony("streetNo-14,tharnaka,hyd");
		}
		
    @Test(priority=2,enabled=false)
    public void clickButton() {
    lg.sex();
    }
    
    @Test(priority=3,enabled=false)
    public void clickCheck() {
    lg.checkbox();
    	}
    
    @Test(priority=4,enabled=false)
    public void selectCountry() {
    lg.country();
    	}

    @Test(priority=5,enabled=false)
    public void selectColor() {
    lg.selectColor();
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    	}
    
		@Test(priority=10)
		public void tearDown() {
			driver.close();
		}
		
	}
		


