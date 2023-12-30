package com.QA1Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page_Pom {

	
	@FindBy(id="get_sign_in")           //TO CLICK ON LOGIN/SIGNUP
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	@FindBy(xpath="//input[@class='loginCont__input']")  //TO PASS THE PHN NUMBER 
	private WebElement phNumber;
	public WebElement getPhnNumber() {
		return phNumber;
	}
	@FindBy(name="text")             //TO PASS THE VALUES IN THE USERNAME FIELD
	private WebElement userName;
	public WebElement getuserName() {
		return userName;
	}
	@FindBy(xpath="(//input[@name='text'])[2]")  //TO PASS THE EMAILID IN THE EMAIL FIELD
	private WebElement mailId;
	public WebElement getmailid() {
		return mailId;
	}
	@FindBy(xpath="//button[text()='Lets Go']")   //THIS IS THE SUBMIT BUTTON 
	private WebElement letsGo;
	public WebElement getletsGo() {
		return letsGo;
	}
}
