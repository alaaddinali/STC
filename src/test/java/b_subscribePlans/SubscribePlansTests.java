package b_subscribePlans;

import a_base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testData.ExcelReader;

import java.io.IOException;

public class SubscribePlansTests extends BaseTests {

    @DataProvider(name="sa")
    public Object[][] saudiArabiaData() throws IOException {
        // get data from Excel Reader class
        ExcelReader excelReader = new ExcelReader();
        return excelReader.getExcelData(0);
    }

    @Test (priority = 0, dataProvider = "sa")
    public void getPackageDataForSA(String firstTitle, String firstPriceCurrency,
                                         String secondTitle, String secondPriceCurrency,
                                         String thirdTitle, String thirdPriceCurrency) {
        if (firstPriceCurrency != null) {
            countriesPage.selectSaudiCountry();
            Assert.assertEquals(subscribePlan.getFirstPackageName(), firstTitle);
            Assert.assertEquals(subscribePlan.getFirstPackagePriceCurrency(), firstPriceCurrency);
            Assert.assertEquals(subscribePlan.getSecondPackageName(), secondTitle);
            Assert.assertEquals(subscribePlan.getSecondPackagePriceCurrency(), secondPriceCurrency);
            Assert.assertEquals(subscribePlan.getThirdPackageName(), thirdTitle);
            Assert.assertEquals(subscribePlan.getThirdPackagePriceCurrency(), thirdPriceCurrency);
        }
    }

    @DataProvider(name="ba")
    public Object[][] bahrainData() throws IOException {
        // get data from Excel Reader class
        ExcelReader excelReader = new ExcelReader();
        return excelReader.getExcelData(1);
    }

    @Test (priority = 1, dataProvider = "ba")
    public void getPackageDataForBA(String firstTitle, String firstPriceCurrency,
                                         String secondTitle, String secondPriceCurrency,
                                         String thirdTitle, String thirdPriceCurrency) {
        if (firstPriceCurrency != null) {
            countriesPage.selectBahrainCountry();
            Assert.assertEquals(subscribePlan.getFirstPackageName(), firstTitle);
            Assert.assertEquals(subscribePlan.getFirstPackagePriceCurrency(), firstPriceCurrency);
            Assert.assertEquals(subscribePlan.getSecondPackageName(), secondTitle);
            Assert.assertEquals(subscribePlan.getSecondPackagePriceCurrency(), secondPriceCurrency);
            Assert.assertEquals(subscribePlan.getThirdPackageName(), thirdTitle);
            Assert.assertEquals(subscribePlan.getThirdPackagePriceCurrency(), thirdPriceCurrency);
        }
    }

    @DataProvider(name="kw")
    public Object[][] kuwaitData() throws IOException {
        // get data from Excel Reader class
        ExcelReader excelReader = new ExcelReader();
        return excelReader.getExcelData(2);
    }

    @Test (priority = 2, dataProvider = "kw")
    public void getPackageDataForKW(String firstTitle, String firstPriceCurrency,
                                         String secondTitle, String secondPriceCurrency,
                                         String thirdTitle, String thirdPriceCurrency) {
        if (firstPriceCurrency != null) {
            countriesPage.selectKuwaitCountry();
            Assert.assertEquals(subscribePlan.getFirstPackageName(), firstTitle);
            Assert.assertEquals(subscribePlan.getFirstPackagePriceCurrency(), firstPriceCurrency);
            Assert.assertEquals(subscribePlan.getSecondPackageName(), secondTitle);
            Assert.assertEquals(subscribePlan.getSecondPackagePriceCurrency(), secondPriceCurrency);
            Assert.assertEquals(subscribePlan.getThirdPackageName(), thirdTitle);
            Assert.assertEquals(subscribePlan.getThirdPackagePriceCurrency(), thirdPriceCurrency);
        }
    }

}
