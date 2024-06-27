package com.crowdar.examples.services;
import com.crowdar.examples.constants.LoginConstants;
import static com.crowdar.core.actions.ActionManager.*;

public class CommonService {
    public static void loggedInApp() {
        LoginService.isViewLoaded();
        LoginService.doLogin();
        HomeService.isViewHome();
    }
    public static void clickMenu() {
        click(LoginConstants.MENU_BUTTON);
    }
}
