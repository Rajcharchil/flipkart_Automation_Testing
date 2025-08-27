package com.Stepdefenitions;

import java.io.IOException;

import com.Baseclass.Library;
import com.Pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFunctionality_Testcase extends Library {

    SearchPage sp;

    @Given("Launch the Flipkart Application")
    public void launch_the_flipkart_application() {
        try {
            launchApplication();
        } catch (IOException e) {
            throw new RuntimeException("Failed to launch application", e);
        }
        sp = new SearchPage(driver);
    }

    @When("Close the login popup")
    public void close_the_login_popup() {
        sp.dismissLoginPopupIfPresent();
    }

    @Then("User should be navigated to the Home page")
    public void user_should_be_navigated_to_the_home_page() {
        sp.homeScreen();
    }

    @Given("User enters the text in the Search field")
    public void user_enters_the_text_in_the_search_field() {
        sp.Search("Mobile");
    }

    @When("User clicks the search button")
    public void user_clicks_the_search_button() {
        sp.clickSearch();
    }

    @Then("It should navigate to the search results page and display the relevant details")
    public void it_should_navigate_to_the_search_results_page_and_display_the_relevant_details() {
        sp.result();
    }
}


