package com.introlist.djy.androidintrolist;

/**
 * Created by 10856 on 2018/4/15.
 */

public class Config {
    //Login
    public String URL_LOGIN = "http://mpianatra.com/Courses/api/login.php";

    //Register
    public String URL_REGISTER = "http://mpianatra.com/Courses/api/register.php";

    public String getLoginUrl() {
        return URL_LOGIN;
    }

    public String getRegisterUrl() {
        return URL_REGISTER;
    }


}
