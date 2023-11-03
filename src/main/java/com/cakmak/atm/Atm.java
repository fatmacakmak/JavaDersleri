package com.cakmak.atm;

import java.util.Scanner;

public class Atm {
           public Integer bakiyem;
    Scanner scan = new Scanner(System.in);
    public void paracekVeyaParaGonder(){
        System.out.println("para miktarı girin:");
        int para= scan.nextInt();
        if (para> bakiyem){
            System.out.println("Bakiye yetersiz!");
        } else {
            bakiyem = bakiyem-para;
            System.out.println("yeni bakiyeniz:"+bakiyem);
        }
    }
    
    public void bakiyeOgrenme(){
        System.out.println("Bakiyeniz: "+bakiyem);
        System.out.println("");
    }
    
    public void islemler(){
        System.out.println("1-para çek");
        System.out.println("2-bakiye öğren");
        System.out.println("3-para gönder");
        System.out.println("4-cıkıs yap");
        System.out.print("Yapmak istediğiniz işlemi seçiniz:");
    }
}
