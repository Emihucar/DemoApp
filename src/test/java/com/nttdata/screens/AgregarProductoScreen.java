package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AgregarProductoScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement aumentarCantidad;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartBt")
    private WebElement agregarCarrito;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"View cart\"]")
    private WebElement carritoCompras;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\"]")
    private WebElement tituloCompraCarrito;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement backpack;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Bike Light\"]")
    private WebElement bikeLight;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement boltShirt;

    private WebDriverWait wait;

    public AgregarProductoScreen() {
        // Espera implícita de 10 segundos
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    }

    // Método para seleccionar el producto
    public void seleccionarProducto(String PRODUCTO) {
        WebElement producto = null;

        switch (PRODUCTO) {
            case "Sauce Labs Backpack":
                producto = backpack;
                break;
            case "Sauce Labs Bike Light":
                producto = bikeLight;
                break;
            case "Sauce Labs Bolt - T-Shirt":
                producto = boltShirt;
                break;
            default:
                System.out.println("El producto '" + PRODUCTO + "' no está disponible.");
                return;
        }

        try {
            // Validar que el producto sea visible y clickeable
            wait.until(ExpectedConditions.visibilityOf(producto));
            wait.until(ExpectedConditions.elementToBeClickable(producto));

            producto.click();
            System.out.println("Producto seleccionado: " + PRODUCTO);

        } catch (Exception e) {
            System.out.println("Error al intentar seleccionar el producto: " + e.getMessage());
        }
    }

    // Método para validar la cantidad y agregar el producto al carrito
    public void cantidadAgregarAlCarrito(int UNIDADES) {
        try {
            // Validar que el botón de aumentar cantidad sea clickeable
            wait.until(ExpectedConditions.elementToBeClickable(aumentarCantidad));
            if (UNIDADES > 1) {
                int cantidadActual = 1;
                while (cantidadActual < UNIDADES) {
                    aumentarCantidad.click();
                    cantidadActual++;
                }
            }

            // Validar que el botón para agregar al carrito sea clickeable
            wait.until(ExpectedConditions.elementToBeClickable(agregarCarrito));
            agregarCarrito.click();
            System.out.println("Producto agregado al carrito con " + UNIDADES + " unidades.");
        } catch (Exception e) {
            System.out.println("Error al intentar agregar el producto al carrito: " + e.getMessage());
        }
    }

    public boolean validarCarritoCompra() {
        try {
            // Validar que el botón del carrito sea visible y clickeable
            wait.until(ExpectedConditions.visibilityOf(carritoCompras));
            wait.until(ExpectedConditions.elementToBeClickable(carritoCompras));
            carritoCompras.click();

            // Obtener el título actual del producto en el carrito
            String tituloActual = tituloCompraCarrito.getText();

            // Validar que el título coincida con alguno de los productos
            switch (tituloActual) {
                case "Sauce Labs Backpack":
                case "Sauce Labs Bike Light":
                case "Sauce Labs Bolt T-Shirt":
                    return true;
                default:
                    return false;
            }
        } catch (Exception e) {
            System.out.println("Error al validar el carrito de compra: " + e.getMessage());
            return false;
        }
    }
}
