package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_Tekrar3 {
    public static void main(String[] args) {

        // amazon sitesine gidip kaynak kodlarına "Gateway" yazdığını test edin
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        // getPageSource() sayfa kaynağını verir soutla yazdırırsak tüm sayfa kodlarını yazdırırız
        String sayfaKaynakKodlari = driver.getPageSource();
        String arananKelime="Gateway";

        if(sayfaKaynakKodlari.contains(arananKelime)){
            System.out.println("Kaynak kodu testi PASSED");
        }else System.out.println("Kaynak kodu testi FAILED");
    }
}
