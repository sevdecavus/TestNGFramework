package com.testNG.tests;

import com.testNG.pages.W3Schools;
import com.testNG.utilities.Driver;
import com.testNG.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {

    W3Schools schools = new W3Schools();

    @Test
    public void tumBasliklar() {
        String url = "https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);

        for (WebElement element : schools.basliklar) {
            System.out.println(element.getText());
        }
        Driver.closeDriver();
    }
    @Test
    public void tumHucreler(){
        String url1 = "https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url1);
        for (WebElement element : schools.hucreler) {
            System.out.println(element.getText());
        }
        Driver.closeDriver();

    }
    @Test
    public void tumBasliklarReusableMethods(){
        String url1 = "https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url1);
        List<WebElement> liste = ReusableMethods.getBasliklar();

        for (WebElement element : liste) {
            System.out.println(element.getText());
        }
        Driver.closeDriver();
    }
}
