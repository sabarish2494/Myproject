package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void chromeBrowser() {
		
WebDriverManager.chromedriver().setup(); // instead of system.Setproperties
driver = new ChromeDriver();
	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void maxmizeWindow() {
		driver.manage().window().maximize();
}
	public static void fillText(WebElement element, String value) {
		element.sendKeys(value);

	}
		public static void clickbutton(WebElement ref) {
			ref.click();
		}
}
