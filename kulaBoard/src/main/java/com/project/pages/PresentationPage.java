package com.project.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PresentationPage extends PageObject {
	
	public void clickOnAddNewPresentation() throws InterruptedException {
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.className("btn-success"));
		getDriver().findElements(By.className("btn-success")).get(0).click();
		waitForTextToAppear("Presentation Name");
	}
	
	@FindBy(name="transition")
	WebElement transitionType;
	public void fillOutAllDetails(String args) throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.id("name"));
		getDriver().findElement(By.id("name")).sendKeys(args);
//		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.name("description"));
//		getDriver().findElement(By.name("description")).sendKeys(args);
//		Thread.sleep(499);
//		selectFromDropdown(transitionType,"Slide-in Right");
	}
	
	public void clickOnSave() throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//button[@type='submit']"));
		getDriver().findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public String getSuccessMsg(){
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.className("alert-info"));
		return getDriver().findElement(By.className("alert-info")).getText();
	}
}
