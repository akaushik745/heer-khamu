package com.project.pages;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://google.com")

public class LoginPage extends PageObject {

	@FindBy(name="email")
	WebElement enterMail;
	@FindBy(name="password")
	WebElement paswrd;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;

	public void setEmail(String strEmail){
		getDriver().get("https://marktest.kulaboard.info/auth/login");
		waitFor(enterMail);
		getDriver().manage().window().maximize();
		enterMail.clear();
		enterMail.sendKeys(strEmail);
	}
	public void setPassword(String strPasss){
		waitFor(paswrd);
		paswrd.clear();
		paswrd.sendKeys(strPasss);
	}

	public void clickLoginBtn(){
		waitFor(submit);
		submit.click();
	}

	public String getLoginBtnTxt(){
		waitFor(submit);
		return submit.getText();
	}



}
