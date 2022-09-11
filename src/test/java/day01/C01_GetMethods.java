package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_GetMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();         // açılan browser penceresini düzenledik

        driver.get("https://www.amazon.com");        // Amazon sayfasina gidelim. https://www.amazon.com/
        System.out.println(driver.getTitle());                           // Sayfa basligini(title) yazdirin

        String actiolTitle=driver.getTitle();         // Sayfa basliginin “Amazon” icerdigini test edin
           String titleArananKelime="Amazon";
           if(actiolTitle.contains(titleArananKelime)){
               System.out.println("Actiol Title amazon içeriyor PASSED");
           }else System.out.println("Actiol Title amazon içermiyor FAILED");


        System.out.println(driver.getCurrentUrl());                       //  Sayfa adresini(url) yazdirin

          String actiolUrl=driver.getCurrentUrl();       //  Sayfa url’inin “amazon” icerdigini test edin.
          String urlArananKelime="amazon";
          if(actiolUrl.contains(urlArananKelime)){
            System.out.println("Actiol Url amazon içeriyor PASSED");
          }else System.out.println("Actiol Url amazon içermiyor FAILED");

          System.out.println(driver.getWindowHandle());   //Sayfa handle degerini yazdirin


            String htmlKodlari=driver.getPageSource();      // Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
            String htmlArananKelime="Gateway";
            if(htmlKodlari.contains(htmlArananKelime)){
                System.out.println("Sourscode testi PASSED");
            }else System.out.println("Sourscode testi FAILED");

            driver.close();             // sayfayı kapatalım


    }
}
