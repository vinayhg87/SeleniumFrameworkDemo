package FrameworkProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

    public String getPropertyData(String property) throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        //File will be loaded from the computer drive
        prop.load(new FileInputStream("/Users/vinaygopinath/Documents/workspace/SeleniumMVNProject/application.properties"));
        String propData = prop.getProperty(property);

        return propData;
    }
}
