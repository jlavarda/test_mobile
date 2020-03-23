package br.com.dbccompany.support

import org.openqa.selenium.chrome.ChromeDriver

class Drivers {

    static ChromeDriver getChromeDriver(){
        System.setProperty("webdriver.chrome.driver", getPathChromeDriver())
        return new ChromeDriver()
    }

    static String getPathChromeDriver(){
        String so = System.getProperty("os.name").toLowerCase()
        so = so.replaceAll(" ", "")
        so = so.replaceAll("[0-9]", "")
        String directory = System.getProperty("user.dir")

        if("windows".equals(so)){
            return directory + "/drivers/windows/chromedriver.exe"
        } else {
            return directory + "/drivers/${so}/chromedriver"
        }
    }


}
