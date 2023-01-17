package com.nttdata.steps;

import com.nttdata.screens.LoginScreenApp;
import com.nttdata.screens.ProductScreen;
import net.thucydides.core.annotations.Step;

public class SwagLabSteps {

    SwagLabSteps swagLabSteps;
    LoginScreenApp loginScreenApp;
    ProductScreen productScreen;


    @Step("Click en registrar usuario")
    public void clickRegistrarUsuario(String userName){
        loginScreenApp.typeUserName(userName);
    }

    @Step("Click en registrar contraseña")
    public void clickRegistrarPassword(String userPassword){
        loginScreenApp.typePassword(userPassword);
    }

    @Step("Click en botón Login")
    public void clickLogin(){
        loginScreenApp.login();
    }


    @Step("Obtiene el texto del titulo")
    public String getTextTittle(){
        return productScreen.getTitle();

    }



}
