package com.cakmak.oyun;

public class Kart {
    private char deger;
    private boolean tahmin=false;

    public Kart(char deger){
        this.deger=deger;
    }

    public  void setDeger(char deger){
       this.deger=deger;
    }

    public char getDeger(){
      return deger;
    }

    public  void setTahmin(char deger){
        this.tahmin=tahmin;
    }

    public boolean getTahmin(){
        return tahmin;
    }



}
