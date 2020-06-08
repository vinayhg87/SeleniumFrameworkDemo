package mainCaller;

import java.io.File;

public interface Commons {

    String currentdir = System.getProperty("user.dir");
    String ExcelPath = currentdir + File.separator + "ExcelData" + File.separator + "ExcelInput.xlsx";
    String screenShotPath = currentdir + File.separator + "Screenshots" + File.separator;
    String appProperties = currentdir + File.separator + "application.properties";
    String geckoDriver_MAC = currentdir + File.separator + "libs" + File.separator + "geckodriver";
    String chromedriver_MAC = currentdir + File.separator + "libs" + File.separator + "chromedriver";
    String geckoDriver_WIN = currentdir + File.separator + "libs" + File.separator + "geckodriver.exe";
    String chromedriver_WIN = currentdir + File.separator + "libs" + File.separator + "chromedriver.exe";

}
