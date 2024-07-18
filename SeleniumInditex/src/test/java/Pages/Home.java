package Pages;


import Utilities.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Home extends BaseClass {


   @FindBy(xpath = "//textarea[@id='APjFqb']")
    public WebElement searchInput;

    @FindBy(xpath = "//button[@id='L2AGLb']/div")
    public WebElement aceptarTodo;

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void aceptarTodo(){
       WebElement aceptarCookies;
       aceptarCookies = wait.until(ExpectedConditions.elementToBeClickable(aceptarTodo));
         aceptarCookies.click();

    }

 public void search(String textToSearch) {
        WebElement search;
        search = wait.until(ExpectedConditions.elementToBeClickable(searchInput));

        search.sendKeys(textToSearch);
        search.sendKeys(Keys.ENTER);
    }
}
