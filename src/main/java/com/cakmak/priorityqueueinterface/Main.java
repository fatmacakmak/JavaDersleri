package com.cakmak.priorityqueueinterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {


    public static  void main(String[] args) {
       Queue<Player> queue = new PriorityQueue<>();
       Player a = new Player("asya",4,4.00);
       queue.offer(a);//neden hata veriyor....SOOOOOR



        while (!queue.isEmpty()){
            System.out.println("eleman cıkarılıyor : "+queue.poll());
        }



        /*queue.offer(2);
        queue.offer(8);
        queue.offer(7);
        queue.offer(7);

        System.out.println("kume icinde bulunan eleman sayısı : "+queue.size());

        System.out.println(queue.contains(4));

        System.out.println("Eleman Çıkarılıyor..."+queue.poll());
        for (Integer i : queue){
            System.out.println(i);
        }

        while (!queue.isEmpty()){
            System.out.println("Eleman Çıkarılıyor...."+queue.poll());
        }*/

    }
}
