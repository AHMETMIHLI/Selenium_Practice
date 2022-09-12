package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Tekrar2 {
    public static void main(String[] args) {

        /*
        1- https://www.amazon.com url sine gidin
        2- Başlığın Amazon kelimesi içerdiğini test edin
        3-Url'nin "https://www.amazon.com" a eşit olduğunu test edin
        4- sayfayı kapatın .
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();


        // 1- https://www.amazon.com url sine gidin
        driver.get("https://www.amazon.com");

        //2- Başlığın Amazon kelimesi içerdiğini test edin
        String actiolTitle =driver.getTitle();
        String arananKelime="Amazon";
        if(actiolTitle.contains(arananKelime)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Titlie testi FAILED");

        //3-Url'nin "https://www.amazon.com" a eşit olduğunu test edin
        String actiolUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com";
        if(actiolUrl.contains(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi beklenen url den farklı  FAILED");

        //  4- sayfayı kapatın .
        driver.close();

    }
}
