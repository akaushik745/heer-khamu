package net.serenitybdd.cucumber.features.steps.serenity;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

















import org.junit.Assert;

import net.thucydides.core.annotations.Step;










import com.project.pages.CanvasMenuBoardPage;
import com.project.pages.HomePage;
import com.project.pages.LoginPage;



import com.project.pages.PresentationPage;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps {
	LoginPage loginPage;
	HomePage homePage;
	PresentationPage presentationPage;
	CanvasMenuBoardPage canvasMenuBoard;
	
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
	public void user_click_on_Begin_order() throws Throwable {
		homePage.goOnBiginOrder();
	}

	@Step
	public void user_choose_order_type_pickup() throws Throwable {
	   homePage.goOnPickup();
	}

	
	
	@Step
	public void user_choose_order_type_Delivery() throws Throwable {
	    homePage.goOnDeliviry();
	}

	@Step
	public void user_click_on_Presentation_Manager() throws Throwable {
	    homePage.goOnPresentationManager();
	}

	@Step
	public void click_on_add_a_new_presentation_link() throws Throwable {
	   presentationPage.clickOnAddNewPresentation();
	}

	@Step
	public void user_fill_out_all_required_details(String args) throws Throwable {
	    presentationPage.fillOutAllDetails(args);
	    
	}

	@Step
	public void user_save_presentation() throws Throwable {
	  presentationPage.clickOnSave();
	  Assert.assertEquals("Presentation Updated Successfully.", presentationPage.getSuccessMsg());
	}
	
	@Step
	public void user_go_on_menu_board_manager_page() throws Throwable {
	    homePage.goOnMenuBoardPage();
	}

	@Step
	public void user_click_on_Add_a_new_board_button() throws Throwable {
	    canvasMenuBoard.clickOnAddnewBoardButton();
	}

	@Step
	public void user_click_on_Start_from_scratch() throws Throwable {
	   canvasMenuBoard.clickOnStartFromScratch();
	}

	@Step
	public void fill_out_form_with_all_required_fields() throws Throwable {
	   canvasMenuBoard.fillOutForm();   
	}

	@Step
	public void user_click_on_Save_button() throws Throwable {
	   canvasMenuBoard.clickOnSave();
	   Assert.assertEquals("Board Updated Successfully.", canvasMenuBoard.getSuccessMsg());
	}
	
	@Step
	public void click_on_edit_icon() throws Throwable {
	    canvasMenuBoard.clickOnEditIcon();
	}
	
	@Step
	public void user_click_on_menu_item() throws Throwable {
	    canvasMenuBoard.clickOnMenuItemIcon();
	}
	
	@Step
	public void select_menu_item_description_on_page() throws Throwable {
	    canvasMenuBoard.selectMenuItemDescrioption();
	}

	@Step
	public void user_is_on_customize_page_and_then_see_user_is_able_to_set_toolset() throws Throwable {
	    canvasMenuBoard.setToolSet();
	    canvasMenuBoard.saveBtn();
	    Assert.assertTrue((canvasMenuBoard.getTextPage()).contains("Availability"));
	}
	
	@Step
	public void delete_menu_item_from_Customization_page() throws Throwable {
	   canvasMenuBoard.clickOnDeleteMenuItem(); 
	   Assert.assertTrue((canvasMenuBoard.getTextPage()).contains("Availability"));
	}
	
	
	
	
}
