package com.epam.halai.listener;

import com.epam.halai.browser.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.util.concurrent.TimeUnit;

public class SetUpDataListener implements ITestListener {

    private static final Logger LOGGER = Logger.getLogger(SetUpDataListener.class);

    private WebDriver driver;

    public SetUpDataListener() {
        driver = Driver.getDriver();
    }

    @Override
    public void onFinish(ITestContext arg0) {
        LOGGER.info("********** Quit browser**********\n\n\n");
        driver.quit();
    }

    @Override
    public void onStart(ITestContext arg0) {
        LOGGER.info("********** Start browser**********\n\n\n");
        driver.manage().window().maximize();
        driver.get("https://www.booking.com");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

    }

    @Override
    public void onTestFailure(ITestResult res) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().refresh();
        LOGGER.error("========= TEST FAILURE.=============");
    }

    @Override
    public void onTestSkipped(ITestResult arg0) {

    }

    @Override
    public void onTestStart(ITestResult res) {
        LOGGER.info("========== Start test==========  " + res.getMethod().getMethodName() + "\n");
    }

    @Override
    public void onTestSuccess(ITestResult res) {
        LOGGER.info("========== End test==========  " + res.getMethod().getMethodName() + "\n");
        LOGGER.info("Test " + res.getMethod().getMethodName() + " is Success\n\n\n");

    }
}
