package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C0_TekrarTesti {
    public static void main(String[] args) throws InterruptedException {

          /*
           1. Yeni bir class olusturun (TekrarTesti)
           2. Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını doğrulayın
           (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
           3. Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
           URL'yi yazdırın.
           4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
           5. Youtube sayfasina geri donun
           6. Sayfayi yenileyin
           7. Amazon sayfasina donun
           8. Sayfayi tamsayfa yapin
           9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
           doğru başlığı(Actual Title) yazdırın.
           10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
           URL'yi yazdırın
           11.Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // 2. Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını doğrulayın
        // (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.navigate().to("https://youtube.com");
        Thread.sleep(3000);
        String baslikTitleY=driver.getTitle();
        String arananTitleY="youtube";
        if(baslikTitleY.contains(arananTitleY)){
            System.out.println("Aranan Title PASSED");
        }else System.out.println("Aranan Title "+ arananTitleY+ " :FAILED ");

        // 3. Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        // URL'yi yazdırın.
        String sayfaUrlY=driver.getCurrentUrl();
        String arananUrlY="youtube";
        if(sayfaUrlY.contains(arananUrlY)){
            System.out.println("Aranan URL "+ arananUrlY+ " PASSED");
        }else System.out.println("Aranan URL"+ arananUrlY+ "FAILED");

        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");


        // 5. Youtube sayfasina geri donun
        Thread.sleep(3000);
        driver.navigate().back();

        //6. Sayfayi yenileyin
        Thread.sleep(3000);
        driver.navigate().refresh();

       // 7. Amazon sayfasina donun
        Thread.sleep(3000);
        driver.navigate().forward();

        //8. Sayfayi tamsayfa yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        // doğru başlığı(Actual Title) yazdırın.

        String actualTitle=driver.getTitle();
        String arananTitleA="Amazon";
        if(actualTitle.contains(arananTitleA)){
            System.out.println("Aranan title :"+ arananTitleA+ " PASSED");
        }else System.out.println("Aranan title  FAILED. Actual Title :"+ driver.getTitle());

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String actualUrl=driver.getCurrentUrl();
        String arananUrlA="https://www.amazon.com/";
        if(actualUrl.contains(arananUrlA)){
            System.out.println("Actual URL :"+ arananUrlA+ " PASSED");
        }else System.out.println("Aranan URL FAILED .Actual URL :  "+ driver.getCurrentUrl());

        // 11.Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();


    }
}
