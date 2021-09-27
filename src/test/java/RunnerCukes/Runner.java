package RunnerCukes;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith (Cucumber.class) 
@CucumberOptions(features = {"./src/test/java/Feature/Test.feature"}, glue = {"steps"}, monochrome=true, tags = {"@scenario1"} ,
dryRun = false, plugin = {"pretty", "html:target/cucumber"})

public class Runner { 
	 
	 
}


