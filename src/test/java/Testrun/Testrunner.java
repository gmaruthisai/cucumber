package Testrun;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		//features="D://CucumberProject1//Features//Login.feature",
		features = "classpath:Features/Addjobs.feature",
		glue="Step_definitions",
		strict=true,// it will check if any step is not defined in Step Definitions file
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = {}
		)

public class Testrunner {
  
}
