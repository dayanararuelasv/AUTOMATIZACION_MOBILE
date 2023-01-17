package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginScreenApp extends PageObject {
    private WebDriver driver;

///////////////// INGRESAR USUARIO
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement userNameText;
    public void typeUserName(String user){
        userNameText.click();
        userNameText.sendKeys(user);
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertTrue(user, true);
    }

/////////// INGRESAR CONTRASEÑA
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement userPasswordText;
    public void typePassword(String password){
        userPasswordText.click();
        userPasswordText.sendKeys(password);
    }

 //// LOGUEARSE

    //@AndroidFindBy(xpath = "android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    @AndroidFindBy(accessibility = "test-LOGIN")
    private WebElement loginButton;

    public void login(){
        loginButton.click();
    }

}
