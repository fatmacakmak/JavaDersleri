package com.cakmak.genericmetot;

public abstract class Aday {
    private int turkce;
    private int matematik;
    private int fizik;
    private int kimya;
    private int edebiyat;

     public Aday(int turkce,int matematik,int fizik,int kimya,int edebiyat) {
         this.turkce=turkce;
         this.matematik=matematik;
         this.fizik=fizik;
         this.kimya=kimya;
         this.edebiyat=edebiyat;
     }

     public  void setTurkce(int turkce){
         this.turkce=turkce;
     }
     public  int getTurkce(){
         return turkce;
     }




    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }


    public  void setMatematik(int matematik){
        this.matematik=matematik;
    }

    public  int getMatematik(){
        return matematik;
    }

    public  void setFizik(int fizik){
        this.fizik=fizik;
    }
    public  int getFizik(){
        return fizik;
    }


    public  void setKimya(int kimya){
        this.kimya=kimya;
    }
    public  int getKimya(){
        return kimya;
    }



    abstract int puanHesapla();



}
