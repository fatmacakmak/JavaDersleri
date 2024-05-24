package com.cakmak.stackpalindrom;

import java.util.Scanner;
import java.util.Stack;

public class Main {//kasaylabalyasak
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cümle giriniz");
        String cumle=scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < cumle.length()/2; i++) {
            stack.push(cumle.charAt(i));
        }

        if(palindroMu(cumle,stack)){
            System.out.println("bu cumle palindromdur");
        }
        else {
            System.out.println("bu cumle palindrom degildir.......");
        }

    }


    public static boolean palindroMu(String cumle,Stack<Character> stack){
        for (int i =( cumle.length()/2)+1; i <cumle.length() ; i++) {
            if(cumle.charAt(i)!=stack.pop()){
                return false;
            }
        }
        return true;
    }
}
