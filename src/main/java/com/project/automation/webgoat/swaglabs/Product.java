package com.project.automation.webgoat.swaglabs;

import com.project.automation.webgoat.utils.PageBase;
import org.openqa.selenium.By;

public class Product extends PageBase {
    private static By product = By.id("item_4_title_link");
    private static By getPrice = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    private static By remove = By.id("remove-sauce-labs-backpack");
    private static By clickcart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    private static By product2 = By.id("add-to-cart-sauce-labs-bike-light");

    public static String getResult() {

        return getDriver().findElement(getPrice).getText();
    }

    public static void clickemove() {
        getDriver().findElement(remove).click();
    }
    public static void clickcard() {
        getDriver().findElement(clickcart).click();
    }
    public static void clickProduct2() {
        getDriver().findElement(product2).click();
    }
}
