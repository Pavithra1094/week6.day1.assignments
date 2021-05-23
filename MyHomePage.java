package week6.day1.assignment.stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class MyHomePage extends BaseSetup {

	@And("Click Leads Tab")
	public void clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
	}

}