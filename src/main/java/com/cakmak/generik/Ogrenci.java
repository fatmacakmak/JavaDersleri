package com.cakmak.generik;

public class Ogrenci {
    private String isim;
    public Ogrenci(String isim){
        this.isim=isim;
    }
    public void setIsim(String isim){
        this.isim=isim;
    }
    public String getIsim(){
        return isim;
    }

    public String toString(){
        return "isim:"+isim;
    }
}
