package Pages;


import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Wikipedia extends BaseClass {


    public String menu = "//span[contains(text(),'%s')]";
    
    @FindBy(xpath = "(//p)[31]")
    public WebElement historiaTemprana;
   

    public void selectOption(String option) {
        WebElement myOption = driver.findElement(By.xpath(String.format(menu,option)));
        myOption.click();

    }

    public String getParrafo() {
    	return historiaTemprana.getText();
    }

}
