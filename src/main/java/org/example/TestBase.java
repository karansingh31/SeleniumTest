package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/karan.singh/Documents/chromedriver");
        //WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));

//        searchBox.sendKeys("ChromeDriver");
//
//        searchBox.submit();

        Thread.sleep(25000);  // Let the user actually see something!

        driver.quit();
        System.out.println("Hello world!");
    }
}