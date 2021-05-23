package week6.day1.assignment.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(dryRun = false, features = { "src/test/java/features/DuplicateLead.feature",
			"src/test/java/features/MergeLead.feature",
			"src/test/java/features/DeleteLead.feature" }, glue = {
					"week6/day1/assignment/stepdefinition" }, monochrome = true)

	public class TestRunner extends AbstractTestNGCucumberTests {

	}
