package com.example.firstapp.model;

public class City {
    private String city;
    private int countryId;

    public City(String name, int country) {
        this.city = name;
        this.countryId = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }
}
