package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSteps extends PageSteps {

    @Given("The app is loaded correctly")
    public void theAppIsLoadedCorrectly() {
        LoginService.isViewLoaded();
    }

    @Then("Login page is displayed")
    public void isLoginPageVisible() {
        LoginService.isViewLoaded();
    }

    @When("The user logs in the application with: (.*), (.*)")
    public void doLoginProcess(String email, String password) {
        LoginService.doLogin(email, password);
    }

    @When("The user logs in the application with email and password")
    public void theUserLogsInTheApplicationWithUserAndPassword() {
        LoginService.doLogin();
    }
}

