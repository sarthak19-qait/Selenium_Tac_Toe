package com.qait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThirdPage{
    WebDriver driver;
    By green = By.className("greenbox");

    public ThirdPage(WebDriver driver){
        this.driver = driver;
    }

    public void btnClick(){
        driver.findElement(green).click();
    }
}