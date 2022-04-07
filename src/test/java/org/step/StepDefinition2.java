package org.step;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 extends BaseClass
{


@When("user click the departure and arrival airport date and passenger deatils")
public void user_click_the_departure_and_arrival_airport_date_and_passenger_deatils() throws InterruptedException, AWTException {
	//Thread.sleep(3000);
	//driver.findElement(By.id("tarteaucitronPersonalize2")).click();
	driver.manage().deleteAllCookies();
	driver.switchTo().frame("iframe_resa");
	WebElement oneway=driver.findElement(By.xpath("//li[@class='one-way']//child::a"));
	clickbutton(oneway);
	//JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement selectdropdown=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		clickbutton(selectdropdown);
		WebElement Lyon = driver.findElement(By.xpath("//a[text()='Lyon']"));
		clickbutton(Lyon);
		WebElement Alger = driver.findElement(By.xpath("(//a[text()='Alger'])[2]"));
	clickbutton(Alger);
	WebElement datebox=driver.findElement(By.xpath("//input[@class='DatePicker form-control-position departure']"));
	clickbutton(datebox);
	WebElement date = driver.findElement(By.xpath("//td[text()='22']"));
	clickbutton(date);
	WebElement passenger = driver.findElement(By.xpath("//input[@id='resume-passenger']"));
	clickbutton(passenger);
	
	for (int i = 0; i < 4; i++) 
	{
		WebElement adultincbtn=driver.findElement(By.xpath("(//button[@class='btn btn-default btn-increase'])[1]"));
		clickbutton(adultincbtn);
		Thread.sleep(3000);
	}
	for (int j = 0; j < 2; j++) 
	{
		WebElement childbtn=driver.findElement(By.xpath("(//button[@class='btn btn-default btn-increase'])[2]"));
		clickbutton(childbtn);
		Thread.sleep(3000);
	}
	WebElement closebtn=driver.findElement(By.xpath("//button[text()='Close']"));
	clickbutton(closebtn);
	

}

@When("user click the search button")
public void user_click_the_search_button() {
	WebElement searchbtn=driver.findElement(By.xpath("//div[@class='col-xs-12 search no-padding']/child::button"));
	clickbutton(searchbtn);
}

@Then("user will navigate the flight details page")
public void user_will_navigate_the_flight_details_page() {
}


}
