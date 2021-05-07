package com.project.automation.webgoat.swaglabs;

import com.project.automation.webgoat.utils.PageBase;
import org.openqa.selenium.By;

import static org.testng.AssertJUnit.assertEquals;

public class HomePage extends PageBase {
    private static By homepageurl = By.linkText("https://www.saucedemo.com/inventory.html");
    private static By Selectproduct = By.id("add-to-cart-sauce-labs-backpack");
    private static By clickcat = By.id("shopping_cart_container");
    private static By cantunitiytest = By.id("continue-shopping");
    private static By cardUrl = By.linkText("https://www.saucedemo.com/cart.html");

    private static By logoutmain = By.linkText("react-burger-menu-btn");
    private static By logout = By.linkText("logout_sidebar_link");
    public static String getResult() {
        waiTillVisible(homepageurl, 10);
        return getDriver().findElement(homepageurl).getText();
    }
    public static String geturl() {
        return getDriver().findElement(cardUrl).getText();
    }
    public static void clickProduct() {
        getDriver().findElement(Selectproduct).click();
    }
    public static void clickshoping() {
        getDriver().findElement(cantunitiytest).click();
    }
    public static void clickcard() {
        getDriver().findElement(clickcat).click();
    }
    public static void clickMenuMain() {
        getDriver().findElement(logoutmain).click();
    }
    public static void clicklogout() {
        getDriver().findElement(logout).click();
    }
    public static void veryHeader() {
        String getheadertext=driver.findElement(cardUrl).getText();
        assertEquals("https://www.saucedemo.com/cart.html", getheadertext);
    }
}
