package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();  // browser'ı tam sayfa yapar
        driver.get("https://www.amazon.com");
        System.out.println("actual title: "+ driver.getTitle()); // Gidilen sayfanın başlığını String olarak döndürür
        System.out.println("actual url: "+ driver.getCurrentUrl());  // Gidilen sayfanın url sini String olarak döndürür

        driver.close(); // sayfayı kapatır



    }
}
