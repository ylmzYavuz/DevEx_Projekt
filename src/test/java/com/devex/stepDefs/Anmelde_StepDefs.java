package com.devex.stepDefs;

import com.devex.pages.DashboardPage;
import com.devex.pages.LoginPage;
import com.devex.utilities.ConfigurationReader;
import com.devex.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class Anmelde_StepDefs {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("Der Benutzer befindet sich auf der Login-Seite.")
    public void der_benutzer_befindet_sich_auf_der_login_seite() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("Der Benutzer gibt {string} und {string} ein.")
    public void der_benutzer_gibt_und_ein(String benutzerEmail, String passwort) {
        loginPage.login(benutzerEmail, passwort);
    }

    @Then("Der Benutzer sollte sich auf der Website anmelden konnen.")
    public void der_benutzer_sollte_sich_auf_der_website_anmelden_konnen() {
    assertTrue(dashboardPage.wilkomenMsg.isDisplayed());
    }
}
