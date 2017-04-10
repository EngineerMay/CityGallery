package com.example.mayankchauhan.citygallery.FirstRecycler;

import com.example.mayankchauhan.citygallery.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mayankchauhan on 31/01/17.
 */

public class CityData {
    private static String[] cityname = {"Delhi","Mumbai","Chennai","Banglore","Kolkata","Ahmedabad","Lucknow","Hyderabad","Plus"};
    private static  int[] imgres = {R.drawable.delhi0,R.drawable.mumbai0,R.drawable.chennai0,R.drawable.banglore0,R.drawable.kolkata0,
            R.drawable.ahmedabad0,R.drawable.lucknow0,R.drawable.hyderabad4,R.drawable.plus};

    public static List<CityList> getData()
    {
        List<CityList> data = new ArrayList<>();

        int i=0;
        for(i=0;i< cityname.length;i++)
        {
            CityList list = new CityList();
            list.setCityname(cityname[i]);
            list.setImgres(imgres[i]);
            data.add(list);
        }

        return data ;
    }
}
