package com.cakmak.hesap;

import java.util.Scanner;

public class HesapMain {
    public static void main2(String[] args) {
        HesapMakinasi hesapMakinasi = new HesapMakinasi();
        int sonuc=-1;
        int secim=-1;
        do {
            Scanner scan = new Scanner(System.in);


            System.out.print("1. Sayıyı giriniz: ");
            int sayi1 = scan.nextInt();
            System.out.print("2. Sayıyı giriniz: ");
            int sayi2 = scan.nextInt();

            System.out.println("****İSLEMİNİZİ SEÇİNİZ***");
            System.out.println("0. ÇIKIŞ");
            System.out.println("1. TOPLAMA");
            System.out.println("2. ÇIKARMA");
            System.out.println("3. ÇARPMA");
            System.out.println("4. BÖLME");

            System.out.print("Secimininizi giriniz: ");
            secim = scan.nextInt();
            if (secim!=0){
                if(secim == 1) {
                    sonuc = hesapMakinasi.topla(1,2);
                }
                else if(secim == 2) {
                    sonuc = hesapMakinasi.cikar(1,2);
                }
                else if(secim == 3) {
                    sonuc = hesapMakinasi.carp(1,2);
                }
                else if(secim == 4) {
                    sonuc = hesapMakinasi.bol(1,2);
                }
                else {
                    System.out.println("Yanlıs secim yaptınız. Seciminizi kontrol ediniz.");
                }
            }
            System.out.println("Sonuç= "+sonuc);
        }
        while (secim!=0);
    }
}