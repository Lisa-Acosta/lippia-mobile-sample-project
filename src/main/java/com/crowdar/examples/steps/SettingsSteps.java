package com.crowdar.examples.steps;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.SettingsService;
import cucumber.api.java.en.Then;
import io.cucumber.java.en.And;

public class SettingsSteps extends PageSteps {
    @And("select the settings")
    public void selectTheSettings() {
        SettingsService.selectTheSettings();
    }

    @And("select the app theme")
    public void selectTheAppTheme() {
        SettingsService.selectTheme();
    }

    @Then("the dark theme is diplayed")
    public void theDarkThemeIsDiplayed() {
        SettingsService.darkThemeDisplayed();
    }
}

