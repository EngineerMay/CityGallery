package com.example.mayankchauhan.citygallery.OnClickFamousView;

import com.example.mayankchauhan.citygallery.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mayankchauhan on 01/02/17.
 */

public class FamousPlacesData {

    private static int[] images = {R.drawable.delhi0,R.drawable.mumbai0,R.drawable.chennai0,R.drawable.banglore0,R.drawable.kolkata0,
            R.drawable.ahmedabad0,R.drawable.lucknow0,R.drawable.hyderabad4};
    private static String[] title = {"Delhi","Mumbai","Chennai","Banglore","Kolkata","Ahmedabad","Lucknow","Hyderabad"};
    private static String[] description = {"Hello Delhi","Hello Mumbai","Hello Chennai","Hello Banglore","Hello Kolkata","Hello Ahmedabad","Hello Lucknow","Hello Hyderabad"};

    public static List<FamousPlacesList> getData()
    {
        List<FamousPlacesList> listdata = new ArrayList<>();

        int i=0;
        for(i=0;i<images.length;i++)
        {
            FamousPlacesList list = new FamousPlacesList();
            list.setTitle(title[i]);
            list.setImg(images[i]);
            list.setDescription(description[i]);
            listdata.add(list);

        }

        return listdata;

    }
}
