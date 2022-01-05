package dtu.calculator;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleSteps {
	
	StringCalculator calc = new StringCalculator();

	@Given("input is {string}")
	public void inputIs(String int1) {
	    calc.input(int1);
	}

	@When("the add button is pressed")
	public void theAddButtonIsPressed() {
	    calc.add();
	}

	@Then("{int} is shown on the display.")
	public void theIsShown(Integer number) {
	    assertEquals((int)number,calc.display());
	}
}

