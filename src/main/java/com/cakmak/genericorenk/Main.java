package com.cakmak.genericorenk;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> a1 = new LinkedList<>();
        a1.add(5);
        a1.add(6);
        List<Integer> a2 = new LinkedList<>();
        a2.add(50);
        a2.add(60);
        //Yazdir<Integer>  yaz1 = new Yazdir<>();

        List a3 = MergeUtil.mergeList(a1,a2);

        a3.stream().forEach(item->System.out.println(item));

        List<String> str1 = new LinkedList<>();
        str1.add("ali");
        str1.add("osman");
        List<String> str2 = new LinkedList<>();
        str2.add("k1");
        str2.add("k2");
        //Yazdir<String>  yaz2 = new Yazdir<>();

        List str3 = MergeUtil.mergeList(str1,str2);

        str3.stream().forEach(item->System.out.println(item));

        /*for(Integer item : list){
            System.out.println("item : "+item);
        }*/
    }
}
