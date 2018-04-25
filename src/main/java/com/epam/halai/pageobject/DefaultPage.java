package com.epam.halai.pageobject;

import com.epam.halai.browser.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DefaultPage {
    protected final Logger LOGGER = Logger.getLogger(this.getClass());

    protected WebDriver driver;

    public DefaultPage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(getDriver(), this);
        LOGGER.debug("Init driver - "+driver);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
