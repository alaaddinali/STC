package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Helper;

public class SubscribePlanPage {

    private final WebDriver driver;
    protected Helper helper;
    public SubscribePlanPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By firstPackageTypeTitle = By.id("name-lite");
    private final By secondPackageTypeTitle = By.id("name-classic");
    private final By thirdPackageTypeTitle = By.id("name-premium");
    private final By firstPackageTypePriceCurrency = By.id("currency-lite");
    private final By secondPackageTypePriceCurrency = By.id("currency-classic");
    private final By thirdPackageTypePriceCurrency = By.id("currency-premium");

    public String getFirstPackageName(){
        helper = new Helper(driver);
        helper.waitUntilElementIsVisible(10, firstPackageTypeTitle);
        WebElement litePackageTitle = driver.findElement(firstPackageTypeTitle);
        return litePackageTitle.getText();
    }

    public String getSecondPackageName(){
        helper = new Helper(driver);
        helper.waitUntilElementIsVisible(10, secondPackageTypeTitle);
        WebElement litePackageTitle = driver.findElement(secondPackageTypeTitle);
        return litePackageTitle.getText();
    }

    public String getThirdPackageName(){
        helper = new Helper(driver);
        helper.waitUntilElementIsVisible(10, thirdPackageTypeTitle);
        WebElement litePackageTitle = driver.findElement(thirdPackageTypeTitle);
        return litePackageTitle.getText();
    }

    public String getFirstPackagePriceCurrency(){
        helper = new Helper(driver);
        helper.waitUntilElementIsVisible(10, firstPackageTypePriceCurrency);
        WebElement litePackageTitle = driver.findElement(firstPackageTypePriceCurrency);
        return litePackageTitle.getText();
    }

    public String getSecondPackagePriceCurrency(){
        helper = new Helper(driver);
        helper.waitUntilElementIsVisible(10, secondPackageTypePriceCurrency);
        WebElement litePackageTitle = driver.findElement(secondPackageTypePriceCurrency);
        return litePackageTitle.getText();
    }

    public String getThirdPackagePriceCurrency(){
        helper = new Helper(driver);
        helper.waitUntilElementIsVisible(10, thirdPackageTypePriceCurrency);
        WebElement litePackageTitle = driver.findElement(thirdPackageTypePriceCurrency);
        return litePackageTitle.getText();
    }
}
