package com.cakmak.vectorandstack;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();//tredler kullanılacagı zaman vactor kullanımı daha dogrudur ama arraylistlere gore yavaastır
        //ArrayList<String> list = new ArrayList<>();
        vector.add(90);
        vector.add(45);
        vector.add(56);
        vector.add(89);

        /*for(String s: vector){
            System.out.println(s);
        }*/

        /*ListIterator<String> iterator = vector.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator. next());
        }*/

       /* Enumeration<Integer> enumeration = vector.elements();

        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }*/

       // System.out.println("İlk Eleman : "+vector.firstElement());
        //System.out.println("Son Eleman : "+vector.lastElement());

        Stack<String> stack = new Stack<>();

        stack.push("asya");//====>stack.add("asya")
        stack.push("fatma");
        stack.push("kubra");
        stack.push("halime");

       /* for(String s: stack){
            System.out.println(s);
        }*/

       /* Enumeration<String> enumeration = stack.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }*/
        //System.out.println("ilk eleman gösteriliyor : "+stack.peek());//staclarde son giren eleman ilk cıkar o yuzden ılk eleamn
                                        // son atılan elemana esittir bu yuzden burada halime cıkacak
       /* System.out.println("son eleman verilerin arasından çıkarıliyor : "+stack.pop());


        for(String s: stack){
            System.out.println(s);
        }*/

        while (!stack.empty()){
            System.out.println("Eleman cıkarılıyor:"+stack.pop());
        }
        System.out.println("Stackta elaman bitti.....");

    }
}
