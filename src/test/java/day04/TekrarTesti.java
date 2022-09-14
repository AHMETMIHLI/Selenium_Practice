package day04;

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
        Main method oluşturun ve aşağıdaki görevleri tamamlayın
        a- Amazona  sayfasına gidin. https://www.amazon.com/
        b- Search(ara)"city bike"
        c- Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        d- Sonra karşısınıza çıkan ilk sonucun resmine tıklayın
        */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a- Amazona gidin https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        // b- Search(ara)"city bike"
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

        //c- Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> istenenElementlerinListesi=driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazisiElementi=istenenElementlerinListesi.get(0);

        //d- Sonra karşısınıza çıkan ilk sonucun resmine tıklayın
        List<WebElement> urunResimleri=driver.findElements(By.className("s-image"));
        WebElement ilkUrunResmi=urunResimleri.get(0);
        ilkUrunResmi.click();



    }
}
