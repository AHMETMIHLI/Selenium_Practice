package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) {
         /*
        Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        //b. Sign in butonuna basin
        WebElement siginLinki=driver.findElement(By.linkText("Sign in"));
        siginLinki.click();

        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailtextbox=driver.findElement(By.id("session_email"));
        WebElement password=driver.findElement(By.name("session[password]"));
        WebElement signinLink=driver.findElement(By.name("commit"));

        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        emailtextbox.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signinLink.click();

        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualUserElementi=driver.findElement(By.className("navbar-text"));
        System.out.println(actualUserElementi.getText());
        String expectedUser="testtechproed@gmail.com";
        if(expectedUser.equals(actualUserElementi.getText())){
            System.out.println("Expected kullanıcı testi PASSED");
        }else System.out.println("Expected kullanıcı testi FAILED");

        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addressesElementi=driver.findElement(By.linkText("Addresses"));
        WebElement signoutElementi=driver.findElement(By.linkText("Sign out"));

        if(addressesElementi.isDisplayed()){
            System.out.println("addresses testi PASSED");
        }else System.out.println("addresses testi FAILED");


        if(signoutElementi.isDisplayed()){
            System.out.println("addresses testi PASSED");
        }else System.out.println("addresses testi FAILED");

        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi=driver.findElements(By.tagName("a"));
        System.out.println("Linklerin link sayısı : "+ linklerListesi.size());

        // Linkleri yazdıralım foreacle yazdırırız
        for (WebElement w:linklerListesi
             ) {
            System.out.println(w.getText());

        }




    }
}
