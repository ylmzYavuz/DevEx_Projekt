package com.devex.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "loginpage-input-email")
    public WebElement emailEingabeFeld;
    @FindBy(id = "loginpage-form-pw-input")
    public WebElement passwortEingabeFeld;
    @FindBy(id = "loginpage-form-btn")
    public WebElement anmeldeSchaltFlache;

    @FindBy(id = "rcc-confirm-button")
    public WebElement understandBtn;

    public void login(String benutzerEmail, String passwort) {
        understandBtn.click();
        emailEingabeFeld.sendKeys(benutzerEmail);
        passwortEingabeFeld.sendKeys(passwort);
        anmeldeSchaltFlache.click();

    }
}
