package AutomateFlipkartPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class flipkartPageTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // 1. Open Flipkart
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // 2. Click on login button
        driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']")).click();

        // 3. Enter Email
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='r4vIwl BV+Dqf']")))
            .sendKeys("sumangal7000@gmail.com");

        // 4. Click on Continue/Next
        wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button"))).click();

        Thread.sleep(2000);

        // 5. Enter mobile number
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.r4vIwl")))
            .sendKeys("9876543210");

        // 6. Click on Continue button
        wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[@type='submit']//span[text()='CONTINUE']"))).click();

        Thread.sleep(3000); // OTP step (manual)

        // 7. Search for "i phone"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("i phone");
        searchBox.submit();

        Thread.sleep(3000); // wait for results

        // 8. Locate the phone and click
        driver.findElement(By.xpath("//img[@alt='Apple iPhone 16 (Teal, 128 GB)']")).click(); 
        Thread.sleep(2000);
        
        
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

       
        driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
        
        

        //        // 4. Scroll into view + click
        //        JavascriptExecutor js = (JavascriptExecutor) driver;
        //        js.executeScript("arguments[0].scrollIntoView(true);", phone);
        //        Thread.sleep(1000); // little pause for smooth scroll
        //        phone.click();

        // 10. Print current page title
        System.out.println("Page title is: " + driver.getTitle());

        // 11. Close browser
        // driver.quit();
    }
}
