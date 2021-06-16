package com.testNG.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReusableMethods {

    public static void sleep(int miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static List<WebElement> getBasliklar(){
        return Driver.getDriver().findElements(By.xpath("(//table)[1]//th"));
    }
}
