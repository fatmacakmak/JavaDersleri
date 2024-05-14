package com.cakmak.interfac;

public class PcMuhendisi implements Muhendis{
    private boolean askerlik;

    private boolean adliSicil;

    public PcMuhendisi(boolean askerlik,boolean adliSicil){
        this.askerlik=askerlik;
        this.adliSicil=adliSicil;
    }

    @Override
    public void askerlikDurumuSorgula() {
           if(askerlik){
               System.out.println("Askerliğimi Yaptım");
           }
           else {
               System.out.println("Askerliğimi Henüz Yapmadım.....");
           }
    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "ORTALAMAM=" +derece;
    }

    @Override
    public void adliSicilKaydi() {
           if(adliSicil){
               System.out.println( "Adli Sicil Kaydım Bulunuyor.....");
           }
           else {
               System.out.println("Adli Sicil Kaydım Bulunmuyor");
           }

    }
    @Override
    public void isTecrubesi(String[] array) {
        System.out.println("Bilgisayar Mühendisi Olarak Şu Şirketlerde Çalıştım");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
