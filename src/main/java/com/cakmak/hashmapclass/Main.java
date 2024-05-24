package com.cakmak.hashmapclass;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> heshMap = new HashMap<>();//HashMap<key,veri tipi>
        heshMap.put(0,"asya");
        heshMap.put(1,"fatma");
        heshMap.put(2,"ecrin");
        heshMap.put(2,"halime");
        heshMap.put(4,"ecrin");//bu veriden iki tane oldugu icin ve keyleri aynı oldugu icin bi tane gösterilir..
        heshMap.put(5,"halime");//en son verilen bilginin keyi onemli


        //System.out.println(heshMap);
        //System.out.println(heshMap.get(10));//keylerde karşılıgı olmayan bi deger girildiginde null deger doner..

        for (Map.Entry<Integer,String> entry: heshMap.entrySet()){
            System.out.println("Anahtar:"+entry.getKey()+"-------> Değer:"+entry.getValue());
        }
    }
}
