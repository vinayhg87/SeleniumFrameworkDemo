package mainCaller;

import java.io.File;

public interface Commons {

    String currentdir = System.getProperty("user.dir");
    String ExcelPath = currentdir + File.separator + "ExcelData" + File.separator + "ExcelInput.xlsx";
    String screenShotPath = currentdir + File.separator + "Screenshots" + File.separator;
    String appProperties = currentdir + File.separator + "application.properties";
    String geckoDriver = currentdir + File.separator + "libs" + File.separator + "geckodriver";
    String chromedriver = currentdir + File.separator + "libs" + File.separator + "chromedriver";

}
