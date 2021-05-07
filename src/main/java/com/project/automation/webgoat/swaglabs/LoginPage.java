package com.project.automation.webgoat.swaglabs;

import com.project.automation.webgoat.utils.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    private static By txtUserName = By.id("user-name");
    private static By txtpassworld = By.id("password");
    private static By clickLogin = By.id("login-button");


    public static void setUserName(String username) {
        getDriver().findElement(txtUserName).sendKeys(username);
    }
    public static void setPass(String pass) {
        getDriver().findElement(txtpassworld).sendKeys(pass);
    }
    public static void clickSubmit() {
        getDriver().findElement(clickLogin).click();
    }
}
