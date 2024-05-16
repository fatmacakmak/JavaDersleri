package com.cakmak.anoniminnerclass;

public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci() {
            @Override
            public void dersCalis() {
                System.out.println("ders calısıyorum.....");
            }

            @Override
            public void derseGir() {
                System.out.println("derse giriyorum.....");
            }
        };

        ogrenci1.dersCalis();
        ogrenci1.derseGir();

        System.out.println("***********************************************************************");


        Ogrenci1 ogrenci2 = new Ogrenci1("fatma",1) {




            @Override
            void kayıtYap() {
                System.out.println("kayıt yapılıyor......."+"\nisim:"+getIsim()+  "\nnumara:"+getNumara());
            }
        };
          ogrenci2.kayıtYap();
          ogrenci2.selamla();
        System.out.println();



    }


    public static abstract class Ogrenci1{

        private String isim;
        private int numara;

        public Ogrenci1(String isim,int numara){
            this.isim=isim;
            this.numara=numara;
        }

        public void setIsim(String isim){
          this.isim=isim;
        }
        public String getIsim(){
            return isim;
        }

        public void setNumara(int numara){
            this.numara=numara;
        }
        public int getNumara(){
            return numara;
        }

        abstract void kayıtYap();

        public void selamla(){
            System.out.println("Selamlar.....");
        }
    }

    public interface Ogrenci {//interface classlar class olarak kabul edilir kessinlikle classtır diyemeyiz o yuzden static yapılmaz
        void dersCalis();
        void derseGir();
    }

}
