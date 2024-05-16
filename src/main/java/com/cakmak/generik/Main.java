package com.cakmak.generik;

public class Main {
    public static void main(String[] args) {
        Character[] charactersDizi={'A','B','C','D','W','G','H'};
        Integer[] integersDizi={2,3,4,5};
        String[] stringDizi={"c++","c#","phyton","java"};
        Ogrenci[] ogrenciDizisi={new Ogrenci("asya"),new Ogrenci("Aysima"),new Ogrenci("ecrin"),new Ogrenci("Halime")};


        YazdirmaSinifi<Character> characterYazdirmaSinifi= new YazdirmaSinifi<Character>();
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
        System.out.println("*********************************************************");


    }
}
