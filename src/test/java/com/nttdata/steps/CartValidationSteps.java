package com.nttdata.steps;

import com.nttdata.screens.AgregarProductoScreen;
import com.nttdata.screens.ValidarCargaScreen;
import org.junit.Assert;

public class CartValidationSteps {

    AgregarProductoScreen agregarProductoScreen;

    ValidarCargaScreen validarCargaScreen;

    public void validarCarga(){
        Assert.assertTrue("La carga de la app es correcta",validarCargaScreen.isProductsDisplayed());
    }



    public void VerAddProducts(int UNIDADES, String PRODUCTO){
        agregarProductoScreen.seleccionarProducto(PRODUCTO);
        agregarProductoScreen.cantidadAgregarAlCarrito(UNIDADES);
    }

    public void ValidarCarritoCompra() {
        Assert.assertTrue("El producto se agregó satisfactoriamente", agregarProductoScreen.validarCarritoCompra());
    }

}
