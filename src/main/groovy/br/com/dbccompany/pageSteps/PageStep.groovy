package br.com.dbccompany.pageSteps

import br.com.dbccompany.pageObjects.DefaultPageObject
import br.com.dbccompany.support.TimeoutsConstantList
import br.com.dbccompany.support.WebDriverHelper
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import java.util.concurrent.TimeUnit

class PageStep {

    private def final URL_ESTABELECIMENTO = "http://gc-jurema.embratec.local:8502/EstabelecimentoSSL/Login/Home.cfm?cd_manutencao_oficina=&fl_tipo=&cd_cotacao_oficina=10:00so%20tenho%20do%20meu%20projeto"
    WebDriver driver

    PageStep(WebDriver driver){
        this.driver = driver
    }

    def abrirSessao(){
        driver.get(URL_ESTABELECIMENTO)
        driver.manage().window().maximize()
    }

    def finalizarSessao(){
        sleep(30000)
        //driver.findElement(By.linkText(DefaultPageObject.exit))
        //driver.manage().timeouts().implicitlyWait(TimeoutsConstantList.TIMEOUT_EXIT_DEFAULT, TimeUnit.SECONDS)
        driver.close()

        return true
    }
}
