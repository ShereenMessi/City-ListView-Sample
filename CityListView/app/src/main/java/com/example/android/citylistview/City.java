package com.example.android.citylistview;

/**
 * Created by Shereen on 10/10/2017.
 */

public class City {
    private String Name;
    private int Population;
    private int image;
    private String Longitude;
    private String Latitude;

    public City(String name, int population, int image) {
        setName(name);
        setPopulation(population);
        this.setImage(image);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }
}
