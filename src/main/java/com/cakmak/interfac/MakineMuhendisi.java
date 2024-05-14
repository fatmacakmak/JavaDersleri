package com.cakmak.interfac;

public class MakineMuhendisi implements Muhendis ,Calisma{
    private boolean adliSicil;
    private boolean askerlik;

   @Override
    public void calis(){
       System.out.println("Makine Mühendisi Çalışiyor....");
    }

    public MakineMuhendisi(boolean adliSicil,boolean askerlik){
        this.adliSicil=adliSicil;
        this.askerlik=askerlik;
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
    public void adliSicilKaydi() {
        if(adliSicil){
            System.out.println( "Adli Sicil Kaydım Bulunuyor.....");
        }
        else {
            System.out.println("Adli Sicil Kaydım Bulunmuyor");
        }

    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "ORTALAMA="+derece;
    }

    @Override
    public void isTecrubesi(String[] array) {

        if(array.length==0){
            System.out.println("Herhangi Bir İş Tecrübem Yok....");
        }
        else {
            System.out.println("Şu Şirketlerde Makine Mühendisi Olarak Çalıştım....");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }





    }

    public  void referansGetir(String[] array){
        if(array.length==0){
            System.out.println("Herhangi Bir Refrans YOK....");
        }
        else{
            System.out.println("Referansalarım....");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);

            }
        }
    }
}
