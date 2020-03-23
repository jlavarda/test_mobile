package br.com.dbccompany.support

import br.com.dbccompany.pageObjects.DefaultPageObject
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

import java.util.concurrent.TimeUnit

class WebDriverHelper {

    def static waitPageLoader(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, TimeoutsConstantList.TIMEOUT_LOADER_DEFAULT)
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(DefaultPageObject.loader)))
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.tagName(DefaultPageObject.loader)))
    }

    def static waitPageLoader(WebDriver driver, timeout){
        WebDriverWait wait = new WebDriverWait(driver, timeout)
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(DefaultPageObject.loader)))
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.tagName(DefaultPageObject.loader)))
    }

    def static waitFastLoading(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(TimeoutsConstantList.TIMEOUT_FAST_DEFAULT, TimeUnit.SECONDS)
    }
}
