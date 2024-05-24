package com.cakmak.telefoncomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Telefon> telefonlar = new ArrayList<Telefon>(){
            {
             add(new Telefon("11","Redmi",8,128));
             add(new Telefon("12","Redmi not",9,48));
             add(new Telefon("13","redmi",11,56));
            }
        };

        Telefon.butunTelefonlariYazzdir(telefonlar);//olduğu gibi sıralar
        System.out.println("*************************************************************");
        Collections.sort(telefonlar);
        Telefon.butunTelefonlariYazzdir(telefonlar);
        System.out.println("*************************************************************");
        Collections.reverse(telefonlar);//ustunde olusan yeni tlfon tablosunun sondan basa dogru yeniden yazan metottur
        Telefon.butunTelefonlariYazzdir(telefonlar);
        System.out.println("***************************************************************");
       Comparator<Telefon> dahaKucukRam = new Comparator<Telefon>() {

            @Override
            public int compare(Telefon o1, Telefon o2) {
                if(o1.getRam()<o2.getRam()){
                    return -1;
                }
                else {
                    return 1;
                }
            }
        };
        Collections.sort(telefonlar,dahaKucukRam);
        Telefon.butunTelefonlariYazzdir(telefonlar);
    System.out.println("*****************************************************");
    }
}
