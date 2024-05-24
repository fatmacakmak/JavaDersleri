package com.cakmak.interfaceexample;

public interface Deneme {

              //******İNTERFACELERDE PUBLİC VE DEFAULT MODİFİERLER KULLANILIR****\\
     public int sayi=2;   //interfacelerde private ozellik tanımlanmaz obje oluşturulmaz.
     public String kelime="Deneme"; //== public static String deneme="Deneme";
    public final String harfler="abc";
    double rasyonelSayi=2.3;
    //protected int say1=3; //protected modifier interfacede kullanılmaz...

    public static void car(){         //interfaclerde metot yazabilmek icin static anahtar kelimesi kullanılmak zorunda..
        System.out.println("Araba");
    }







}
