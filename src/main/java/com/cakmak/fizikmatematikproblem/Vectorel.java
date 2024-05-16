package com.cakmak.fizikmatematikproblem;

import java.util.Scanner;

public class Vectorel {

    private String isim;
    private int i;
    private int j;
    private int k;

    public Vectorel(String isim){
        this.isim=isim;

        Scanner scanner=new Scanner(System.in);

        System.out.println(isim+"in i,j ve k degerlerini giriniz:");
        System.out.print("i=");
        this.i=scanner.nextInt();

        System.out.print("j=");
        this.j=scanner.nextInt();

        System.out.print("k=");
        this.k=scanner.nextInt();


    }

    public void setIsim(String isim){
        this.isim=isim;
    }

    public String getIsim(){
        return isim;
    }

    public void setI(int i){
        this.i=i;
    }

    public int getI(){
        return i;
    }

    public void setJ(int j){
        this.j=j;
    }

    public int getJ(){
        return j;
    }

    public void setK(int k){
        this.k=k;
    }

    public int getK(){
        return k;
    }
}
