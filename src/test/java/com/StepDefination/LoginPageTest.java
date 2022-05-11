package com.StepDefination;

import java.util.List;

import org.junit.Assert;

import com.BaseClass.BaseClass;
import com.PageLayer.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest extends BaseClass {
	public static LoginPage loginpage;
	@Given("user is on loginPage")
	public void user_is_on_login_page() {
		BaseClass.initialization();
	    
	}
	@Then("user Enter Username and Password")
	public void user_enter_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> ls = dataTable.asLists();
		LoginPage loginpage=new LoginPage();
		loginpage.login(ls.get(0).get(0),ls.get(0).get(1));
		
	}
	@Then("User is On Home Page")
	public void user_is_on_home_page() {
		Assert.assertEquals(driver.getCurrentUrl().contains("dashboard"), true);
		
	  
	}
	@When("user Validate LoginPage")
	public void user_validate_login_page() {
		System.out.println("User Log In successfully");
	  
	}
}
