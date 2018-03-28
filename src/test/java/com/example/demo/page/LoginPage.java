package com.example.demo.page;

public interface LoginPage {
	LoginPage inputUsername(String username);
	LoginPage inputPassword(String password);
	HomePage clickLoginBtn();
}