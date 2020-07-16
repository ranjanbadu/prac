package Options;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feature/FlightTrip.feature", glue = { "Steps","Utility_cucumber"}, dryRun = false

		, monochrome = true, plugin = { "pretty", "summary","html:target/cucumber-reports/cucumber-pretty",
              "json:target/cucumber-reports/CucumberTestReport.json",
              "rerun:target/cucumber-reports/rerun.txt"}, strict = false, tags= {"@Smoke"}

)
public class TestRunner extends AbstractTestNGCucumberTests {


}
