package com.StepDefination;

import com.BaseClass.BaseClass;
import com.PageLayer.PIMPage;

import io.cucumber.java.en.Then;

public class PIMPageTest extends BaseClass {
public static   PIMPage pimpage;
	@Then("user click on PIM tab and click on Add button and enter {string} , {string}, and {string} and Click on save button")
	public void user_click_on_pim_tab_and_click_on_add_button_and_enter_and_and_click_on_save_button(String fname, String mname, String lname) {
	   pimpage=new PIMPage();
	   pimpage.addNewUser(fname, mname, lname);
	    
	}
	@Then("User Add More Personal Details")
	public void user_add_more_personal_details() {
		pimpage.addMorePersonalDetails("123456789", "DDSHF56", "Mar", "2030", "25");
	   
	}
	@Then("user go on PIM and search for the newly created user")
	public void user_go_on_pim_and_search_for_the_newly_created_user() {
		pimpage.serchUser();
	   
	}
	@Then("user Delete the newly created user")
	public void user_delete_the_newly_created_user() {
		pimpage.deleteUser();
	    
	}
}
