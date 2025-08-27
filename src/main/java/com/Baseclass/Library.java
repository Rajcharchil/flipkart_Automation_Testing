package com.Baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {
    
    public static WebDriver driver;   
    public static Properties prop;

    public void launchApplication() throws IOException {
        
        FileInputStream input = new FileInputStream("src/test/resources/Properities/Config.properties");
        prop = new Properties();
        prop.load(input);

        try {
            String browserName = prop.getProperty("browser");
            if (browserName.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                
            } else if (browserName.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();  
                driver = new FirefoxDriver();
                
            } else {
                throw new RuntimeException("Browser not supported: " + browserName);
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get(prop.getProperty("url"));

        } catch (Exception e) {
            System.out.println("❌ Browser did not launch: " + e.getMessage());
        }
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();   
        }
    }
}
