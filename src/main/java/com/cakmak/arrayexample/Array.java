package com.cakmak.arrayexample;

public class Array {
    public static void arrayBastır(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+1+". dizinin elemanı:"+array[i]);


        }
    }


    public static double ortalamaBul(int[] array){
        int toplam=0;
        for (int i = 0; i < array.length; i++) {
         toplam+=array[i];


        }
        return ((double)toplam/ array.length);
    }
}
