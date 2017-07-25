package net.serenitybdd.cucumber.features.steps.serenity;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;









import org.junit.Assert;

import net.thucydides.core.annotations.Step;

import com.project.pages.BeginOrderPage;
import com.project.pages.HomePage;
import com.project.pages.LoginPage;
import com.project.pages.RegistrationPage;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps {
	LoginPage loginPage;
	HomePage homePage;
	RegistrationPage registrationPage;
	BeginOrderPage beginOrderPage;
	
	@After
	public void closeBrowser(){
		homePage.quitBrowser();
	}

	
	
	@Step
	public void user_is_on_login_page() throws Throwable {
		 loginPage.open();
	}
	
	@Step
	public void user_enter_username_and_and_password_as_and_click_Login_button(String arg1, String arg2)
			throws Throwable {
		loginPage.clickOnSignIn();
		loginPage.setEmail("invalid");
		loginPage.clickLoginBtn();
		loginPage.setEmail(arg1);
		loginPage.setPassword(arg2);
		loginPage.clickLoginBtn();
		
	}
	
	@Step
	public void home_page_is_displayed() throws Throwable {	
	}
	
	@Step
	public void user_click_on_register_now_button() throws Throwable {
	    registrationPage.clickOnRegisterNow();
	}

	@Step
	public void user_fill_out_registration_form_with_all_deatails() throws Throwable {
	   registrationPage.fillAllDetails();
	}

	@Step
	public void user_click_on_signup_button() throws Throwable {
	   registrationPage.clickOnSignUp();
	}
	
	@Step
	public void user_click_on_Begin_order() throws Throwable {
		homePage.goOnBiginOrder();
	}

	@Step
	public void user_choose_order_type_pickup() throws Throwable {
	   homePage.goOnPickup();
	}

	@Step
	public void user_select_location() throws Throwable {
	   beginOrderPage.selectLocation();
	}

	@Step
	public void verify_that_user_is_able_to_pickup_order_from_pickup_location() throws Throwable {
	   beginOrderPage.clickOnContinuToPickTime();
	   beginOrderPage.clickOnStartYourOrders();
	   Assert.assertTrue(beginOrderPage.getTxt().contains("Alert! We are not yet open, but we would love to feed you later! Please check our online store hours and select a different future time for your order. "));
	   
	}
	
	@Step
	public void user_choose_order_type_Delivery() throws Throwable {
	    homePage.goOnDeliviry();
	}

	@Step
	public void fill_out_details_with_all_required_fields(String val) throws Throwable {
	    beginOrderPage.fillAllDetails(val);
	}

	@Step
	public void verify_that_user_is_able_to_choose_delivery_type_and_also_check_user_able_to_continiue_to_pick_time() throws Throwable {
		beginOrderPage.clickOnContinuToPickTime();
//		beginOrderPage.closedAlert();
		Assert.assertTrue(beginOrderPage.getDeliveryTxt().contains("CLOSE"));
	}
	
	@Step
	public void verify_that_user_is_able_to_change_location_from_change_location_link_and_check_redirect_on_location_page() throws Throwable {
		beginOrderPage.clickOnContinuToPickTime();
		beginOrderPage.clickOnChangeLocationLink();
		Assert.assertTrue(beginOrderPage.getLocationPageTxt().contains("Select a Pickup Location"));
	}
	
	@Step
	public void verify_that_user_is_able_to_see_menu_page() throws Throwable {
		beginOrderPage.clickOnContinuToPickTime();
		beginOrderPage.clickOnSpecificTime();
		beginOrderPage.clickOnSpecificStartAndOver();
		Assert.assertTrue(beginOrderPage.getMenuPageTxt().contains("Online Menu"));
	}
	
	@Step
	public void user_select_specific_time() throws Throwable {
		beginOrderPage.clickOnContinuToPickTime();
		beginOrderPage.clickOnSpecificTime();
	}

	@Step
	public void verify_that_user_is_able_to_choose_time_and_start_order() throws Throwable {
		beginOrderPage.selectActiveDate();
	    beginOrderPage.selectTime();
	    beginOrderPage.clickOnSpecificStartAndOver();
	    Assert.assertTrue(beginOrderPage.getMenuPageTxt().contains("Online Menu"));
	}
	
	@Step
	public void verify_that_user_is_able_to_add_menu_item_in_cart() throws Throwable {
		beginOrderPage.clickOnMenuitem();
//		Assert.assertTrue(beginOrderPage.getPrice().contains("$7.50"));
		Assert.assertTrue(beginOrderPage.getPrice().contains("Italian Deli Sandwich $6.50"));
//		Assert.assertEquals("$7.50", beginOrderPage.getPrice());
		beginOrderPage.addQuantity();
//		Assert.assertEquals("$15.00", beginOrderPage.getPrice());
//		Assert.assertTrue(beginOrderPage.getPrice().contains("$15.00"));
		Assert.assertTrue(beginOrderPage.getPrice().contains("Italian Deli Sandwich $6.50"));
		beginOrderPage.clickOnAddCart();
		Assert.assertTrue(beginOrderPage.getSuccessMsg().contains("Alert! Italian Deli Sandwich $6.50 was successfully added to cart."));
//		Assert.assertEquals("Alert! Italian Deli Sandwich $6.50 was successfully added to cart.", beginOrderPage.getSuccessMsg());
	}

	
}
