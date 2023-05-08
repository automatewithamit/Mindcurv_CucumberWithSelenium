package com.mindcurv.hooks;


import com.mindcurv.framework.DriverManager;
import com.mindcurv.framework.OptionsManager;
import io.cucumber.java.*;

import java.sql.Driver;

public class Hooks {
    OptionsManager optionsManager = new OptionsManager();
    DriverManager driverManager = new DriverManager();

    @Before
    public void beforeScenario() {
        System.out.println("Before Scenario");
        driverManager.openBrowser();
        navigateToURL("https://www.flipkart.com/");
    }

    @After
    public void afterScenario() {

        System.out.println("This will run after the Scenario");
        DriverManager.closeBrowser();
        System.out.println("Closed the Browser");
    }

    public void navigateToURL(String url) {
        DriverManager.getDriver().navigate().to(url);
        System.out.println("Navigated to URL " + url);
    }
}
