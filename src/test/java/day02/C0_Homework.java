package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C0_Homework {
    public static void main(String[] args) throws InterruptedException {

         /*
        1.Yeni bir class olusturalim (Homework)
        2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i
        yazdirin.
        4.https://www.walmart.com/ sayfasina gidin.
        5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        6. Tekrar "facebook" sayfasina donun
        7. Sayfayi yenileyin
        8. Sayfayi tam sayfa (maximize) yapin
        9.Browser'i kapatin
    */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // 2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
        // oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.navigate().to("https://facebook.com");
        Thread.sleep(3000);
        driver.getTitle();
        String sayfaBasligi=driver.getTitle();
        String arananTitle="facebook";
        if(sayfaBasligi.contains(arananTitle)){
            System.out.println("Aranan title PASSED");
        }else System.out.println("Aranan title FAILED, Aranan titli : "+ arananTitle);   // Aranan title FAILED, Aranan titli : facebook

       // 3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i
       // yazdirin.
        driver.getCurrentUrl();
        String urlfacebook=driver.getCurrentUrl();
        String arananUrl="facebook";
        if(urlfacebook.contains(arananUrl)){
            System.out.println("aranan Url :"+ arananUrl+ " PASSED");     //aranan Url :facebook PASSED
        }else System.out.println("Aranan URL "+ arananUrl +"  FAILED ");


        // 4.https://www.walmart.com/ sayfasina gidin.
        Thread.sleep(3000);
        driver.navigate().to("https://www.walmart.com/");


        // 5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        String sayfaBasligiWalMart=driver.getTitle();
        String arananTitleWalMart="Walmart.com";
        if(sayfaBasligiWalMart.contains(arananTitleWalMart)){
            System.out.println("Aranan Title  PASSED");            //Aranan Title  PASSED
        }else System.out.println("Aranan : "+ arananTitle +"  FAILED");

        //6. Tekrar "facebook" sayfasina donun
        Thread.sleep(3000);
        driver.navigate().back();

        // 7. Sayfayi yenileyin
        Thread.sleep(3000);
        driver.navigate().refresh();

        // 8. Sayfayi tam sayfa (maximize) yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        // 9.Browser'i kapatin
        driver.close();


    }
}
