package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) throws InterruptedException {

      /*
      1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
      2- Add element butonuna basın
      3- Delete butonunun görünür olduğunu test edin
      4- Delete tuşuna basın
      5-éAdd/Remove Elements" yazısının görünür olduğunu test edin
       */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        //3- Delete butonunun görünür olduğunu test edin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        // Bir seferlik kullanacaksak Webelemente atamaya gerek yok
        WebElement deleteButonu = driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButonu.isDisplayed()) {
            System.out.println("Delete Buton Passed");
        } else System.out.println("Delete Button Failed");

        // 4- Delete tuşuna basın
        Thread.sleep(3000);
        deleteButonu.click();

        //5-éAdd/Remove Elements" yazısının görünür olduğunu test edin
        WebElement addElement = driver.findElement(By.xpath("//h3"));
        if (addElement.isDisplayed()) {
               System.out.println("AddElemnent Testi Passed");
            } else System.out.println("AddElemnent Testi Failed");

        Thread.sleep(3000);
        driver.close();
    }
}