package com.project.pages;

import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject{

	public void quitBrowser(){
		getDriver().close();
	}
	
	public void goOnBiginOrder() throws InterruptedException{
		getDriver().get("http://qa_automate.kulacart.biz/chooselocation");
		waitForTextToAppear("Choose Your Order Type");
	}
	
	public void goOnPickup() throws InterruptedException{
		getDriver().get("http://qa_automate.kulacart.biz/location/pickup");
		waitForTextToAppear("Select a Pickup Location");
	}
	
	public void goOnDeliviry() throws InterruptedException{
		getDriver().get("http://qa_automate.kulacart.biz/location/delivery");
		waitForTextToAppear("Street Address");
	}
	
	public void goOnPresentationManager() throws InterruptedException{
		getDriver().get("https://marktest.kulaboard.info/presentationmanager");
		waitForTextToAppear("Presentation Manager");
	}
	
	public void goOnMenuBoardPage() throws InterruptedException{
		getDriver().get("https://marktest.kulaboard.info/boardmanager");
		waitForTextToAppear("Board Manager");
	}

}
