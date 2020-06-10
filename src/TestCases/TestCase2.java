package TestCases;

import FrameworkProperties.ApplicationScreenshot;
import WebpageElements.Chapter1WebElement;
import mainCaller.Commons;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestCase2 implements Commons {

    public TestCase2(WebDriver driver, int session_id, int row) {
        try {
            Chapter1WebElement webele = new Chapter1WebElement(driver);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Date date = new Date();
            long time = date.getTime();
            Timestamp ts = new Timestamp(time);
            excel.ExcelWrite("Chapter1", row, 4, ts.toString());
            webele.Chapter1Link.click();
            Select dropdown = new Select(webele.dropDown);
            dropdown.selectByValue("Selenium Code");
            Thread.sleep(4000);
            new ApplicationScreenshot(driver, "Chapter1_test2_" + session_id);
            webele.homePage.click();
            System.out.println("Test case Passed.");
            excel.ExcelWrite("Chapter1", row, 3, "PASS");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Test case Failed.");
            excel.ExcelWrite("Chapter1", row, 3, "FAIL");
            excel.ExcelWrite("Chapter1", row, 6, e.toString());
        }

    }
}
