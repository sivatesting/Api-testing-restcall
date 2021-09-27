package RunnerCukes;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src/test/java/Feature"},
		glue = {"steps"},
		tags = {"@scenario1"},
		plugin = {
				"html:target/cucumber-reports/cucumbertestreport",
				"json:target/cucumber.json"			
		},
		dryRun = false,
		strict = true
		
		
		)



public class RunnerTest {
 
}
