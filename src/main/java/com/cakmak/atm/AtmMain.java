package com.cakmak.atm;

import java.util.Scanner;

public class AtmMain {
    public static void main(String[] args){
        Atm atm = new Atm();
        atm.bakiyem = 10000;

        Scanner scan = new Scanner(System.in);
        System.out.println("guncel bakiyeniz :"+ atm.bakiyem + " Tl");

        while(atm.bakiyem>0){
        System.out.println("1-para çek");
        System.out.println("2-bakiye öğren");
        System.out.println("3-para gönder");
        System.out.println("4-cıkıs yap");
        System.out.print("yapmak ıstediginiz işlemi seciniz:");
        int input = scan.nextInt();
        if (input==4){
            break;
        } else if (input==3){
            System.out.println("para miktarı girin:");
            int para= scan.nextInt();
            if (para> atm.bakiyem){
                System.out.println("Bakiye yetersiz!");
            } else {
                atm.bakiyem = atm.bakiyem-para;
                System.out.println("yeni bakiyeniz:"+atm.bakiyem);
            }
        } else if (input == 2) {
            System.out.println("Bakiyeniz: "+atm.bakiyem);
            System.out.println("");
        } else if (input == 1){
                System.out.println("para miktarı girin:");
                int para= scan.nextInt();
                if (para> atm.bakiyem){
                    System.out.println("Bakiye yetersiz!");
                } else {
                    atm.bakiyem = atm.bakiyem - para;
                    System.out.println("yeni bakiyeniz:"+atm.bakiyem);
                }
        } else if (input == 4) {
            System.out.println("cıkış yapıldı");
            break;
        }
        }
        System.out.println("tekrar beklerız");




    }
}
