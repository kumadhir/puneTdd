package test.java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegressionSteps {
	@Given("^employee post \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void employee_post_and_and(String arg1, String arg2, String arg3) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^Click on \"([^\"]*)\"$")
	public void Click_on(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^System display a \"([^\"]*)\"$")
	public void System_display_a(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

}
