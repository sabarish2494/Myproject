package org.step;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass
{
	


@Given("user should be in ASl login page")
public void user_should_be_in_ASl_login_page() {
	chromeBrowser();
	launchUrl("https://www.aslairlines.fr/en/");
	maxmizeWindow();
	//WebElement myaccount=driver.findElement(By.xpath("//li[@id='menu-item-13427']"));
	//clickbutton(myaccount);
}

@When("user enter the invalid {string} and {string}")
public void user_enter_the_invalid_and(String username, String password) {
	WebElement email=driver.findElement(By.xpath("//input[@class='form-control text-box single-line']"));
	fillText(email,username);
	WebElement pass=driver.findElement(By.xpath("//input[@class='form-control']"));
	fillText(pass,password);
}

@When("user click the login button")
public void user_click_the_login_button() {
	WebElement loginbtn=driver.findElement(By.xpath("//button[@id='btnLoginAction']"));
	clickbutton(loginbtn);
}

@Then("user will navigate to the invalid credential page")
public void user_will_navigate_to_the_invalid_credential_page() 
{
	System.out.println("User enter invalid username and password");
	driver.quit();
}


}
