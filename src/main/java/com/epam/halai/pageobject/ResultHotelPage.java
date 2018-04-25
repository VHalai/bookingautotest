package com.epam.halai.pageobject;

import org.apache.commons.lang3.math.NumberUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultHotelPage extends DefaultPage {

    @FindBy(css = "div[data-hotelid]")
    private List<WebElement> resultList;

    public Integer getAmountOfAvailableHotels(){
        if(resultList != null){
            LOGGER.info(" ===== SUCCESS RESULT =========, length = " + resultList.size() + ";");
        } else {
            LOGGER.info(" ===== BAD RESULT =========, length = 0;");
        }
        return (resultList != null)? resultList.size(): NumberUtils.INTEGER_ZERO;

    }

}
