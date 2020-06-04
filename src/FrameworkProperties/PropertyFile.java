package FrameworkProperties;

import mainCaller.Commons;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile implements Commons {

    public String getPropertyData(String property) throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        //File will be loaded from the computer drive
        prop.load(new FileInputStream(appProperties));
        String propData = prop.getProperty(property);

        return propData;
    }
}
