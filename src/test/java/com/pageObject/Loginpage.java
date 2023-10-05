package com.pageObject; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver ldriver;

	public Loginpage(WebDriver rdriver) {
	ldriver=rdriver;
PageFactory.initElements(rdriver, this);		
		
	}
	
@FindBy(id = "email")
WebElement uemail;

@FindBy(id="password")
WebElement passwordtxt;

@FindBy(xpath  = "//button[@type=\"submit\"]")
WebElement loginbnt;

public void setUsername(String uname) {
	uemail.sendKeys(uname);
	
}
public void setpassword(String pwd) {
	passwordtxt.sendKeys(pwd);
}

public void clicksubmit() {
	loginbnt.click();
	
}

}
