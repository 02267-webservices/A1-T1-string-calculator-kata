package dtu.calculator;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

import static org.junit.Assert.assertEquals;

/* Important: 
for Cucumber tests to be recognized by Maven, the class name has to have
either the word Test in the beginning or at the end. 
For example, the class name CucumberTests (Test with an s) will be ignored by Maven.
*/

@RunWith(Cucumber.class)
@CucumberOptions(plugin="summary"
			   , publish= false
			   , features = "C:\\Users\\Gunn\\OneDrive\\Documents\\DTU\\Master\\2semester\\Software Development of Web Services\\01. Task String Calculator kata\\CucumberExample\\src\\test\\java\\dtu\\calculator"  // directory of the feature files
			   , snippets = SnippetType.CAMELCASE
			   )
public class CucumberTest {


}
