package StepDefinition;

import Pages.*;
import Utilities.BaseClass;
import io.cucumber.java.en.*;

import io.qameta.allure.Step;
import org.testng.Assert;


public class MyStepdefs extends BaseClass {


    SearchResults searchResults;
    Wikipedia wikipedia;


    @Given("Buscar {string} en google")
    @Step("Buscar {string} en google")
    public void buscar_en_google(String string) {
        Home home = new Home();
        home.aceptarTodo();
        home.search(string);
    }

    @When("Hacer click en el enlace de Wikipedia")
    @Step("Hacer click en el enlace de Wikipedia")
    public void hacer_click_en_el_enlace_de_wikipedia() {

        searchResults = new SearchResults();
        searchResults.selectWikipedia();
    }


    @When("Hacer click en el menú {string}")
    @Step("Hacer click en el menú {string}")
    public void hacer_click_en_el_menu(String string) {
        wikipedia = new Wikipedia();
        wikipedia.selectOption(string);
    }


    @Then("el primer proceso automático se realizó en el año {string}")
    @Step("el primer proceso automático se realizó en el año {string}")
    public void el_primer_proceso_automático_se_realiz_en_el_año(String anio) {
        wikipedia.getParrafo();
        this.takeScreenshot();
        Assert.assertTrue(wikipedia.getParrafo().contains(anio));

    }


}
