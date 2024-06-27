package com.crowdar.examples.constants;

public class HomeConstants {

    public static final String CONTADOR_TEXTVIEW = "xpath://android.widget.TextView[@resource-id=\"appBarTitle\"]";
    public static final String ADD_TIME_BUTTON = "ACCESSIBILITY_ID:FAB - Add new time entry";
    public static final String MANUAL_ENTRIES_BUTTON = "xpath://android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public static final String MSG_NOTIFICATIONS = "xpath://android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]";
    public static final String MSG_NOTIFICATIONS2 = "xpath://android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_and_dont_ask_again_button\"]";
    public static final String VIEW_NOT_DISPLAYED_MESSAGE = "Home page is not displayed.";
    public static final String TIME_ENTRIES_PROJECT_NAME = "xpath:(//android.widget" +
            ".TextView[@resource-id=\"titleCardPart1\"])[1]";
    public static final String TIME_ENTRIES_TASK_NAME = "xpath://android.widget.TextView[@resource-id=\"titleCardPart2\"]";
    public static final String LOG_OUT_LINK = "xpath://android.widget.CheckedTextView[@resource-id=\"me.clockify.android:id/design_menu_item_text\" and @text=\"Log out\"]";
    public static final String LOG_OUT_CONFIRM_BUTTON = "id:android:id/button1";
    public static final String SETTINGS_LINK = "xpath://android.widget.CheckedTextView[@resource-id=\"me.clockify.android:id/design_menu_item_text\" and @text=\"Settings\"]";
    public static final String APP_THEME = "xpath://android.widget.TextView[@text=\"App theme\"]";
    public static final String DARK_THEME = "xpath://android.widget.TextView[@text=\"Dark\"]";
    public static final String OK_BUTTON = "xpath://android.widget.TextView[@text=\"OK\"]";
    public static final String SETTINGS_TITLE = "xpath://android.widget.TextView[@text=\"%s\"]";
}