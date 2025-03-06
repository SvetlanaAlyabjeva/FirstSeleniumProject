package com.telran.qa46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementsTests {
    WebDriver driver;

    @BeforeMethod

    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod

    public void TearDown() {
        driver.quit();
    }

    @Test

    public void FindElementByTagName() {
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());

        WebElement a = driver.findElement(By.tagName("a"));
        System.out.println(a.getText());

        //find list of elements
        List<WebElement> a1 = driver.findElements((By.tagName("a")));
        System.out.println(a1.size());//quantity of elements

            }

            @Test

    public void FindElementBySimpleLocators() {
        //by id
        driver.findElement(By.id("city"));
        //by Class.name
        driver.findElement(By.className("title-container"));
        //by link Text
                WebElement letTheCarWork = driver.findElement(By.linkText("Let the car work"));
                System.out.println(letTheCarWork.getText());
        //by Partial Link Text
        driver.findElement(By.partialLinkText("car"));
            }
            @Test

    public void findElementByCSSSelector() {
      //tagName=css
      //WebElement h1 = driver.findElement(By.tagName("h1"))
                WebElement h1 = driver.findElement(By.cssSelector("h1"));
      //id=>css(#)
      driver.findElement(By.cssSelector("#city"));
      //className
      // driver.findElement(By.className("title-container"));
      driver.findElement(By.cssSelector(".title-container"));
      //[attr='value']
                driver.findElement(By.cssSelector("[href='/login?url=%2Fsearch']"));
      //contains ->*
                driver.findElement(By.cssSelector("[href*='login']"));
      //start->^
                driver.findElement(By.cssSelector("[href^='/log']"));
      //end on->$
                driver.findElement(By.cssSelector("[href$='search']"));
    }
}

