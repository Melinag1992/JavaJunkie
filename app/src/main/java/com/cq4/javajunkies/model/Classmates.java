package com.cq4.javajunkies.model;

import android.support.annotation.DrawableRes;

/**
 * Created by melina.gonzalez on 11/11/17.
 */

public class Classmates {

    String name;
    String horoscope;
    String color;
    String dateofBirth;
    @DrawableRes
    int imageResource;

public Classmates(@DrawableRes int imageResource, String name, String dateofBirth, String horoscope, String color){
    this.name = name;
    this.dateofBirth = dateofBirth;
    this.horoscope =horoscope;
    this.color = color;
    this.imageResource = imageResource;

}

    @DrawableRes
    public int getImageResource() {
        return imageResource;
    }

    public String getName() {
        return name;
    }

    public String getHoroscope() {
        return horoscope;
    }

    public String getColor() {
        return color;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

}
