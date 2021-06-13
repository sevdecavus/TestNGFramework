package com.testNG.tests;

import com.testNG.utilities.Driver;
import com.testNG.utilities.ReusableMethods;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    @Test
    public void searchTest(){
        Driver.getDriver().get("https://www.google.com");

        ReusableMethods.sleep(5000);

        String title = Driver.getDriver().getTitle();
        System.out.println(title);

        Driver.getDriver().navigate().to("https://www.amazon.com");
        String title2 = Driver.getDriver().getTitle();
        System.out.println(title2);
        Driver.getDriver().navigate().back();
        ReusableMethods.sleep(2000);
        Driver.getDriver().navigate().forward();

        Driver.getDriver().close();


    }


}
