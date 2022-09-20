package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C0_ManageWindowSet_Odev {
    public static void main(String[] args) {
        /*
        1-Yeni bir class oluşturalım
        2-Amazon sayfasına gidelim. https://www.amazon.com/
        3-Sayfalanın konumunu ve boyutlarını yazdırın
        4-Sayfanın konumunu ve boyutunu istediğiniz şekilde ayarlayın
        5- Sayfanın sizin istediğiniz konum ve boyuta geldiğini test edin
        6- Sayfayı kapatın
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //2-Amazon sayfasına gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //3-Sayfalanın konumunu ve boyutlarını yazdırın
        System.out.println("Sayfanın ilk konumu : "+ driver.manage().window().getPosition());
        System.out.println("Sayfanın ilk boyutu :"+ driver.manage().window().getSize());

        //4-Sayfanın konumunu ve boyutunu istediğiniz şekilde ayarlayın
        int konumX=60;
        int konumY=30;
        driver.manage().window().setPosition(new Point(konumX,konumY));

        int width=800;
        int height=600;
        driver.manage().window().setSize(new Dimension(width,height));


        // 5- Sayfanın sizin istediğiniz konum ve boyuta geldiğini test edin

        //Konum testi
        int x=driver.manage().window().getPosition().getX();
        int y=driver.manage().window().getPosition().getY();
        if(konumX==x && konumY==y){
            System.out.println("İstenen Konum  testi PASSED");
        }else System.out.println("İstenen Konum  testi FAILED");

        // Boyut Testi
        int widthSayi=driver.manage().window().getSize().getWidth();
        int heightSayi=driver.manage().window().getSize().getHeight();
        if(widthSayi==width && heightSayi==height){
            System.out.println("İstenen Boyut  testi PASSED");
        }else System.out.println("İstenen Boyut  testi FAILED");




        //6-
        driver.close();


    }
}
