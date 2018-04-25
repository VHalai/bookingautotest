package com.epam.halai;

import com.epam.halai.datatest.DataTestExample;
import com.epam.halai.datasearch.SearchHotelData;
import com.epam.halai.listener.SetUpDataListener;
import com.epam.halai.pageobject.HotelSearchPage;
import com.epam.halai.pageobject.ResultHotelPage;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.List;
import static org.testng.Assert.assertTrue;


@Listeners(value = SetUpDataListener.class)
public class BookingTest {

    private final Logger log = Logger.getLogger(this.getClass());

    @Test(dataProvider = "dataOfAvailableHotels")
    public void checkAvailableHotels(SearchHotelData data) throws InterruptedException {
        log.info("Check for data: " + data);
        HotelSearchPage page = new HotelSearchPage();
        page.findDataPlace(data);
        Thread.sleep(10000);
        ResultHotelPage resultPage = new ResultHotelPage();
        Integer resultLength = resultPage.getAmountOfAvailableHotels();
        assertTrue(resultLength >= data.getMinResultList());
    }



    @DataProvider
    private Object[][] dataOfAvailableHotels() {
        List<SearchHotelData> dataList = DataTestExample.getCheckCertainCountOfAvailableHotelsData();
        Object[][] objArray = new Object[dataList.size()][];

        for (int i = 0; i < dataList.size(); i++) {
            objArray[i] = new Object[1];
            objArray[i][0] = dataList.get(i);
        }
        return objArray;
    }
}
