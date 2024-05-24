package com.cakmak.car;

public class Man extends Kamyon implements Car{

    private String ad;

    @Override
    public void benimAdim() {

    }


    public String getAd() {
        return "A"+ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
