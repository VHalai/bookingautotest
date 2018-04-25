package com.epam.halai.pageobject;

import com.epam.halai.datasearch.SearchHotelData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HotelSearchPage extends DefaultPage {

    @FindBy(id = "ss")
    private WebElement cityDir;

    @FindBy(css = "div[data-mode=checkin]")
    private WebElement calendarFrom;

    @FindBy(css = "div[data-mode=checkout]")
    private WebElement calendarTo;

    @FindBy(css = "button[data-sb-id=main]")
    private WebElement showMePricesButton;

    @FindBy(id = "group_adults")
    private WebElement adultsButton;

    @FindBy(id = "group_children")
    private WebElement childrenButton;

    @FindBy(id = "no_rooms")
    private WebElement roomsButton;

    public HotelSearchPage findDataPlace(SearchHotelData data) throws InterruptedException {

        cityDir.clear();
        cityDir.sendKeys(data.getCityDir());

        calendarFrom.click();
        getDriver().findElement(By.xpath("//td[@data-id ='" + data.getCheckIn() + "']")).click();
        Thread.sleep(2000);

        calendarFrom.click();
        getDriver().findElement(By.xpath("//td[@data-id ='" + data.getCheckOut() + "']")).click();
        Thread.sleep(2000);

        adultsButton.click();
        getDriver().findElement(By.xpath("//select[@id='group_adults']/option[@value='" + data.getAdultsNumber() + "']")).click();
        Thread.sleep(1000);

        childrenButton.click();
        getDriver().findElement(By.xpath("//select[@id='group_children']/option[@value='" + data.getChildrenNumber() + "']")).click();
        Thread.sleep(1000);


        roomsButton.click();
        getDriver().findElement(By.xpath("//select[@id='no_rooms']/option[@value='" + data.getRoomsNumber() + "']")).click();
        Thread.sleep(1000);

        showMePricesButton.click();
        return this;
    }
}
