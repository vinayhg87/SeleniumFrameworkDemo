package TestCases;

import FrameworkProperties.ApplicationScreenshot;
import WebpageElements.Chapter1WebElement;
import mainCaller.Commons;
import org.openqa.selenium.WebDriver;
import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestCase1 implements Commons {

    public TestCase1(WebDriver driver, int session_id, int row) {
        try {
            Chapter1WebElement webele = new Chapter1WebElement(driver);
            Date date = new Date();
            long time = date.getTime();
            Timestamp ts = new Timestamp(time);
            excel.ExcelWrite("Chapter1", row, 4, ts.toString());
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            webele.Chapter1Link.click();
            webele.checkbox.click();
            webele.radioButton.click();
            Thread.sleep(2000);
            webele.inputBox.sendKeys(excel.ExcelRead("Chapter1", row, 5));
            Thread.sleep(3000);
            String plaintext = webele.plainText.getText();
            System.out.println(plaintext);
            new ApplicationScreenshot(driver, "Chapter1_test1_" + session_id);
            webele.homePage.click();
            System.out.println("Test case Passed.");
            excel.ExcelWrite("Chapter1", row, 3, "PASS");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Test case failed.");
            excel.ExcelWrite("Chapter1", row, 3, "FAIL");
            excel.ExcelWrite("Chapter1", row, 6, e.toString());
        }
    }

}
