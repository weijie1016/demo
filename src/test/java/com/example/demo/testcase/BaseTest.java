package com.example.demo.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BaseTest extends AbstractTestNGSpringContextTests {
	
	@Autowired
	protected WebDriver driver;

	@BeforeClass
	public void beforeTest() {

		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.126.com");
	}
	@AfterClass
	public void afterTest() {
		driver.quit();
	}
}