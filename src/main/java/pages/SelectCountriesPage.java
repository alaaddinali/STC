package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Helper;

public class SelectCountriesPage {

    private WebDriver driver;
    protected Helper helper;
    public SelectCountriesPage(WebDriver driver) {
        this.driver = driver;
    }

    private By countryButton = By.id("country-btn");
    private By selectCountryPopup = By.id("country-selct");
    private By bahrainCountry = By.id("bh");
    private By saudiCountry = By.id("sa");
    private By kwwaitCountry = By.id("kw");
    private By thirdPackageTypePriceCurrency = By.id("currency-premium");

    public void selectSaudiCountry(){
        helper = new Helper(driver);
        WebElement element = helper.waitUntilElementIsVisible(10, countryButton);
        driver.findElement(countryButton).click();
        // Switch to the modal dialog
        driver.switchTo().activeElement();
        WebElement element1 = helper.waitUntilElementIsVisible(10, saudiCountry);
        driver.findElement(saudiCountry).click();
        driver.switchTo().defaultContent();
    }

    public void selectBahrainCountry(){
        helper = new Helper(driver);
        WebElement element = helper.waitUntilElementIsVisible(10, countryButton);
        driver.findElement(countryButton).click();
        // Switch to the modal dialog
        driver.switchTo().activeElement();
        WebElement element1 = helper.waitUntilElementIsVisible(10, bahrainCountry);
        driver.findElement(bahrainCountry).click();
        driver.switchTo().defaultContent();
    }

    public void selectKuwaitCountry(){
        helper = new Helper(driver);
        WebElement element = helper.waitUntilElementIsVisible(10, countryButton);
        driver.findElement(countryButton).click();
        // Switch to the modal dialog
        driver.switchTo().activeElement();
        WebElement element1 = helper.waitUntilElementIsVisible(10, kwwaitCountry);
        driver.findElement(kwwaitCountry).click();
        driver.switchTo().defaultContent();
    }
}
