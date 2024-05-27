package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.click;


public class HomeService {

    public static void isViewHome() {
        click(HomeConstants.MSG_NOTIFICATIONS);
        MobileActionManager.waitVisibility(HomeConstants.CONTADOR_TEXTVIEW);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.ADD_TIME_BUTTON), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

}
