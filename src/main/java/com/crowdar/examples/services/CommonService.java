package com.crowdar.examples.services;

public class CommonService {

        public static void loggedInApp () {
            LoginService.isViewLoaded();
            LoginService.doLogin();
            HomeService.isViewHome();
        }
}
