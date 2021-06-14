package com.testNG.tests;

import com.testNG.pages.AmazonPage;
import com.testNG.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AmazonSearchTest {

    AmazonPage page = new AmazonPage();

    @Test
    public void searchTest(){
        Driver.getDriver().get("https://amazon.com");
        page.searchBox.sendKeys("iphone"+ Keys.ENTER);
    }
}
