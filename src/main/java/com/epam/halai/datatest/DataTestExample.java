package com.epam.halai.datatest;

import com.epam.halai.datasearch.SearchHotelData;
import java.util.ArrayList;
import java.util.List;


public class DataTestExample {

    public static List<SearchHotelData> getCheckCertainCountOfAvailableHotelsData() {

        List<SearchHotelData> data = new ArrayList<>();

        SearchHotelData data1 = new SearchHotelData();
        data1.setCityDir("Варшава");
        data1.setCheckOut("1526774400000");
        data1.setAdultsNumber(5);
        data1.setChildrenNumber(3);
        data1.setRoomsNumber(2);
        data1.setMinResultList(5);
        data.add(data1);

        SearchHotelData data2 = new SearchHotelData();
        data2.setCityDir("Берлин");
        data2.setMinResultList(5);
        data.add(data2);

        SearchHotelData data3 = new SearchHotelData();
        data3.setCityDir("Вена");
        data3.setCheckOut("1526774400000");
        data3.setMinResultList(5);
        data.add(data3);

        SearchHotelData data4 = new SearchHotelData();
        data4.setCityDir("Салоники");
        data4.setCheckOut("1526774400000");
        data4.setMinResultList(5);
        data.add(data4);

        SearchHotelData data5 = new SearchHotelData();
        data5.setCityDir("Неа-Фокия");
        data5.setCheckOut("1526774400000");
        data5.setAdultsNumber(1);
        data5.setMinResultList(5);
        data.add(data5);

        SearchHotelData data6 = new SearchHotelData();
        data6.setCityDir("Багамские острова");
        data6.setCheckOut("1526774400000");
        data6.setAdultsNumber(6);
        data6.setChildrenNumber(3);
        data6.setMinResultList(5);
        data.add(data6);

        SearchHotelData data7 = new SearchHotelData();
        data7.setCityDir("Минск");
        data7.setAdultsNumber(10);
        data7.setRoomsNumber(5);
        data7.setMinResultList(5);
        data.add(data7);

        return data;
    }
}
