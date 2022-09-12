package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_ManageMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        System.out.println("Pencere Ölçüleri : "+ driver.manage().window().getSize());
        System.out.println("Pencere konumu : "+ driver.manage().window().getPosition());
        Thread.sleep(3000);


        // Pencere konumunu ve büyüklüğünü değiştirelim
        driver.manage().window().setSize(new Dimension(15,15));
        driver.manage().window().setPosition(new Point(900,600));
        Thread.sleep(3000);

        System.out.println("Yeni Pencere Ölçüleri : "+ driver.manage().window().getSize());
        System.out.println("Yeni Pencere konumu : "+ driver.manage().window().getPosition());

        driver.close();
    }
}
