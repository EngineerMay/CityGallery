package com.example.mayankchauhan.citygallery.OnClickImageView;

import com.example.mayankchauhan.citygallery.OnClickImageView.ImageList;
import com.example.mayankchauhan.citygallery.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mayankchauhan on 01/02/17.
 */

public class ImagesListData {

    private static int[] img = {R.drawable.delhi0,R.drawable.mumbai0,R.drawable.chennai0,R.drawable.banglore0,R.drawable.kolkata0,
            R.drawable.ahmedabad0,R.drawable.lucknow0,R.drawable.hyderabad4};

    public static List<ImageList> getImagee()
    {
        List<ImageList> lists = new ArrayList<>();

        int i=0;
        for(i=0;i<img.length;i++)
        {
            ImageList l = new ImageList();
            l.setImgages(img[i]);
            lists.add(l);
        }

        return lists;
    }
}
