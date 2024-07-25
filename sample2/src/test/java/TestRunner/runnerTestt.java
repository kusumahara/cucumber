package TestRunner;





import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features ={"src/test/resources/Features/Login1.feature"}
		,glue={"StepDefinitions"},
        plugin = {"pretty", "html:target/report/cucumber1.html",
        		  "json:target/report/cucumber.jason",
                   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
      // // plugin = {"pretty", "json:target/cucumber.json"})
		
	

public class runnerTestt {
	
	}