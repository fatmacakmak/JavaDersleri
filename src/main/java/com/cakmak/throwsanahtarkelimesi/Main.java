package com.cakmak.throwsanahtarkelimesi;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void yasKontrol(int yas) throws IOException {
        if(yas<18){
            throw new IOException();// o bir checked hatası oldugu icin bunu throws kelimesiyle bildirmek gerek**
        }
        else {
            System.out.println("mekana hoşgeldiniz*****");
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen yaşınızı giriniz:");
        int yas  = scanner.nextInt();
        scanner.nextLine();

          yasKontrol(yas);

      /* try {
            yasKontrol(yas);
        }
        catch (IOException e){
            System.out.println("IOException hatası oluştu");
        }*/
    }
}