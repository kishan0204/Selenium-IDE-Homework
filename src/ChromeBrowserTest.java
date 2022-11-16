import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        //Open URL
        String baseurl ="https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println("page title is:"+ title);

        //Print the current url
        System.out.println("Current URL:" +driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page Source:" +driver.getPageSource());

        //navigat to Login page Clicking on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

//Enter the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Kishan_0204@yahoo.co.in");

        //Enter the password to password field

        WebElement PasswordField = driver.findElement(By.name("Password"));
        PasswordField.sendKeys("Kishan");

        //Close the browser
driver.quit();






}
}