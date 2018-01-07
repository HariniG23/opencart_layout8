package Opencart;

import org.junit.*;



public class BrowserConfigTest {
    public static WebDriver driver;

    public static void main (String [] args) throws Exception {

        System.setProperty("webdriver.chrome.driver","chromedriver");

        driver = new ();

        driver.get("http://opencart.opencartworks.com/themes/so_emarket/layout8/");

        Thread.sleep(3000);

        driver.quit();

    }

    public void setUp() throws Exception {
        super.setUp();
    }

    }