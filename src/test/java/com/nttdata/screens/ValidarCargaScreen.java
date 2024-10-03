package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class ValidarCargaScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement lastElement;

    // Método para verificar si el producto está visible
    public boolean isProductsDisplayed() {
        waitFor(lastElement).isVisible();
        return lastElement.isDisplayed();
    }
}
