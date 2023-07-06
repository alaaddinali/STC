package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Helper;

public class SelectCountriesPage {

    private final WebDriver driver;
    protected Helper helper;
    public SelectCountriesPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By countryButton = By.id("country-btn");
    private final By bahrainCountry = By.id("bh");
    private final By saudiCountry = By.id("sa");
    private final By kwwaitCountry = By.id("kw");

    public void selectSaudiCountry(){
        helper = new Helper(driver);
        helper.waitUntilElementIsVisible(10, countryButton);
        driver.findElement(countryButton).click();
        // Switch to the modal dialog
        driver.switchTo().activeElement();
        helper.waitUntilElementIsVisible(10, saudiCountry);
        driver.findElement(saudiCountry).click();
        driver.switchTo().defaultContent();
    }

    public void selectBahrainCountry(){
        helper = new Helper(driver);
        helper.waitUntilElementIsVisible(10, countryButton);
        driver.findElement(countryButton).click();
        // Switch to the modal dialog
        driver.switchTo().activeElement();
        helper.waitUntilElementIsVisible(10, bahrainCountry);
        driver.findElement(bahrainCountry).click();
        driver.switchTo().defaultContent();
    }

    public void selectKuwaitCountry(){
        helper = new Helper(driver);
        helper.waitUntilElementIsVisible(10, countryButton);
        driver.findElement(countryButton).click();
        // Switch to the modal dialog
        driver.switchTo().activeElement();
        helper.waitUntilElementIsVisible(10, kwwaitCountry);
        driver.findElement(kwwaitCountry).click();
        driver.switchTo().defaultContent();
    }
}
