package com.cakmak.fatmapaket3;

public class Matematik implements IMatematik{
    @Override
    public void toplama(int a, int b) {
        System.out.println("Toplam="+(a+b));
    }

    @Override
    public void cikarma(int a, int b) {
        System.out.println("Çıkarma işleminin sonucu="+(a-b));

    }

    @Override
    public void carpma(int a, int b) {
        System.out.println("çarpma içşleminin sonucu="+(a*b));

    }

    @Override
    public void bolme(int a, int b) {
        System.out.println("bülme işleminin sonucu="+((double)a/b));
    }
}
