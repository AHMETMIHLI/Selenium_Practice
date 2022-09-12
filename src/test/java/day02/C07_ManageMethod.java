package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageMethod {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        // maximize iken boyutlarını alalım
        System.out.println("Maximize iken boyutu: "+ driver.manage().window().getSize());
        System.out.println("Maximize ike konumu : "+ driver.manage().window().getPosition());

        driver.manage().window().fullscreen();
        // fullscreen iken boyutları alalım  , fullscreen aynı zamanda pc nin çözünürlüğünü de verir
        System.out.println("Fullscren iken boyutu : "+ driver.manage().window().getSize());
        System.out.println("Fullscren iken konumu : "+ driver.manage().window().getPosition());

    }

}
