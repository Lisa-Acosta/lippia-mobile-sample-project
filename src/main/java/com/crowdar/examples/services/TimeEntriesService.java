package com.crowdar.examples.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.TimeEntriesConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.*;


public class TimeEntriesService {


    public static void enterTime(String time) {
        String[] times = time.split(":");
        String hour = times[0];
        String min = times[1];
        setInput(TimeEntriesConstants.HORAS_INPUT, hour);
        click(TimeEntriesConstants.MINUTOS_TAB);
        setInput(TimeEntriesConstants.MINUTOS_INPUT, min );
        click(TimeEntriesConstants.OK_BUTTON);
    }

    public static void enterWorking(String working) {
        setInput(TimeEntriesConstants.WORKING_INPUT, working);
    }

    public static void enterProject(String project) {
        click(TimeEntriesConstants.PROJECT_SECTION);
        waitPresence(TimeEntriesConstants.PROJECT_ID).click();

    }

    public static void enterBillablepro(String billablepro) {
        String check = ActionManager.getAttribute(TimeEntriesConstants.FACTURABLE_BUTTON, "checked");
        if(billablepro != check ){
            click(TimeEntriesConstants.FACTURABLE_BUTTON);
        }
        click(TimeEntriesConstants.GUARDAR_BUTTON);
    }

    public static void dataEntriesDisplayed(String project) {
        click(HomeConstants.MSG_NOTIFICATIONS2);
        waitVisibility(HomeConstants.CONTADOR_TEXTVIEW);
        Assert.assertTrue(ActionManager.getText(HomeConstants.TIME_ENTRIES_PROJECT_NAME).contains(project));
    }
}
