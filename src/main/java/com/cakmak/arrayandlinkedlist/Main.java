package com.cakmak.arrayandlinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        zamanHesapla("linkedList",linkedList);
        zamanHesapla("arraylist",arrayList);

    }

    public static void zamanHesapla(String veriTipi, List<Integer> list){
                 //*****LİSTENİN SONUNA DEĞER EKLEME*****\\
        long startTime;
        long stopTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(0,i);
        }
        stopTime = System.currentTimeMillis();

        System.out.println(veriTipi+" Ekleme Süresi "+(stopTime-startTime)+" ms");
    }
}
