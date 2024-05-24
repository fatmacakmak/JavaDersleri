package com.cakmak.abstrac;

public class Kare extends Sekil{
    private int kenar;

    public Kare(String isim,int kenar){
      super(isim);
      this.kenar=kenar;
    }
    void alanHesapla(){
        System.out.println(getIsim()+" alanı ="+(kenar*kenar)+" dir");

    }
}
