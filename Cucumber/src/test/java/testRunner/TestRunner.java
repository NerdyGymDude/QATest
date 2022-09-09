package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
				features="C:\\Users\\Zack\\eclipse-workspace\\Cucumber\\src\\test\\java\\featurePackage\\loginexamp.feature",
				glue="stepDefinition",
				dryRun=false,
				monochrome=true
				)
				
public class TestRunner {

}
