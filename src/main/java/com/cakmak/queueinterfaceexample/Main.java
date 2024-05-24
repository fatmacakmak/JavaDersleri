package com.cakmak.queueinterfaceexample;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("asya");
        queue.offer("fatma");
        queue.offer("sultan");
        queue.offer("halime");

       // System.out.println("kurugun birinci elemanı:"+queue.peek());


        for(String s:queue){
            System.out.println(s);
        }

        System.out.println("**********************************************************");
        System.out.println("kuyuktan birinci eleman atılıyor:"+queue.poll());

    }
}
