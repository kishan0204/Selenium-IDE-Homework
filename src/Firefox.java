import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {

    public static void main(String[] args) {
        //1. Setup firefox browser
        String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.firefox.driver","drives/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();


        //2. Open URL
        driver.get(baseurl);

        //maximise window
        driver.manage().window().maximize();

        // we give implicit to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        //3. Print the title of the page
        String title = driver.getTitle();
        System.out.println("page title is:"+ title);

       // 4. Print the current url
        System.out.println("Current URL:" +driver.getCurrentUrl());

        //5. Print the page source
        System.out.println("page source :"+ driver.getPageSource());

        //6. Enter the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("kishan_0204@yahoo.co.in");

        //7. Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("kishan");

        //8.click on
        driver.quit();


    }
}
