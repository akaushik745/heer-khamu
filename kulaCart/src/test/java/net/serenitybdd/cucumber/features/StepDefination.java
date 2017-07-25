package net.serenitybdd.cucumber.features;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.project.common.TestDataSetup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.cucumber.features.steps.serenity.Steps;
public class StepDefination {
	

	
	@net.thucydides.core.annotations.Steps
	Steps steps;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		steps.user_is_on_login_page();
	}
	
	@Given("^user enter username and \"([^\"]*)\" and password as \"([^\"]*)\" and click Login button$")
	public void user_enter_username_and_and_password_as_and_click_Login_button(String arg1, String arg2)
			throws Throwable {
		steps.user_enter_username_and_and_password_as_and_click_Login_button(arg1, arg2);
	}
	
	@Then("^home page is displayed$")
	public void home_page_is_displayed() throws Throwable {	
	}
	
	@Given("^user click on register now button$")
	public void user_click_on_register_now_button() throws Throwable {
	    steps.user_click_on_register_now_button();
	}

	@Then("^user fill out registration form with all deatails$")
	public void user_fill_out_registration_form_with_all_deatails() throws Throwable {
	   steps.user_fill_out_registration_form_with_all_deatails();
	}

	@Then("^user click on signup button$")
	public void user_click_on_signup_button() throws Throwable {
	   steps.user_click_on_signup_button();
	}
	
	@Then("^user click on Begin order$")
	public void user_click_on_Begin_order() throws Throwable {
	    steps.user_click_on_Begin_order();
	}

	@Then("^user choose order type pickup$")
	public void user_choose_order_type_pickup() throws Throwable {
	   steps.user_choose_order_type_pickup();
	}

	@Then("^user select location$")
	public void user_select_location() throws Throwable {
	   steps.user_select_location();
	}

	@Then("^Verify that user is able to pickup order from pickup location$")
	public void verify_that_user_is_able_to_pickup_order_from_pickup_location() throws Throwable {
	   steps.verify_that_user_is_able_to_pickup_order_from_pickup_location();
	}
	
	@Then("^user choose order type Delivery$")
	public void user_choose_order_type_Delivery() throws Throwable {
	    steps.user_choose_order_type_Delivery();
	}

	@Then("^fill out details with all required fields$")
	public void fill_out_details_with_all_required_fields() throws Throwable {
		String txt = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		TestDataSetup.setItem(txt);
	    steps.fill_out_details_with_all_required_fields(TestDataSetup.getItem());
	}

	@Then("^Verify that user is able to choose delivery type and also check user able to continiue to pick time$")
	public void verify_that_user_is_able_to_choose_delivery_type_and_also_check_user_able_to_continiue_to_pick_time() throws Throwable {
	    steps.verify_that_user_is_able_to_choose_delivery_type_and_also_check_user_able_to_continiue_to_pick_time();
	}
	
	@Then("^Verify that user is able to change location from change location link and check redirect on location page$")
	public void verify_that_user_is_able_to_change_location_from_change_location_link_and_check_redirect_on_location_page() throws Throwable {
	   steps.verify_that_user_is_able_to_change_location_from_change_location_link_and_check_redirect_on_location_page();
	}
	
	@Then("^Verify that user is able to see menu page$")
	public void verify_that_user_is_able_to_see_menu_page() throws Throwable {
	    steps.verify_that_user_is_able_to_see_menu_page();
	}
	
	@Then("^user select specific time$")
	public void user_select_specific_time() throws Throwable {
	    steps.user_select_specific_time();
	}

	@Then("^Verify that user is able to choose time and start order$")
	public void verify_that_user_is_able_to_choose_time_and_start_order() throws Throwable {
	    steps.verify_that_user_is_able_to_choose_time_and_start_order();
	}
	
	@Then("^verify that user is able to add menu item in cart$")
	public void verify_that_user_is_able_to_add_menu_item_in_cart() throws Throwable {
	    steps.verify_that_user_is_able_to_add_menu_item_in_cart();
	}


}
