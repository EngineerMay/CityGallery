package com.example.mayankchauhan.citygallery.FirstRecycler;

/**
 * Created by mayankchauhan on 31/01/17.
 */

public class CityList {

    private String cityname;
    private int imgres;

    public CityList() {
    }

    public CityList(String cityname, int imgres) {
        this.cityname = cityname;
        this.imgres = imgres;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public int getImgres() {
        return imgres;
    }

    public void setImgres(int imgres) {
        this.imgres = imgres;
    }
}
