package com.crowdar.examples.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.click;


public class LoginService {

    public static void doLogin(){
        MobileActionManager.setInput(LoginConstants.EMAIL_INPUT, PropertyManager.getProperty("email"));
        MobileActionManager.setInput(LoginConstants.PASSWORD_INPUT, PropertyManager.getProperty("password"));
        click(LoginConstants.LOGIN_BUTTON);
    }
    public static void doLogin(String email, String password){
        MobileActionManager.setInput(LoginConstants.EMAIL_INPUT, email);
        MobileActionManager.setInput(LoginConstants.PASSWORD_INPUT, password);
        click(LoginConstants.LOGIN_BUTTON);
    }

    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(LoginConstants.LOGIN_HEADLINE);
        click(LoginConstants.INICIAR_MANUAL_BUTTON);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.EMAIL_INPUT),LoginConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }
}
