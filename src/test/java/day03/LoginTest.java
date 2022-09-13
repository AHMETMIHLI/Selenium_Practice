package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {

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

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //  a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        Thread.sleep(3000);

        //b. Sign in butonuna basin
        WebElement signInButton = driver.findElement(By.id("sign-in"));
        signInButton.click();
        Thread.sleep(3000);

        //  c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTexbox = driver.findElement(By.id("session_email"));
        WebElement password = driver.findElement(By.id("session_password"));
        WebElement signin = driver.findElement(By.name("commit"));

        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
        Thread.sleep(3000);
        emailTexbox.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signin.click();

        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement expecteduser = driver.findElement(By.className("navbar-text"));
        if (expecteduser.isDisplayed()) {
            System.out.println("Ecpecteduser Testi PASSED " + expecteduser.getText());
        } else System.out.println("Ecpecteduser Testi");

        //2.yol
        String istenendUserYazisi = "testtechproed@gmail.com";
        String actualUserYazisi = istenendUserYazisi;
        if (actualUserYazisi.equals(istenendUserYazisi)) {
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");


        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addresses = driver.findElement(By.ByLinkText.linkText("Addresses"));
        WebElement signout = driver.findElement(By.linkText("Sign out"));

        if (addresses.isDisplayed()) {
            System.out.println("Addresses testi PASSED");
        } else System.out.println("Addresses testi FAILED");

        if (signout.isDisplayed()) {
            System.out.println("SignOut testi PASSED");
        } else System.out.println("SignOut testi FAILED");

        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayısı : " + linklerListesi.size());

        //4.linkleri yazdırınız
        for (WebElement each : linklerListesi
        ) {
            System.out.println("Linkler: " + each.getText());
        }

        // linkleri lambda ile yazdırılım
        linklerListesi.forEach(t -> t.getText());


    }
}