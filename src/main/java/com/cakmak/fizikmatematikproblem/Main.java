package com.cakmak.fizikmatematikproblem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("matematik ve fizik problemleri programına hosgeldiniz...");


        String islemler = "*****işlemler****\n"
                          +"1.darienin alanı\n"
                          +"2.üçgenin alanı\n"
                          +"3. 2 vektorun ic carpımı\n"
                          +"cıkış yapmak icin q ya bas";

        while (true){
            System.out.println(islemler);

            System.out.print("işlem seciniz:");
            String islem= scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Çıkış Yapılıyor....");
                break;
            } else if (islem.equals("1")) {
                System.out.print("Yarıçap Giriniz:");
                int yaricap= scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.daireAlan(yaricap);
            } else if (islem.equals("2")) {
               // System.out.println("kenar1,kenar2,kenar3u giriniz:");
                System.out.print("Kenar1=");
                int kenar1= scanner.nextInt();

                System.out.print("Kenar2=");
                int kenar2= scanner.nextInt();

                System.out.print("Kenar3=");
                int kenar3= scanner.nextInt();
                scanner.nextLine();

                Problem.Matematik.ucgenAlan(kenar1,kenar2,kenar3);
            }

            else if (islem.equals("3")) {
                Vectorel vectorel1 = new Vectorel("vektörel1");
                Vectorel vectorel2 = new Vectorel("vectörel2");

                Problem.Fizik.icCarpim(vectorel1,vectorel2);
            }

            else{
                System.out.println("Geçersiz işlem.....");
            }
        }

    }
}
