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
	
	
	
	@Then("^user click on Begin order$")
	public void user_click_on_Begin_order() throws Throwable {
	    steps.user_click_on_Begin_order();
	}

	@Then("^user choose order type pickup$")
	public void user_choose_order_type_pickup() throws Throwable {
	   steps.user_choose_order_type_pickup();
	}

	
	
	@Then("^user choose order type Delivery$")
	public void user_choose_order_type_Delivery() throws Throwable {
	    steps.user_choose_order_type_Delivery();
	}

	@Then("^user click on Presentation Manager$")
	public void user_click_on_Presentation_Manager() throws Throwable {
	    steps.user_click_on_Presentation_Manager();
	}

	@Then("^click on add a new presentation link$")
	public void click_on_add_a_new_presentation_link() throws Throwable {
	   steps.click_on_add_a_new_presentation_link();
	}

	@Then("^user fill out all required details$")
	public void user_fill_out_all_required_details() throws Throwable {
		String txt = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		String name = "Pname" + txt;
		TestDataSetup.setItem(name);
		steps.user_fill_out_all_required_details(name);
	    
	}

	@Then("^User save presentation$")
	public void user_save_presentation() throws Throwable {
	  steps.user_save_presentation();
	}

	@Then("^user go on menu board manager page$")
	public void user_go_on_menu_board_manager_page() throws Throwable {
	    steps.user_go_on_menu_board_manager_page();
	}

	@Then("^user click on Add a new board button$")
	public void user_click_on_Add_a_new_board_button() throws Throwable {
	    steps.user_click_on_Add_a_new_board_button();
	}

	@Then("^user click on Start from scratch$")
	public void user_click_on_Start_from_scratch() throws Throwable {
	   steps.user_click_on_Start_from_scratch();
	}

	@Then("^fill out form with all required fields$")
	public void fill_out_form_with_all_required_fields() throws Throwable {
	    steps.fill_out_form_with_all_required_fields();
	}

	@Then("^user click on Save button$")
	public void user_click_on_Save_button() throws Throwable {
	   steps.user_click_on_Save_button();
	}
	
	@Then("^click on edit icon$")
	public void click_on_edit_icon() throws Throwable {
	    steps.click_on_edit_icon();
	}
	
	@Then("^user click on menu item$")
	public void user_click_on_menu_item() throws Throwable {
	    steps.user_click_on_menu_item();
	}
	
	@Then("^select menu item description on page$")
	public void select_menu_item_description_on_page() throws Throwable {
	    steps.select_menu_item_description_on_page();
	}

	@Then("^user is on customize page and then see user is able to set toolset$")
	public void user_is_on_customize_page_and_then_see_user_is_able_to_set_toolset() throws Throwable {
	    steps.user_is_on_customize_page_and_then_see_user_is_able_to_set_toolset();
	}
	
	@Then("^Delete menu item from Customization page$")
	public void delete_menu_item_from_Customization_page() throws Throwable {
	   steps.delete_menu_item_from_Customization_page();
	}

	

}
