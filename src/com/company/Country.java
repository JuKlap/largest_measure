package com.company;

public class Country implements Measurable {

    private String countryName;
    private int area;

    public Country(String countryName, int area){
        this.countryName = countryName;
        this.area = area;
    }

    @Override
    public double getMeasure(){
        return area;
    }

}
