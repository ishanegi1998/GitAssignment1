package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/hooks.feature", glue = { "hooks_stepdef" },monochrome = true,
strict = true ,/*plugin = {
		"pretty", "html:target/reports/cucumber.html", "pretty", "json:target/reports/cucumber.json", "pretty",
		"junit:target/reports/cucumber.xml" },*/


plugin = 
     {"pretty" ,"html:target/Reports/cucumber-reports",
             "json:target/Reports/Cucumber.json",
             "junit:target/Reports/Cucumber.xml",
            
              })


public class Hooks {

}
