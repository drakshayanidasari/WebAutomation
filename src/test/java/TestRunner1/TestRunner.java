package TestRunner1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:/Users/Lenovo/git/Gitproject1/CucumberProject/src/test/java/Feature1/Search1.feature",
    glue = {"StepDefinition1"},
    plugin = {"pretty", "html:target/cucumber-report.html","rerun:target/failed_scenarios.txt"},
    
    monochrome = true
)
public class TestRunner {
}
