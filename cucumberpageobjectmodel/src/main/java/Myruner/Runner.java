package Myruner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:/Mani Selenium/cucumberpageobjectmodel/src/main/java/hello.feature"
		,glue={"Mystep"},
		format={"pretty", "junit:target/cucumber-reports/Cucumber.xml"}
		)
public class Runner {
	
	

}
//D:/Mani Selenium/cucumberpageobjectmodel/src/test/resources/featuree/page.feature