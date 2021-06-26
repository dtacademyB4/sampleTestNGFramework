package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

    @FindBy(xpath =  "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement resultsText;

    public AmazonHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }





    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;
}
