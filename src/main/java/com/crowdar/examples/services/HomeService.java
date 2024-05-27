package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import org.testng.Assert;


public class HomeService {

    public static void isViewHome() {
        MobileActionManager.waitVisibility(HomeConstants.TIME_ENTRIES_TEXTVIEW);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.ADD_TIME_BUTTON), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

}
