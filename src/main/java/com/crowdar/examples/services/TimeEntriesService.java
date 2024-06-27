package com.crowdar.examples.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.TimeEntriesConstants;
import org.testng.Assert;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
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
        click("xpath://android.widget.TextView[@text='"+project+"']");
    }

    public static void enterBillablepro(String billablepro) {
        String check = ActionManager.getAttribute(TimeEntriesConstants.FACTURABLE_BUTTON, "checked");
        if(billablepro != check ){
            click(TimeEntriesConstants.FACTURABLE_BUTTON);
        }
        click(TimeEntriesConstants.GUARDAR_BUTTON);
    }
    public static void enterBillableproAndCancel(String billablepro) {
        String check = ActionManager.getAttribute(TimeEntriesConstants.FACTURABLE_BUTTON, "checked");
        if(billablepro != check ){
            click(TimeEntriesConstants.FACTURABLE_BUTTON);
        }
        click(TimeEntriesConstants.BACK_LINK);
        click(TimeEntriesConstants.DISCARD_LINK);
    }
    public static void dataEntriesDisplayed(String project, String task) {
        click(HomeConstants.MSG_NOTIFICATIONS2);
        waitVisibility(HomeConstants.CONTADOR_TEXTVIEW);
        Assert.assertTrue(ActionManager.getText(HomeConstants.TIME_ENTRIES_PROJECT_NAME).contains(project));
        Assert.assertTrue(ActionManager.getText(HomeConstants.TIME_ENTRIES_TASK_NAME).contains(task));
    }
    public static void enterTask(String task) {
        click(TimeEntriesConstants.TASK_BUTTON);
        click(TimeEntriesConstants.NEW_TASK_BUTTON);
        setInput(TimeEntriesConstants.ADD_TASK_INPUT, task);
        click(TimeEntriesConstants.ADD_TASK_BUTTON);
    }
    public static void enterTag(String tag) {
        click(TimeEntriesConstants.TAGS_BUTTON);
        click(TimeEntriesConstants.TAGS_CHECKBOX);
        click(TimeEntriesConstants.BACK_BUTTON);
    }
    public static void clickTimeEntries() {
        click(HomeConstants.ADD_TIME_BUTTON);
        click(HomeConstants.MANUAL_ENTRIES_BUTTON);
    }
    private static String getCurrentDate() {
        Date actualDate = new Date();
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        String dayOfWeek = dayFormat.format(actualDate);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormat.format(actualDate);
        return dayOfWeek + "-" + formattedDate;
    }
    public static String getDayOfWeek(String dateStr) throws ParseException {
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = inputDateFormat.parse(dateStr);
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        return dayFormat.format(date);
    }
    public static void enterDate(String date) throws ParseException {
        String dayName = getDayOfWeek(date);
        String[] dates = date.split("-");
        String[] currentDate = getCurrentDate().split("-");
        click(TimeEntriesConstants.START_DATE_LINK);

        String desirableDate = dayName + ", " + getMonth(Integer.parseInt(dates[1].replace("0",""))) + " " + Integer.parseInt(dates[0]);

        int monthsDif = Integer.parseInt(currentDate[2]) - Integer.parseInt(dates[1]);
        for (int i = 1; i <= monthsDif; i++) {
            click(TimeEntriesConstants.MONTHS_BEFORE_LINK);
        }
        if(dates[0].equals(getElement("xpath://android.widget.TextView[@content-desc='"+desirableDate+"']").getText())){
            click("xpath://android.widget.TextView[@content-desc='"+desirableDate+"']");
        }
        click(TimeEntriesConstants.CONFIRM_BUTTON);
    }
    public static String getMonth(int numberMonth) {
        String monthName;
        switch (numberMonth) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month number";
                break;
        }
        return monthName;
    }
    public static void dataEntriesNotDisplayed(String project) {
        click(HomeConstants.MSG_NOTIFICATIONS2);
        waitVisibility(HomeConstants.CONTADOR_TEXTVIEW);
        Assert.assertFalse(ActionManager.getText(HomeConstants.TIME_ENTRIES_PROJECT_NAME).contains(project));
    }
}
