package com.example.demo.page.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.page.HomePage;
import com.example.demo.page.LoginPage;

public class LoginPageImpl implements LoginPage {
	@FindBy(id="x-URS-iframe")
	private WebElement frame;
	@FindBy(name="email")
	private WebElement username;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(id="dologin")
	private WebElement loginBtn;
	private WebDriver driver;
	@Autowired
	private HomePage homePage;
	
	public LoginPageImpl(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@Override
	public LoginPage inputUsername(String username) {
		driver.switchTo().frame(frame);
		this.username.sendKeys(username);
		return this;
	}
	@Override
	public LoginPage inputPassword(String password) {
		this.password.sendKeys(password);
		return this;
	}

	@Override
	public HomePage clickLoginBtn() {
		loginBtn.click();
		driver.switchTo().defaultContent();
		return homePage;
	}
}