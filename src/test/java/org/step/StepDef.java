package org.step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDef {
	@Given("User enters background line one")
	public void user_enters_background_line_one() {
		System.out.println("background line one");
	}

	@When("User enters background line two")
	public void user_enters_background_line_two() {
		System.out.println("background line two");
	}

	@Given("User enters Scenario one line one")
	public void user_enters_Scenario_one_line_one() {
		System.out.println("Scenario one line one");
	}

	@When("User enters Scenario one line two")
	public void user_enters_Scenario_one_line_two() {
		System.out.println("Scenario one line two");
	}

	@Given("User enters Scenario two line one")
	public void user_enters_Scenario_two_line_one() {
		System.out.println("Scenario two line one");
	}

	@When("User enters Scenario two line two")
	public void user_enters_Scenario_two_line_two() {
		System.out.println("Scenario two line two");
		Assert.assertTrue(false);
	}

	@Given("User enters Scenario three line one")
	public void user_enters_Scenario_three_line_one() {
		System.out.println("Scenario three line one");
	}

	@When("User enters Scenario three line two")
	public void user_enters_Scenario_three_line_two() {
		System.out.println("Scenario three line two");
	}

}
