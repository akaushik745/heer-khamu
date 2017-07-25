package com.project.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class BeginOrderPage extends PageObject {
	
	public void selectLocation() throws InterruptedException {
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.id("location_2"));
		getDriver().findElement(By.id("location_2")).click();
	}
	
	public void clickOnContinuToPickTime() throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.id("continueBtn"));
		getDriver().findElement(By.id("continueBtn")).click();
		
	}
	
	public void clickOnStartYourOrders() throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.id("asapButton"));
		getDriver().findElement(By.id("asapButton")).click();
	}

	public String getTxt(){
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//div[@id='checkoutprocess']/div/div"));
		return getDriver().findElement(By.xpath("//div[@id='checkoutprocess']/div/div")).getText();
	}
	
	public void fillAllDetails(String val) throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.id("deliveryAddress"));
		getDriver().findElement(By.id("deliveryAddress")).sendKeys(val);
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.id("postal_code"));
		getDriver().findElement(By.id("postal_code")).sendKeys("11111");
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.id("apt"));
		getDriver().findElement(By.id("apt")).sendKeys("E-103");
	}
	
//	public void closedAlert() throws InterruptedException{
//		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.className("md-close"));
//		getDriver().findElement(By.cssSelector("#modal-1 > div.md-content > div > button.md-close")).click();
//	}
	
	public String getDeliveryTxt(){
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.className("md-close"));
		return getDriver().findElements(By.className("md-close")).get(1).getText();
		
	}
	
	public void clickOnChangeLocationLink() throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.className("change_location"));
		getDriver().findElements(By.className("change_location")).get(0).click();
	}
	
	public String getLocationPageTxt(){
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.className("top_heading_strip"));
		return getDriver().findElements(By.className("top_heading_strip")).get(0).getText();
	}
	
	public void clickOnSpecificTime() throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.className("btn"));
		getDriver().findElements(By.className("btn")).get(1).click();
		waitForTextToAppear("Choose a Date");
		Thread.sleep(4999);
	}
	
	public void clickOnSpecificStartAndOver() throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.id("specificButton"));
		getDriver().findElement(By.id("specificButton")).click();
		waitForTextToAppear("Online Menu");
	}
	
	public String getMenuPageTxt(){
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.className("content-header"));
		return getDriver().findElements(By.className("content-header")).get(0).getText();
	}
	
	@FindBy(id="time")
	WebElement orderTime;
	public void selectTime() throws InterruptedException{
		waitForTextToAppear("Choose a Time");
		Thread.sleep(2999);
	    selectFromDropdown(orderTime, "09:15 PM - 09:30 PM");
	    Thread.sleep(4999);
	}
	 
	public void clickOnMenuitem() throws InterruptedException{
		waitForTextToAppear("Online Menu");
		getDriver().get("http://qa_automate.kulacart.biz/menu/category/57");
		withTimeoutOf(30, TimeUnit.SECONDS).waitForPresenceOf(By.className("item_name"));
		getDriver().findElements(By.className("item_name")).get(0).click();
		Thread.sleep(4999);
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.name("topping[126]"));
		getDriver().findElement(By.name("topping[126]")).click();
	}
	
	public void addQuantity() throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.id("qty"));
		getDriver().findElement(By.id("qty")).clear();
		getDriver().findElement(By.id("qty")).sendKeys("2");
	    Thread.sleep(4999);
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.id("additional_notes"));
		getDriver().findElement(By.id("additional_notes")).sendKeys("test test");
	}
	
	public void clickOnAddCart() throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.name("submit"));
		getDriver().findElement(By.name("submit")).click();
		Thread.sleep(4999);
	}
	
	public String getSuccessMsg(){
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.cssSelector(".alert.span12.ng-binding.alert-success"));
		return getDriver().findElement(By.cssSelector(".alert.span12.ng-binding.alert-success")).getText();
	}
	
	public void selectActiveDate() throws InterruptedException{
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.cssSelector(".day.active"));
		getDriver().findElement(By.cssSelector(".day.active")).click();
	}
	
	public String getPrice(){
		withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.cssSelector(".productname.ng-binding"));
//		return getDriver().findElements(By.className("item_price_container")).get(0).getText();
		return getDriver().findElement(By.cssSelector(".productname.ng-binding")).getText();
	}
	
}
