package a_base;

import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.SelectCountriesPage;
import pages.SubscribePlanPage;

import java.io.File;
import java.io.IOException;

public class BaseTests {

    protected WebDriver driver;
    protected SubscribePlanPage subscribePlan;
    protected SelectCountriesPage countriesPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://subscribe.stctv.com/sa-en");
        driver.manage().window().maximize();
        subscribePlan = new SubscribePlanPage(driver);
        countriesPage = new SelectCountriesPage(driver);
    }

    @AfterMethod
    public void takeScreenshot(ITestResult result){

        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);

        try {
            Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

   @AfterClass
    public void tearDown () {
        driver.quit();
    }
}
