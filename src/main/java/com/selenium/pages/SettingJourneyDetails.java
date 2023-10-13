package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.InputEvent;

public class SettingJourneyDetails {
    WebDriver driver;
    @FindBy(xpath = "//*[text()='Search']")
    WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/p/span")
    WebElement pageCheck;
    public SettingJourneyDetails(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public String settingUpJourneyDetails() throws AWTException, InterruptedException {
        Robot robot=new Robot();
        robot.mouseMove(150,410);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(500);
        robot.mouseMove(150,480);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(500);
        robot.mouseMove(500,410);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(500);
        robot.mouseMove(500,530);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(500);
        robot.mouseMove(850,530);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(500);
        searchButton.click();
        Thread.sleep(12000);
        String checktext=pageCheck.getText();
        return checktext;
    }
}
