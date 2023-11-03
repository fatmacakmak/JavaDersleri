package com.cakmak.atm;

import java.util.Scanner;

public class AtmMain {
    public static void main(String[] args){
        Atm atm = new Atm();
        atm.bakiyem = 10000;

        Scanner scan = new Scanner(System.in);
        int input = -1;
        while(input!=4){
            atm.islemler();
            input = scan.nextInt();
            switch (input) {
                case 1:
                    atm.paracekVeyaParaGonder();
                    break;
                case 2:
                    atm.bakiyeOgrenme();
                    break;
                case 3:
                    atm.paracekVeyaParaGonder();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("geçersiz bir işlem girdiniz.");
            }
        }
        System.out.println("tekrar beklerız");





    }
}

