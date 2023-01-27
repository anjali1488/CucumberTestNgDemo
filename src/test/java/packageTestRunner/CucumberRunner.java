package packageTestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Feature",
		glue = {"packageStepDefinitions"},
		//this plugin "usage" generates the time taken by each step or method
		//plugin = {"usage"},
		
		//this will generate an html report in target folder using pretty plugin
		//plugin = {"pretty", "html:target/cucumber-reports.html"},
		
		plugin = {"pretty", "json:target/cucumber-reports/cucumber.json",
				"html:target/cucumber-reports.html",
				"junit:target/cucumber-reports/cucumber.xml"},
		monochrome = true
		//tags = "@ToBeRun"
		)

public class CucumberRunner extends AbstractTestNGCucumberTests{

}
