package com.selenium;

import com.selenium.base.BaseClass;
import com.selenium.pages.SettingJourneyDetails;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;

public class MakeMyTripTest extends BaseClass {
    SettingJourneyDetails settingJourneyDetails;
    @BeforeTest
    public void start() throws InterruptedException, AWTException {
        setup();
        settingJourneyDetails=new SettingJourneyDetails(driver);
    }
    @Test
    public void enteringJourneyDetails() throws AWTException, InterruptedException {
        String pageResultCheck=settingJourneyDetails.settingUpJourneyDetails();
        Assert.assertEquals(pageResultCheck,"Flights from Mumbai to New Delhi");
    }
    @AfterTest
    public void end(){
        driver.close();
    }
}
