package com.BrowserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTestNg {
	@Test
	public void browserLaunch() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}

}
