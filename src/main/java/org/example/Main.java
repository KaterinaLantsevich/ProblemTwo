package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/katsiarynalantsevich/Desktop/Installed files/chromedriver_mac_arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        File htmlFile = new File("src/main/index.html");
        String absolutePath = htmlFile.getAbsolutePath();
        driver.get("file:///" + absolutePath);

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            String href = link.getAttribute("href");
            System.out.println(href);
        }

        driver.quit();
    }
}