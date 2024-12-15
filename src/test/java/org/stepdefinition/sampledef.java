package org.stepdefinition;

import org.base.BaseClass;
import org.sam.Instapojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sampledef extends BaseClass{
	Instapojo In;
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
	    lanBrowser();
	}

	@When("To launch the url")
	public void to_launch_the_url() {
	   launchUrl("https://www.instagram.com/");
	}

	@When("To pass the mailId in username field")
	public void to_pass_the_mailId_in_username_field() {
	   In = new Instapojo();
	   passText("sivam98san@gmail.com",In.getUsername());
	}

	@When("To pass the password in password field")
	public void to_pass_the_password_in_password_field() {
	  In = new Instapojo();
	  passText("sivaparvathi",In.getPassword());
	}

	@When("To Click the login button")
	public void to_Click_the_login_button() {
		In = new Instapojo();
	   clickBtn(In.getSubmit());
	}

	@When("To navigate the home page or not")
	public void to_navigate_the_home_page_or_not() {
	   System.out.println("Your login credentials...");
	}

	@Then("To close the Browser")
	public void to_close_the_Browser() {
	    closeBrowser();
	}


}
