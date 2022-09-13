package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetMethodlari {
    public static void main(String[] args) {

    /*
    -Amazon sayfasına gidiniz
    -Arama kutusunu locate ediniz
    -Arama kutusunun tagName'inin input olduğunu test ediniz
    -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
    -Sayfayı kapatınız
     */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //-Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");

        //-Arama kutusunu locate ediniz
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        //-Arama kutusunun tagName'inin input olduğunu test ediniz
        String expectedTagname="input";
        String actualTagname=aramaKutusu.getTagName();
        if(actualTagname.equals(expectedTagname)){
            System.out.println("Tagname Testi Passed "+ actualTagname);
        }else System.out.println("Tagname Testi Failed");

       // -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String expectedAtributeName="field-keywords";
        String actualAtribute=aramaKutusu.getAttribute("name");
        if(actualAtribute.equals(expectedAtributeName)){
            System.out.println("Atribute Testi PASSED");
        }else System.out.println("Atribute TESTİ FAILED");

        //Arama kutusunun  konumunu yazdırın
        System.out.println("Arama kutusunun konumu : "+ aramaKutusu.getLocation());

        //  -Sayfayı kapatınız
        driver.close();
    }
}
