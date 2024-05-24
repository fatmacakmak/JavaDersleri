package com.cakmak.throwhatafırlatma;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void yasKontrol(int yas)  {
        if(yas<18){
           throw new ArithmeticException();
        }
        else {
            System.out.println("mekana hoşgeldiniz*****");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen yaşınızı giriniz:");
        int yas  = scanner.nextInt();
        scanner.nextLine();


            yasKontrol(yas);

    }
}
