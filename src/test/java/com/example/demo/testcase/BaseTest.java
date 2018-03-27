package com.example.demo.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@ContextConfiguration(locations = {"classpath*:/applicationContext.xml"})
public class BaseTest extends AbstractTestNGSpringContextTests {
	
	@Autowired
	protected WebDriver driver;

	
	@BeforeTest
	public void beforeTest() {
		driver.get("https://www.126.com");
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
