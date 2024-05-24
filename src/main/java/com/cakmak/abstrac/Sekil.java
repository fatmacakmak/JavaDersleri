package com.cakmak.abstrac;

public abstract class Sekil {
    private String isim;
    public Sekil(String isim){
        this.isim=isim;
    }
    public void isminiSoyle(){
        System.out.println("bu obje "+isim+" objesinindir.");
    }
    abstract void alanHesapla();//abstract metodların govdesi{} olmaz

    public void setIsim(String isim){
        this.isim=isim;
    }
    public String getIsim(){
        return isim;
    }
}
