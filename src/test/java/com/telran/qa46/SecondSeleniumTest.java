package com.telran.qa46;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondSeleniumTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.vesty.co.il/main");
        driver.manage().window().maximize();
            }
            @Test

    public void TestOpenVesti() {
                System.out.println("vesti is opened");
    }

    @AfterMethod

    public void Close() {
        driver.close();
    }
}
