package com.testNG.tests;

import com.testNG.pages.W3Schools;
import com.testNG.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TableTest {

    W3Schools schools = new W3Schools();

    @Test
    public void tumBasliklar(){
        String url = "https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);

        for(WebElement element: schools.basliklar){
            System.out.println(element.getText());
        }
        Driver.closeDriver();
    }
}
