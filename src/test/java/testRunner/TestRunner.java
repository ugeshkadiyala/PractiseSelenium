package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(  monochrome = true,
        plugin = {"pretty","html:cucumber-html/cucumber-html"},
        features = "C://Users//UgiMad//IdeaProjects//PractiseSelenium//PractiseSelenium//Features//OrangeHRM.feature",
        glue = "stepDefinitions" )

public class TestRunner {

}
