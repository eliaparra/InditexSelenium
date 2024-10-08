package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(tags = "", features = {"src/test/java/Features"}, glue = {"StepDefinition"},
        monochrome = true,
        plugin = {"pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"})

public class Runner extends AbstractTestNGCucumberTests {

}