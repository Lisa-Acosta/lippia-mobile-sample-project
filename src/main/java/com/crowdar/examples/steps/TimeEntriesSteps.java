package com.crowdar.examples.steps;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.TimeEntriesService;
import cucumber.api.java.en.*;
import java.text.ParseException;

public class TimeEntriesSteps extends PageSteps {
    @And("clicks on the time entries button")
    public void clicksOnTheTimeEntriesButton() {
       TimeEntriesService.clickTimeEntries();
    }
    @And("^choose the working (.*) on$")
    public void chooseTheWorkingOn(String working) {
        TimeEntriesService.enterWorking(working);
    }
    @And("^enter the project (.*)$")
    public void enterDeProject(String project) {
        TimeEntriesService.enterProject(project);
    }
    @And("^choose if it is billablepro (.*)$")
    public void chooseIfItIsBillablepro(String billablepro) {
        TimeEntriesService.enterBillablepro(billablepro);
    }
    @Then("^the data entries (.*) and (.*) is diplayed$")
    public void theDataEntriesIsDiplayed(String project, String task) {
        TimeEntriesService.dataEntriesDisplayed(project, task);
    }
    @When("^enter duration time (.*)$")
    public void enterDurationTime(String time) {
        TimeEntriesService.enterTime(time);
    }
    @And("^enter the task (.*)$")
    public void enterTheTask(String task) {
        TimeEntriesService.enterTask(task);
    }
    @And("^enter the tag (.*)$")
    public void enterTheTag(String tag) {
        TimeEntriesService.enterTag(tag);
    }
    @And("^enter date (.*)$")
    public void enterDate(String date) throws ParseException {
        TimeEntriesService.enterDate(date);
    }
    @And("^enter if it is billablepro (.*) and cancel$")
    public void enterIfItIsBillableproAndCancel(String billablepro) {
        TimeEntriesService.enterBillableproAndCancel(billablepro);
    }
    @Then("^the data entries (.*) is not diplayed$")
    public void theDataEntriesAndIsNotDiplayed(String project) {
        TimeEntriesService.dataEntriesNotDisplayed(project);
    }
}