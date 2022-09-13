package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TekrarTesti {
    public static void main(String[] args) {
         /*
      1. Bir class oluşturun : AmazonSearchTest
      2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
      a. web sayfasına gidin. https://www. amazon.com/
      b. Search(ara) “city bike”
      c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
      e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
    */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //   a. web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com/");

        //b. Search(ara) “city bike”
       WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
       aramaKutusu.sendKeys("city bike", Keys.ENTER);

        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> listlerinListesi=driver.findElements(By.tagName("a"));
        System.out.println("Listteki elementlerin sayısı :"+ listlerinListesi.size());

        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın




    }
}
