package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class HomeService {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(HomeConstants.TIME_ENTRIES_TEXTVIEW);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.ADD_TIME_BUTTON), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }
    public static void isNotViewLoaded() {
        Assert.assertFalse(MobileActionManager.isVisible(HomeConstants.CHANGE_LANGUAGE_BUTTON_LOCATOR),
                HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void changeLanguage() {
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.CHANGE_LANGUAGE_BUTTON_SPANISH));
    }

    public static void logUt() {
        MobileActionManager.click(HomeConstants.SIGN_OUT_BUTTON_LOCATOR);
    }

    public static void userChangeLanguage() {
        MobileActionManager.click(HomeConstants.CHANGE_LANGUAGE_BUTTON_LOCATOR);
    }
}
