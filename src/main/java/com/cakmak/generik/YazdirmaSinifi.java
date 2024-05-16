package com.cakmak.generik;

public class YazdirmaSinifi<E>{//generic sinifi
    public  void yazdir(E[] dizi){
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }
}
