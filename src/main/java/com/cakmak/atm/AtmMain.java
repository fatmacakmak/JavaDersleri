package com.cakmak.atm;

import java.util.Scanner;

public class AtmMain {
    public static void main(String[] args){
        Atm atm = new Atm();
        atm.bakiyem = 10000;

        Scanner scan = new Scanner(System.in);

        while(atm.bakiyem>0){
            atm.islemler();
            int input = scan.nextInt();
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
            }
        }
        System.out.println("tekrar beklerız");





    }
}

