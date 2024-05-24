package com.cakmak.statikexample;

public class Seyirci {
    private  String isim;
    public static int seyirciSayisi;
    //private static int seyirciSayisi;//(get metoduyla yapılan 2.yol)
    public Seyirci(String isim){
        this.isim=isim;

        seyirciSayisi++;
    }

    public void setİsim(String isim){
        this.isim=isim;
    }
    public String getİsim(){
        return isim;
    }
    public void oyunSeyret(){
        System.out.println(getİsim()+" oyunu seyrediyor......");
    }

    public static int getSeyirciSayisi(){

        return seyirciSayisi;
    }


}

