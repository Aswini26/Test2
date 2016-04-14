package com.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseSetup {
	WebDriver driver;
	@BeforeSuite
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
				
	}
	@Test
	public void call()
	{
		driver.get("https://ie-cons-portal-tst.optum.com/ie-portal-webapp/index.jsp#/benefitfinder/answerquestions/core");
	}


}
