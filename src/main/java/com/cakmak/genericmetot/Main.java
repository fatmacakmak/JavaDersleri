package com.cakmak.genericmetot;

public class Main {
    public static void main(String[] args) {
        Sayisal sayisal1 = new Sayisal(40,30,30,40,20);
        Sayisal sayisal2 = new Sayisal(30,30,20,20,40);
        Sayisal birinci = birinci(sayisal1,sayisal2);

        EsitAgirlik esitAgirlik1 = new EsitAgirlik(20,30,30,40,50);
        EsitAgirlik esitAgirlik2 = new EsitAgirlik(30,40,20,40,50);
        EsitAgirlik birinci2 = birinci(esitAgirlik1,esitAgirlik2);

        System.out.println("*********SAYISAL BÖLÜM PUANLARI*************");

        System.out.println("sayısal birincinin puanı:"+birinci.puanHesapla());
        System.out.println("sayısal1 in puani:"+sayisal1.puanHesapla());
        System.out.println("sayisal2nin puanı:"+sayisal2.puanHesapla());

        System.out.println("////////////////////////////////////////////////////////");

        System.out.println("*******EŞİT AĞIRLIK BÖLÜMÜ PUANLARI********");

        System.out.println("Eşit Ağırlık Bolumu birincinin puanı:"+birinci2.puanHesapla());
        System.out.println("esitAgirlik1 in puani:"+esitAgirlik1.puanHesapla());
        System.out.println("esitAgirlik2 nin puani:"+esitAgirlik2.puanHesapla());

    }


    public static <E extends Aday> E birinci(E ogrenci1,E ogrenci2){
        if(ogrenci1.puanHesapla()>ogrenci2.puanHesapla()){
            return ogrenci1;
        }
        else{
            return ogrenci2;
        }
    }


}
