package org.stepdefinition;

import org.base.BaseClass;
import org.sam.Instapojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sample extends BaseClass {
Instapojo In;
@Given("User has to launch the browser and maximize the window")
public void user_has_to_launch_the_browser_and_maximize_the_window() {
   lanBrowser();
   windowMaxi();
}
@When("User has to launch the url")
public void user_has_to_launch_the_url() {
    launchUrl("https://www.instagram.com/");
}

@When("User has to pass the mail id in emaild{string} field")
public void user_has_to_pass_the_mail_id_in_emaild_field(String em) {
  In = new Instapojo();
  passText(em,In.getUsername());
}

@When("User has to pass the password in password{string} field")
public void user_has_to_pass_the_password_in_password_field(String pass) {
    In = new Instapojo();
    passText(pass,In.getPassword());
    
}

@When("User has to click the login button")
public void user_has_to_click_the_login_button() {
 In = new Instapojo();
 clickBtn(In.getSubmit());
}

@Then("User has to close the browser")
public void user_has_to_close_the_browser() {
    In = new Instapojo();
	closeBrowser();
    
}
}

