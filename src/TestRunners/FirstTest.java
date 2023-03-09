package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/features",
		glue= {"stepDefinitions"
},
		plugin= {
				"html:reporting/CucumberHTMLReports/FirstTest"
				
		},tags= {"@smoke or @Regression"}
)	
public class FirstTest {

}
