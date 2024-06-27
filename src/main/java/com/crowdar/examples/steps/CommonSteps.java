package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CommonService;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


public class CommonSteps extends PageSteps {

    @Given("The user is logged in to the clockify app")
    public void theUserIsLoggedInToTheClockifyApp() {
        CommonService.loggedInApp();
    }

    @When("click on the menu")
    public void clickOnTheMenu() {
        CommonService.clickMenu();
    }

    @And("select the Log out")
    public void selectThe() {
        LoginService.selectLogout();
    }

}
