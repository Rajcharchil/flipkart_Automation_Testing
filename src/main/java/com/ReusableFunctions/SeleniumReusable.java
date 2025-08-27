package com.ReusableFunctions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Baseclass.Library;

public class SeleniumReusable extends Library {

    // Constructor to initialize driver (optional since driver is static in Library)
    public SeleniumReusable(WebDriver driver) {
        this.driver = driver;
    }

    // Enter text into a web element
    public void enterValue(WebElement element, String text) {
        try {
            element.sendKeys(text);
        }
        catch (Exception e) {
            System.out.println(" Exception while entering value: " + e.getMessage());
        }
    }

    // Click a web element
    public void click(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            System.out.println("Exception while clicking: " + e.getMessage());
        }
    }

    // Get the title of the page
    public void getTitleOfPage() {
        try {
            System.out.println("Page Title: " + driver.getTitle());
        } catch (Exception e) {
            System.out.println(" Could not get the Title: " + e.getMessage());
        }
    }

    // Take screenshot
    public void screenshot(String path) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File(path));
            System.out.println("✅ Screenshot saved at: " + path);
        } 
        catch (Exception e) {
            System.out.println("❌ Screenshot capture failed: " + e.getMessage());
        }
    }
}
