package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigntmentusingSelenium {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://3wassignment.netlify.app/");

        driver.manage().window().maximize();

        WebElement name = driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/input[1]"));
        WebElement handle = driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/input[2]"));

        WebElement file = driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/input[3]"));



       name.sendKeys("Arshad");
       handle.sendKeys("arsad@912");
       file.sendKeys("C:\\Users\\DELL\\Documents\\IMG_20190705_095033_9300.jpg");


    }
}
