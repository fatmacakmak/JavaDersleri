package com.cakmak.hashmapler2;

import java.util.*;

public class Main {
    public static void mapYazdir(Map<Integer,String> map){
        map.put(2,"asya");
        map.put(50,"kar");
        map.put(1,"fatma");
        map.put(3,"halime");
        map.put(6,"kim");
        map.put(8,"ecrin");
        map.put(9,"asel");

        /*for (Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println("Anahtar:"+entry.getKey()+"-------> Değer:"+entry.getValue());
        }*/

        /*for(Integer key : map.keySet()){
            System.out.println("KEY:"+key+" value: "+map.get(key));
        }*/

        Collection<Integer> key = map.keySet();
        for(Integer k : key) {
            System.out.println("Key : " + k);
        }

        Collection<String> values = map.values();
        for(String v : values) {
            System.out.println("Değer : " + v);
        }


    }
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer,String> treeMap = new TreeMap<>();


        mapYazdir(hashMap);//karışık
        System.out.println("***********************************");
        mapYazdir(linkedHashMap);//oldugu gibi
        System.out.println("***********************************");
        mapYazdir(treeMap);// keylere gore kucukten buyuge
        System.out.println("***********************************");


    }
}
