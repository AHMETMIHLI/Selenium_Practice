package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageWindowSet {
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

        //2-
        driver.get("https://www.amazon.com/");

        //3-
        System.out.println("Sayfanın ilk konumu : "+ driver.manage().window().getPosition());
        System.out.println("Sayfanın ilk boyutu :"+ driver.manage().window().getSize());

        //4-
        driver.manage().window().setPosition(new Point(60,30));
        driver.manage().window().setSize(new Dimension(800,600));


        //5-
        System.out.println("Sayfanın istenen koordinat konumu : "+ driver.manage().window().getPosition());
        System.out.println("Sayfanın istenen boyut ölçüleri : "+ driver.manage().window().getSize());

        //6-
        driver.close();


    }
}
