package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class learingActionClass {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


                try {

                    driver.get("https://demoqa.com/buttons");
                    driver.manage().window().maximize();

                    // Wait setup
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

                    // Locate element with wait
                    WebElement rightBtn = wait.until(
                            ExpectedConditions.elementToBeClickable(By.id("rightClickBtn"))
                    );

                    WebElement doubleClick = wait.until(ExpectedConditions.elementToBeClickable(By.id("doubleClickBtn")));



                    // Scroll to element (important)
                    ((JavascriptExecutor) driver).executeScript(
                            "arguments[0].scrollIntoView({block:'center'});", rightBtn, doubleClick
                    );



                    // Small pause (optional but helps stability)
                    Thread.sleep(500);


                    Actions actions = new Actions(driver);

                    // Perform right click
                    actions.moveToElement(rightBtn).contextClick().perform();
                    actions.moveToElement(doubleClick).doubleClick().perform();


                    System.out.println("Right click button success");
                    System.out.println("Double click button success");


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }


