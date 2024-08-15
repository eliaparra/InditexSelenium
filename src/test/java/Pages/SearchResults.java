package Pages;


import Utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SearchResults extends BaseClass {


    @FindBy(xpath = "//h3[contains(text(),'Wikipedia')]")
    public WebElement firstResult;

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    public void selectWikipedia() {
      firstResult.click();

    }

}
