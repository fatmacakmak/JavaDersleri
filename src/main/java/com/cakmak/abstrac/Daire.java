package com.cakmak.abstrac;

public class Daire extends Sekil{
    private int yaricap;
    //private double pi=3.14;
    public Daire(String isim,int yaricap/*double pi*/){
        super(isim);
        this.yaricap=yaricap;
        //this.pi=pi;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim()+" alanı= "+(Math.PI*yaricap*yaricap)+" dir");
    }
}
