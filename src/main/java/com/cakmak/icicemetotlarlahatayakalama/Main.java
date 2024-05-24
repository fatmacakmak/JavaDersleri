package com.cakmak.icicemetotlarlahatayakalama;

public class Main {
    public static void ucuncuFonksiyon(){
        int a = 12/0;

        /*/try {
            int a = 12/0;
        }
        catch (ArithmeticException e){
            System.out.println("bir sayı sıfıra bölünemez..");     *****boylede hatayı yakalayabiliriz
        }*/
         }
    public static void ikinciFonksiyon(){
        try {
        ucuncuFonksiyon();
        }
         catch (ArithmeticException e){
            System.out.println("bir sayı sıfıra bölünemez..");
        }
    }
    public static void birinciFonksiyon(){
        ikinciFonksiyon();
    }
    public static void main(String[] args) {
        birinciFonksiyon();

    }
}
