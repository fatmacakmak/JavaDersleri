package com.cakmak.setinterfaceler;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
         Set<String> set1 = new HashSet<>();
         Set<String> set2 = new LinkedHashSet<>();
         Set<String> set3 = new TreeSet<>();


        /*Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();*/



       //*****HESHSETLER VERİLEN VERİLERİ KARIŞIK SIRALAR*****\\
         set1.add("fatma");
         set1.add("asya");
         set1.add("halime");
         set1.add("aysima");
         set1.add("ecrin");
         set1.add("fatma");//heshset ayni verilerden sadece bir tanesini kaydeder
        //*****LİNKEDHESHSETLER VERİLEN VERİLERİ OLDUĞU GİBİ GÖSTERİR********\\
       /* set2.add("fatma");
        set2.add("java");
        set2.add("sultan");
        set2.add("zeytun");
        set2.add("ecrin");*/



        /*Set<String> fark = new HashSet<>(set2);
        System.out.println(fark.removeAll(set1));//set2deki elemanların set1den farkli olan elemanları varsa true yoksa false donecek***
        System.out.println(fark);

        Set<String> kesisim = new HashSet<>(set2);
        System.out.println(kesisim.retainAll(set1));//set1 deki ve set2 deki ortak elemanları varsa true  yoksa false donecek***
        System.out.println(kesisim);*/
        //*******TREESETLER VERİLEN VERİLERİ ALFABETİK SIRAYA GÖRE DİZER*****\\
        /*set3.add("fatma");
        set3.add("asya");
        set3.add("halime");
        set3.add("aysima");
        set3.add("ecrin");*/


                   //*************************\\***ONCEDEN OLAN VERİLERİ TEKRAR KAYDETMEZ UC SETİNDE ORTAK OZELLİGİDİR***
                      /*set1.add("fatma");
                      set2.add("fatma");
                      set3.add("fatma");*/
               //************************************\\

        System.out.println("*******HeshSet******");
        for (String heshSet: set1) {
            System.out.println(heshSet);
        }

        /*System.out.println("*******LinkedHeshSet*******");
        for (String linkedHeshList: set2) {
            System.out.println(linkedHeshList);
        }


        System.out.println("******TreeSet*******");
        for (String treeSet: set3) {
            System.out.println(treeSet);
        }*/

       /* System.out.println(set1.contains("Ecrin"));//kayıtlı verilerin icinde gonderilen veri varsa true yoksa false gonderilecektir**
        System.out.println(set1.contains("ecrin"));

        System.out.println(set1.isEmpty());//**seti in ici boşsa true  doluysa false gonderilir*/
    }
}
