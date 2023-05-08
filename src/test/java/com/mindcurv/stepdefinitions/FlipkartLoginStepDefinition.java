package com.mindcurv.stepdefinitions;

//import cucumber.api.java.en.*;

import com.mindcurv.pages.LoginPage;
import io.cucumber.java.en.*;

public class FlipkartLoginStepDefinition {
    @Given("User is navigated to flipkart website")
    public void user_is_navigated_to_flipkart_website() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is navigated to flipkart website");
    }


    @When("User enters wrong mobile number in Mobile number text box")
    public void user_enters_wrong_mobile_number_in_mobile_number_text_box() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User enters wrong mobile number in Mobile number text box");
    }

    @When("User Clicks on Request OTP Button")
    public void user_clicks_on_request_otp_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User Clicks on Request OTP Button");
    }

    @Then("User should verify Error Label {string}")
    public void user_should_verify_error_label(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User should verify Error Label" + string);
    }

    @Given("User Get the Title of Flipkart Home Page")
    public void user_get_the_title_of_flipkart_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User Get the Title of Flipkart Home Page");
    }

    @Then("Verify the title of Home Page is {string}")
    public void verify_the_title_of_home_page_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Verify the title of Home Page is" + string);
    }

    @When("User enters wrong mobile number {int} in Mobile number text box")
    public void userEntersWrongMobileNumberMobileNumberInMobileNumberTextBox(int mobileNumber) {
        LoginPage loginPage = new LoginPage();
        loginPage.setMobileNumber(String.valueOf(mobileNumber));
        System.out.println("User entered Mobile Number :: " + mobileNumber);
    }
}
