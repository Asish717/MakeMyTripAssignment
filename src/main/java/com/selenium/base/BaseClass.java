package com.selenium.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.awt.event.InputEvent;
import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
    public void setup() throws InterruptedException, AWTException {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Thread.sleep(500);
        Robot robot=new Robot();
        robot.mouseMove(50,400);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
