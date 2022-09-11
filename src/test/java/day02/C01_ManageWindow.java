package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ManageWindow {
    public static void main(String[] args) throws InterruptedException {

        /*
        1-Yeni bir class oluşturalım
        2-Amazon sayfasına gidelim. https://www.amazon.com/
        3-Sayfalanın konumunu ve boyutlarını yazdırın
        4-Sayfayı simge durumuna getirin
        5-simge durumunda 3 saniye bekleyip sayfayı maximize yapın
        6-Sayfanın konumunu ve boyutlarını maximize durumunda yazdırın
        7-sayfayı fullscreen yapın
        8-Sayfanın konumunu ve boyutlarını fullscreen durumunda yazdırın
        9-Sayfayı kapatın
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //2-
        driver.get("https://www.amazon.com/");

        //3-
        System.out.println("Sayfanın ilk Konumu: "+ driver.manage().window().getPosition());
        System.out.println("Sayfanın ilk Boyutu: "+driver.manage().window().getSize());

        //4-
        driver.manage().window().minimize();

        //5-
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //6-
        System.out.println("Sayfanın Maximize sonrası Konumu: "+ driver.manage().window().getPosition());
        System.out.println("Sayfanın Maximize sonrası Boyutu: "+ driver.manage().window().getSize());

        //7-
        driver.manage().window().fullscreen();

        //8-
        System.out.println("Sayfanın Fullscreen sonrası Konumu: "+ driver.manage().window().getPosition());
        System.out.println("Sayfanın Fullscreen sonrası Boyutu: "+ driver.manage().window().getSize());

        //9-
        driver.close();
    }
}
