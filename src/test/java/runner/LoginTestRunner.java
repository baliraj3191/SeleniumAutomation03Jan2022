package runner;

import org.junit.runner.RunWith;


//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"features"},
		glue= {"com.facebook.stepDefination"},
		tags= {"@LoginTag"},
		plugin= {"pretty",
				"json:target/Reports/report.json",
				"junit:target/Reports/report.xml"},
		monochrome=true,dryRun=false)

public class LoginTestRunner {

}
