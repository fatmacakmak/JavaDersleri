package com.cakmak.arraysıralama;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

    public static int[] arrayDoldur(int sayi){
        Scanner scanner= new Scanner(System.in);
        int[] cikti= new int[sayi];
        for (int i = 0; i < sayi; i++) {
          cikti[i]=scanner.nextInt();
        }
        return cikti;
    }

    public static void arrayBastir(int[] array){
        for (int i = 0; i < array.length; i++) {

            System.out.println((i+1)+". Dizinin Elemanı:"+array[i]);

        }


    }

    public static void arraySort(int[] array){
        System.out.println("***********************************");
        Arrays.sort(array);
        arrayBastir(array);
    }
}
