package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_Tekrar4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();         // açılan browser penceresini düzenledik

        System.out.println(driver.getWindowHandle()); // benzersiz olarak açılan window'a ait hashcode'u verir

    }
}
