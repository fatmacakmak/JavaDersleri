package com.cakmak.generik;

public class Main {
    public static void main(String[] args) {
        Character[] charactersDizi={'A','B','C','D','W','G','H'};
        Integer[] integersDizi={2,3,4,5};
        String[] stringDizi={"c++","c#","phyton","java"};
        Ogrenci[] ogrenciDizisi={new Ogrenci("asya"),new Ogrenci("Aysima"),new Ogrenci("ecrin"),new Ogrenci("Halime")};

                   //************GENERİC CLASSLA YAZILDIĞI ZAMAN*************\\
       /* YazdirmaSinifi<Character> characterYazdirmaSinifi= new YazdirmaSinifi<Character>();
        YazdirmaSinifi<Integer> integerYazdirmaSinifi= new YazdirmaSinifi<Integer>();
        YazdirmaSinifi<String> stringYazdirmaSinifi= new YazdirmaSinifi<String>();
        YazdirmaSinifi<Ogrenci> ogrenciYazdirmaSinifi= new YazdirmaSinifi<Ogrenci>();

        characterYazdirmaSinifi.yazdir(charactersDizi);
        System.out.println("*********************************************************");
        integerYazdirmaSinifi.yazdir(integersDizi);
        System.out.println("*********************************************************");
        stringYazdirmaSinifi.yazdir(stringDizi);
        System.out.println("*********************************************************");
        ogrenciYazdirmaSinifi.yazdir(ogrenciDizisi);
        System.out.println("*********************************************************");*/

             //*********GENERİC METOTLA YAZILDIGI ZAMAN**********\\
        yazdir(charactersDizi);
        System.out.println("***************************************************");
        yazdir(integersDizi);
        System.out.println("***************************************************");
        yazdir(stringDizi);
        System.out.println("***************************************************");
        yazdir(ogrenciDizisi);
        System.out.println("***************************************************");


    }

    public static <E> void yazdir(E[] dizi){//generic metot
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }
}
