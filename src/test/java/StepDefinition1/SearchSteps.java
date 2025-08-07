package StepDefinition1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	WebDriver driver;
	
	@Given("goto home page")
	public void goto_home_page() {
	driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://www.fairwaygolfusa.com");
	}

	@When("click the search bar")
	public void click_the_search_bar() {
	driver.findElement(By.id("search")).click();
	}
	
	@Then("enter {string}")
	public void enter(String string) {
		driver.findElement(By.name("search")).sendKeys(string);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}


}
