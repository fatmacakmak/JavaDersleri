package com.cakmak.tryandcatch;

public class Main {
    public static void main(String[] args) {
        try{
            int a = 12/0;//AritmeticException
            int[] b = {1,2,3,4,5};
            System.out.println(b[6]);//bunu yotuma aldıgın zaman catch bloguna girmez**
        }
        catch (ArithmeticException x){
            System.out.println("Herhangi Bir Sayı 0'a bolunemez");
        }

        catch (ArrayIndexOutOfBoundsException y){
            System.out.println("Arrayin boyunu aştınız..");//try blogundan sonra program birinci yazılan hataya gore uygun olan
            // catch blogunu kullanır ve ondan sonra baska catche ihtiyac duymaz

        }

       catch (Exception e){ //ArithmeticException or Exception yazabilirsin ama ArrayIndexsOutofBoundsException yazamazsın***
           System.out.println("bir hata oluştu...");
           e.printStackTrace();//Bunu yazdıgın zaman asagıya inerek hatanın adını soyler
           //catch blokları ozelden genele dogru yazılır yani ilk oncen hangi hata varsa o hatanın adının olduygu catch blogundaan
           //sonra genel olan yazılır**
       }
        System.out.println("burası calışiyor...");
    }
}
