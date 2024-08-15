package Utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseClass {


    public static WebDriver driver;

    public BaseClass() {
        PageFactory.initElements(driver, this);
    }


    public void takeScreenshot() {
        // Crear un timestamp para nombrar el archivo
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        // Toma el screenshot y lo guarda en un archivo
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            // Define la ubicación del archivo de screenshot
            File destFile = new File("src\\images\\screenshot_" + timestamp + ".png");
            // Copia el archivo de screenshot en la carpeta
            FileUtils.copyFile(screenshot, destFile);
            System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to save screenshot: " + e.getMessage());
        }
    }

}
