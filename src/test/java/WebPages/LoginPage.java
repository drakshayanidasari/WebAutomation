package WebPages;
	
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver,this );
		
		}

@FindBy(xpath="//input[@id='name']")
WebElement username;
public void name(String name1) {
	username.sendKeys(name1);
}

@FindBy(xpath="//input[@id='email']")
WebElement password;
public void password(String pass1) {
	password.sendKeys(pass1);
}

@FindBy(xpath="//input[@id='phone']")
WebElement num;
public void number(String no) {
	num.sendKeys(no);
}

@FindBy(xpath="//textarea[@id='textarea']")
WebElement adress;
public void colony(String adre) {
	adress.sendKeys(adre);
}
@FindBy(xpath="//input[@id='female']")
WebElement gender;
public void sex() {
	gender.click();
}

@FindBy(xpath="//div[@class='form-group'][4]/div")
List<WebElement> ch1;
public void checkbox() {
	for(int i=1;i<ch1.size()-1;i++) {
		if(ch1.get(i).getText()=="sunday" & ch1.get(i).getText()=="saturday" ) {
			break;
		}
		else {
			ch1.get(i).click();
		}
	}
	
}
	@FindBy(xpath="//select[@id='country']")
     WebElement s;
public void country() {
   Select options=new Select(s);
   options.selectByValue("france");
   }
 @FindBy(xpath="//select[@id='colors']")
WebElement color;
 public void selectColor() {
	 Actions a=new Actions(driver);
	 Select options=new Select(color); 
	 options.selectByValue("red");
	 
	 a.sendKeys(Keys.SHIFT);
	 a.sendKeys(Keys.ARROW_DOWN);
 }
@FindBy(xpath="//input[@id='datepicker']")
WebElement date;
public void picker() {
	
}
@FindBy(xpath="//table[@name='BookTable']/tbody//th[1]")
WebElement group;
public void selectTable() {
	String name=group.getText();
	System.out.println(name);
}

	@FindBy(xpath="//table[@name='BookTable']/tbody//td[1]")
	List<WebElement> coloums;
	public void selectRow() {
		
	for(WebElement row:coloums)
	{
	
		String name1=row.getText();
	
		 System.out.println(name1);
	} 
	
	
	}
	
	
	}
	
	
	











































