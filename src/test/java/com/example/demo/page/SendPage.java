package com.example.demo.page;

public interface SendPage {
	SendPage inputEmail();
	SendPage inputSubject();
	SendPage inputContent();
	HomePage send();
	
}
