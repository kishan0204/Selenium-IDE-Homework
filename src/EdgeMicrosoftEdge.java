import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeMicrosoftEdge {

    public static void main(String[] args) {
        String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver","drives/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        // launch the url
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //  3. Print the title of the page
        String title = driver.getTitle();
        System.out.println("page title is : + title");

        //4. Print the current url
        System.out.println("Current URL:" + driver.getCurrentUrl());

        //5. Print the page source
        System.out.println("Page source : " +driver.getCurrentUrl());

        //6. Enter the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("kishan_0204@yahoo.co.in");

        //7. Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("123456");

//8. Close the browser
        driver.quit();

    }
}
