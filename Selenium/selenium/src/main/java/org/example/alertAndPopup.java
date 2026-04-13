package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class alertAndPopup {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/alerts");
        driver.manage().window().maximize();

        driver.findElement(By.id("alertButton")).click();

        Alert simpleAlert = driver.switchTo().alert();

        simpleAlert.accept();
    }
}
