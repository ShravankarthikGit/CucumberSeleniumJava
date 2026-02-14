package cucumberTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "Feature",
    glue = {"stepDefinition"},
    plugin = {"pretty", "html:target/cucumber-testng-reports.html"}
)
public class runtestTestNg extends AbstractTestNGCucumberTests {
    // No code needed here; extending AbstractTestNGCucumberTests handles the execution
}
