package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {

   // @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Close\"]")
    @AndroidFindBy(accessibility = "Close")

    private WebElement btnClose;

    public void clickClose(){
        getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        btnClose.click();
    }
}
