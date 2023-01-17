package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductScreen {
    private WebDriver driver;

    public ProductScreen(WebDriver driver) {
        this.driver = driver;
    }

    // @AndroidFindBy(xpath = "android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    @AndroidFindBy(className = "android.widget.TextView")
    private WebElement titleProductScreen;

    public String getTitle(){
        //return titleProductScreen.getText();
        return this.titleProductScreen.getText();
    }

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-Item\"])[1]")
    private WebElement item;
    public int getItemSize(){
        List<WebElement> items = this.driver.findElements(By.xpath("(//android.view.ViewGroup[@content-desc=\"test-Item\"])[1]"));
        return items.size();

    }


}
