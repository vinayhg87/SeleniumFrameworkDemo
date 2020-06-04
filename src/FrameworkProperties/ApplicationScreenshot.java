package FrameworkProperties;

import mainCaller.Commons;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

public class ApplicationScreenshot implements Commons {

    public ApplicationScreenshot(WebDriver driver, String Filename) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File(screenShotPath + Filename + ".jpg"));
    }
}
