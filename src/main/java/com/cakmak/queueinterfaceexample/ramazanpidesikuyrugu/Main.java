package com.cakmak.queueinterfaceexample.ramazanpidesikuyrugu;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("******Ramazan Pidesi Uygulamasina Hosgeldiniz*******");

        Queue<String> pideKuyrugu = new LinkedList<>();
        Random random = new Random();
        pideKuyrugu.offer("asya");
        pideKuyrugu.offer("fatma");
        pideKuyrugu.offer("halime");
        pideKuyrugu.offer("aysima");
        pideKuyrugu.offer("ecrin");
        pideKuyrugu.offer("yasmin");
        pideKuyrugu.offer("kubra");
        pideKuyrugu.offer("tuba");
        pideKuyrugu.offer("hatice");
        pideKuyrugu.offer("mükail");

        int pideSayisi=1+random.nextInt(10);
        System.out.println("pideler çıkıyor...");
        System.out.println("Çıkan Pide Sayısı : "+pideSayisi);
        Thread.sleep(3000);

        while (pideSayisi!=0){
            System.out.println(pideKuyrugu.poll()+" pideyi aldı.");
            pideSayisi--;
            Thread.sleep(1000);
        }
        System.out.println("Pide Kalmadı....");


    }
}
