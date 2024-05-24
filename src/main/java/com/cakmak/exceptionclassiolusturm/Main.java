package com.cakmak.exceptionclassiolusturm;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void mekanKontrol(int yas) throws InvalidAgeException {
        if(yas<18){
         throw new InvalidAgeException("invalid age ");
        }
        else{
            System.out.println("mekana hosgeldiniz.");
        }
    }
    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("lutfen yaşınızı giriniz:");
        int yas = scanner.nextInt();

        mekanKontrol(yas);

           /* try {
                mekanKontrol(yas);
            }
            catch (InvalidAgeException e){
                System.out.println(e);
            }*/


    }
}
