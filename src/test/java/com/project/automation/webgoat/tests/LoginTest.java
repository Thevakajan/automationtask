package com.project.automation.webgoat.tests;

import com.project.automation.webgoat.swaglabs.HomePage;
import com.project.automation.webgoat.swaglabs.LoginPage;
import com.project.automation.webgoat.swaglabs.Product;
import com.project.automation.webgoat.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {

    @Test(groups = { "test", "regression"}, priority = 5)
    public void testVerifyForgotPassword() {
        softAssert = new SoftAssert();
        LoginPage.setUserName("standard_user");
        LoginPage.setPass("secret_sauce");
        LoginPage.clickSubmit();
//        softAssert.assertEquals(HomePage.getResult(), "https://www.saucedemo.com/inventory.html",
//                "not show to next page");
        HomePage.clickProduct();
//        softAssert.assertEquals(HomePage.getResult(), "https://www.saucedemo.com/inventory.html",
//               "not show to next page");
//        softAssert.assertEquals(HomePage.geturl(), "https://www.saucedemo.com/cart.html",
//            "not show your car page");
        Product.clickcard();
        Product.clickemove();
        HomePage.clickshoping();
        Product.clickProduct2();
        HomePage.clickMenuMain();
        HomePage.clicklogout();
        softAssert.assertAll();
    }
}
