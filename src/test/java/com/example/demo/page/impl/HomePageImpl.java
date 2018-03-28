package com.example.demo.page.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.example.demo.page.HomePage;
import com.example.demo.page.LoginPage;

public class HomePageImpl implements HomePage{
	@FindBy(linkText="")
	private WebElement exitLink;
	private LoginPage loginPage;
	private WebDriver driver;
	public HomePageImpl(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@Override
	public LoginPage clickExitLink() {
		// TODO Auto-generated method stub
		return loginPage;
	}
}
