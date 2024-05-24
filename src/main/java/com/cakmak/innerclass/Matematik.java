package com.cakmak.innerclass;

import java.util.Scanner;

public class Matematik {
    private double PI=Math.PI;

    public class Faktoriel{
        public void faktoriel(){
            Scanner scanner = new Scanner(System.in);

            System.out.print("bir sayı giriniz:");
            int sayi = scanner.nextInt();
            int fakt=1;
            for (int i = 2; i <= sayi; i++) {
               fakt *=i;
            }
            System.out.println("Fatöriyel("+sayi+") sonucu="+fakt);
        }
    }

    public class Asal{
        public boolean asalMi(int sayi){
          int i = 2;

          while(i<sayi){
              if(sayi%i==0){
                  return false;
              }i++;
          }
                return true;

        }
    }

    public class Alan{

        public class Daire{
            public void daireninAlani(int yariçap){
                System.out.println("dairenin alanı="+(yariçap*yariçap*PI));
            }
        }

    }
}
