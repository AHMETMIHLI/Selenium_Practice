package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_Navigate {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);       // açılan pencere 3 saniye beklesin

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);

        // amazon'a geri gelsin
        driver.navigate().back();
        Thread.sleep(3000);

        // yeniden Facebook'a gitsin
        driver.navigate().forward();

        // sayfası refresh yapsın
        driver.navigate().refresh();
        Thread.sleep(3000);

        // sayfayı kapatsın
        driver.close();

    }
}
