package com.project.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class CanvasMenuBoardPage extends PageObject {
	
	public void clickOnAddnewBoardButton() throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.className("btn-success"));
		getDriver().findElements(By.className("btn-success")).get(0).click();
		waitForTextToAppear("Create a New Board");
		
	}
	
	public void clickOnStartFromScratch() throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.className("text-center"));
		getDriver().findElements(By.className("text-center")).get(1).click();
		waitForTextToAppear("Board Settings");
		
	}
	
	public void fillOutForm() throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.cssSelector("textarea[name='description']"));
		getDriver().findElement(By.cssSelector("textarea[name='description']")).sendKeys("zz test test");
	}
	
	public void clickOnSave() throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.className("save-btn"));
		getDriver().findElements(By.className("save-btn")).get(0).click();
	}
	
	public String getSuccessMsg(){
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.className("alert-info"));
		return getDriver().findElement(By.className("alert-info")).getText();
	}
	
	public void clickOnEditIcon() throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.className("btn-edit"));
		getDriver().findElements(By.className("btn-edit")).get(1).click();
		waitForTextToAppear("Toolset");
		
	}
	
	public void clickOnMenuItemIcon() throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.id("null"));
		getDriver().findElement(By.id("null")).click();
//		waitForTextToAppear("Test Item");
	}
	
	public void selectMenuItemDescrioption() throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.className("upper-canvas"));
		getDriver().findElements(By.className("upper-canvas")).get(0).click();
		waitForTextToAppear("Name");
	}

	public void setToolSet() throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//input[@type='text']"));
		getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("Pizza");
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("(//input[@type='text'])[2]"));
		getDriver().findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		getDriver().findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("$12.00");
	}
	
	public void saveBtn() throws InterruptedException{
//		((JavascriptExecutor)getDriver()).executeScript("document.getElementsByClassName('save-btn')[1].click()");
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.className("save-btn"));
		getDriver().findElements(By.className("save-btn")).get(1).click();
	}
	
	public String getTextPage(){
		withTimeoutOf(30, TimeUnit.SECONDS).waitForPresenceOf(By.className("active"));
		return getDriver().findElements(By.className("active")).get(0).getText();
	}
	
	public void clickOnDeleteMenuItem() throws InterruptedException{
		withTimeoutOf(30, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("(//button[@id='null'])[6]"));
		getDriver().findElement(By.xpath("(//button[@id='null'])[6]")).click();
	}
}
