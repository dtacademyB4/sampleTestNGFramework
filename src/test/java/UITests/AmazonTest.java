package UITests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonHomePage;

public class AmazonTest extends TestBase{




    @Test
    public void searchProduct(){

        String searchterm = "drone";
        driver.get("https://www.amazon.com/");
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.searchBox.sendKeys( searchterm + Keys.ENTER);
        Assert.assertTrue(driver.getTitle().contains(searchterm));

    }


    @Test
    public void searchProduct2(){

        String searchterm = "drone";
        driver.get("https://www.amazon.com/");
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.searchBox.sendKeys( searchterm + Keys.ENTER);
        Assert.assertTrue(amazonHomePage.resultsText.getText().contains(searchterm));

    }
}
