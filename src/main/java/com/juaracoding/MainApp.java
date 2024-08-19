package com.juaracoding;

import com.juaracoding.drivers.strategies.DriverStrategy;
import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.drivers.strategies.DriverStrategyImplementer;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MainApp {
    public static void main(String[] args) {
        WebDriver driver;

        System.out.println("Page Object Page Factory");
        DriverSingleton.getInstance("firefox");
        driver = DriverSingleton.getDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();

    }
}