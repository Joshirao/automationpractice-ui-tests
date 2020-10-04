package com.wh.utils;

import java.util.HashMap;
import java.util.Map;

import net.thucydides.core.webdriver.DriverSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CustomDriver implements DriverSource {
    private static Logger logger = LogManager.getLogger(CustomDriver.class);

    private static final String DEFAULT_DEVICE = "iPhone X";
    private static final String DEVICE_NAME_PROPERTY = "deviceName";

    public WebDriver newDriver(){
        Map<String, String> mobileEmulation = new HashMap<>();

        String deviceName = System.getProperty(DEVICE_NAME_PROPERTY, DEFAULT_DEVICE);
        mobileEmulation.put(DEVICE_NAME_PROPERTY, deviceName);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        logger.info("Test Started in "+deviceName+" Emulator");
        WebDriver driver = new ChromeDriver(chromeOptions);
        return  driver;
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
