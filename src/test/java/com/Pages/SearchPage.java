package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class SearchPage extends Library {

    
    SeleniumReusable se;

    // Constructor
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    // WebElement for search input
    @FindBy(xpath = "//input[@name='q']")  
    WebElement SearchText;
    
    @FindBy(xpath = "//html[@lang='en']")
    WebElement Homepage;
    
    @FindBy(xpath = "//html[@class=' fonts-loaded']")
    WebElement Searchresult;
    
    
    public void dismissLoginPopupIfPresent() {
        try {
            WebElement closeBtn = driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z, button._2KpZ6l._2doB4z._3dESVI, button[aria-label='Close']"));
            closeBtn.click();
        } catch (NoSuchElementException e) {
            // popup not present
        }
    }

    public void Search(String text) {
    	 se = new SeleniumReusable(driver);
        se.enterValue(SearchText, text);
    }

    // Method to press ENTER (submit search)
    public void clickSearch() {
        SearchText.sendKeys(Keys.ENTER);
    }
    public void homeScreen() {
    	System.out.println(Homepage.isDisplayed());
    }
    public void result() {
    	System.out.println(Searchresult.isDisplayed());
    	System.out.print(driver.getTitle());
    }
}
