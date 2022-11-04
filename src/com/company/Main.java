package com.company;

public class Main {

    public static void main(String[] args) {
	    Measurable[] countryList = new Measurable[3];
        countryList[0] = new Country("Denmark", 42951);
        countryList[1] = new Country("Sweden", 528447);
        countryList[2] = new Country("Norway", 385207);

        Measurable maxArea = maximum(countryList);

        System.out.println("Country with the largest area from the countryList is: " + maxArea);
    }

    public static Measurable maximum(Measurable[] object) {
        if(object.length == 0){
            return new Country("", 0);
        }
        Measurable max = new Country("", 0);
        for(Measurable obj : object){
            if(obj.getMeasure() > max.getMeasure()){
                max = obj;
            }
        }
        return max;
    }

}
