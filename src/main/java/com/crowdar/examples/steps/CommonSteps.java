package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CommonService;
import cucumber.api.java.en.Given;


public class CommonSteps extends PageSteps {

    @Given("The user is logged in to the clockify app")
    public void theUserIsLoggedInToTheClockifyApp() {
        CommonService.loggedInApp();
    }
}
