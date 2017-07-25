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

	@FindBy(id="username")
	WebElement email;
	@FindBy(id="password")
	WebElement password;
	@FindBy(name="submit")
	WebElement loginBtn;
	public void clickOnSignIn() throws InterruptedException{
		getDriver().get("http://qa_automate.kulacart.biz/");
		getDriver().findElements(By.className("top_signin")).get(0).click();
	}
	
	public void setEmail(String strEmail){
		waitFor(email);
		getDriver().manage().window().maximize();
		email.clear();
		email.sendKeys(strEmail);
	}
	public void setPassword(String strPasss){
		waitFor(password);
		password.clear();
		password.sendKeys(strPasss);
	}

	public void clickLoginBtn(){
		waitFor(loginBtn);
		loginBtn.click();
	}

	public String getLoginBtnTxt(){
		waitFor(loginBtn);
		return loginBtn.getText();
	}



}
