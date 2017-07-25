package com.project.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class RegistrationPage extends PageObject {
	
	public void clickOnRegisterNow() throws InterruptedException{
		getDriver().get("http://qa_automate.kulacart.biz/");
		getDriver().findElements(By.className("top_signin")).get(1).click();
	}
	
	public void fillAllDetails() throws InterruptedException{
		getDriver().findElement(By.name("first_name")).sendKeys("");
		getDriver().findElement(By.name("last_name")).sendKeys("");
		getDriver().findElement(By.name("email_address")).sendKeys("");
		getDriver().findElement(By.name("phone_no")).sendKeys("000000000");
		waitForTextToAppear("City & State");
		getDriver().findElement(By.name("password")).sendKeys("00");
		getDriver().findElement(By.name("confirm_password")).sendKeys("00");
	}
	
	public void clickOnSignUp() throws InterruptedException{
		getDriver().findElement(By.name("reg_submit")).click();
	}

}
