package mainCaller;

import TestCases.TestCase1;
import TestCases.Testcase2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Random;

public class caller {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.gecko.driver", "libs/geckodriver");
        WebDriver driver = new FirefoxDriver();
        //driver.get("https://learn.letskodeit.com/p/practice");
        driver.get("http://book.theautomatedtester.co.uk/");
        driver.manage().window().maximize();
        Random rad = new Random();
        int session_id = rad.hashCode();
        TestCase1 execute = new TestCase1();
        execute.testExe(driver, session_id);
        Thread.sleep(3000);
        Testcase2 execute1 = new Testcase2();
        execute1.testExe(driver, session_id);
        driver.quit();

    }
}
