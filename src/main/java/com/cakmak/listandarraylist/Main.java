package com.cakmak.listandarraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("fatma");
        arrayList1.add("asya");
        arrayList1.add("aysima");

        arrayList1.remove("fatma");
        yazdir(arrayList1);*/


        List<String> list = new ArrayList<>();

        list.add("sinan");
        list.add("muhammed");

        list.remove(1);    //****istenilen indexsteki elemanı sılme****\\

       // System.out.println(list.get(0));
        System.out.println("***********************************************");

        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/

        System.out.println("**********************************************************");

        for(String s: list){
            System.out.println(s);
        }



    }


}
