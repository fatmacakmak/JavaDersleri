package com.cakmak.hesap;

public class HesapMakinasi {
    public int topla(int s1, int s2){
       return s1+s2;
    }
    public int bol(int s1, int s2){
        if (s2==0)
            return 0;
        return s1/s2;
    }
    public int cikar(int s1, int s2){
        return s1-s2;
    }
    public int carp(int s1, int s2){
        return s1*s2;
    }
}
