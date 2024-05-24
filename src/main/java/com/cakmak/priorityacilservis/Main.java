package com.cakmak.priorityacilservis;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Hasta> acilServis = new PriorityQueue<>();

        acilServis.add(new Hasta("Asya","Apandist"));
        acilServis.add(new Hasta("fatma","Yanık"));
        acilServis.add(new Hasta("halime","Baş Ağrısı"));
        acilServis.add(new Hasta("ecrin","Apandist"));
        acilServis.add(new Hasta("hafize","Yanık"));

        int i=1;

        while (acilServis.isEmpty() != true){
            System.out.println("******************************************************");
            System.out.println(i+". sırada");
            System.out.println(acilServis.poll());
            System.out.println("******************************************************");
            i++;
        }


    }
}
