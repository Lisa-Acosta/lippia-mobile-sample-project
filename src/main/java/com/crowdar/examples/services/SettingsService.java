package com.crowdar.examples.services;
import com.crowdar.examples.constants.HomeConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.*;

public class SettingsService {

    public static void selectTheSettings() {
        click(HomeConstants.SETTINGS_LINK);
    }
    public static void selectTheme() {
        click(HomeConstants.APP_THEME);
        click(HomeConstants.DARK_THEME);
        click(HomeConstants.OK_BUTTON);
    }
    public static void darkThemeDisplayed() {
            waitVisibility(HomeConstants.APP_THEME);
            Assert.assertTrue(isVisible(HomeConstants.SETTINGS_TITLE,"Dark"));
        }
    }

