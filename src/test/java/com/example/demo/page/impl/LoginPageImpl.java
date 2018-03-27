package com.example.demo.page.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.example.demo.page.LoginPage;

public class LoginPageImpl implements LoginPage {
	@FindBy(id="x-URS-iframe")
	private WebElement frame;
	@FindBy(name="email")
	private WebElement username;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(linkText="登  录")
	private WebElement loginBtn;
	private WebDriver driver;
	public LoginPageImpl(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@Override
	public void selectFrame() {
		driver.switchTo().frame(frame);
	}
	
	@Override
	public void inputUsername(String username) {
		this.username.sendKeys(username);
	}
	@Override
	public void inputPassword(String password) {
		this.password.sendKeys(password);
	}
	@Override
	public void clickLoginBtn() {
		loginBtn.click();
	}
}