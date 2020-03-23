package br.com.dbccompany.pageSteps

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import br.com.dbccompany.pageObjects.HomePageObject
import br.com.dbccompany.support.WebDriverHelper
import br.com.dbccompany.support.Usuarios

class HomeStep extends PageStep {

    HomePageObject loginObjects

    HomeStep(WebDriver driver){
        super(driver)
        loginObjects = new HomePageObject()
        abrirSessao()
    }

    //usuario da classe Usuarios
//    def efetuarLogin(){
//        def usuario = Usuarios.retornaUsuario()
//        println "esse é o usuario ${usuario}"
//        pressionarEntrar()
//    }

    def inserirCredenciais(codigo, usuario, senha){
        driver.findElement(By.id(loginObjects.inputCod)).sendKeys(codigo)
        driver.findElement(By.id(loginObjects.inputLogin)).sendKeys(usuario)
        driver.findElement(By.id(loginObjects.inputPassword)).sendKeys(senha)
    }

    def pressionarEntrar(){
       // driver.findElement(By.id(loginObjects.buttonEnter)).click()
        WebDriverHelper.waitPageLoader(driver)
    }

}
