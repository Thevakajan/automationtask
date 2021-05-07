package com.project.automation.webgoat.testData;

import org.testng.annotations.DataProvider;

public class UserDetailsDataProvider {
    @DataProvider
    public static Object[][] MultipleUserDetails() {
        return new Object[][]{
                {"thev", "123456","123456"},
        };
    }
    @DataProvider
    public static Object[][] AddvalidUserDetails() {
        return new Object[][]{
                {"raqweryuthajan", "123456","123456"}

        };
    }
    @DataProvider
    public static Object[][] MultipleLogin() {
        return new Object[][]{
                {"thevakajan", "123451"},
                {"Siva", "123456"}
        };
    }
}
