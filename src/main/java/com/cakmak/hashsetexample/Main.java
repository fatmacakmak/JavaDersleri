package com.cakmak.hashsetexample;

import java.util.*;

class BuyuktenKucugeString implements Comparator<String> {
    public int compare(String s1,String s2){

        return -s1.compareTo(s2);
    }
}



class Player{
    private String isim;
    private int id;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player(String isim, int id){
        this.isim=isim;
        this.id=id;
    }

    @Override
    public String toString() {

        return "///** ID: "+id+" İsim: "+isim+"**///";
    }
}





class KucuktanBuyugePlayer implements Comparator<Player>{

    public int compare(Player p1,Player p2){
       if(p1.getId()<p2.getId()){
            return -1;
        }
        else if (p1.getId()>p2.getId()) {
            return 1;
        }
        else{
            return 0;
        }
    }
}

class KucuktenBuyugeStringPlayer implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getIsim().compareTo(o2.getIsim());//onune eksi koydugun zaman alfabetik sıraya göre buyukten kücüge sıralar
    }
}
public class Main {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>();


        Player player1 = new Player("fatma",1);
        Player player2 = new Player("asya",3);//equals ve hascode metotlarını ekledigin zaman aynı key ve isme sahip olan degerden sadece bi tanesini getiriyor
        Player player3 = new Player("aysima",5);
        Player player4 = new Player("halime",3);//keyler aynı olup isimler farklıysada her iki keyide getirir...

        System.out.println("||||||******HESHSET*******||||||");
        list.add("fatma");
        list.add("asya");
        list.add("halime");
        list.add("aysima");


        //Collections.sort(list,new BuyuktenKucugeString());

        for (String s : list){
            System.out.println(s);
        }*/

        List<Player> list1 = new ArrayList<>();

        System.out.println("**************************************");
        list1.add(new Player("asya",1));
        list1.add(new Player("fatma",3));
        list1.add(new Player("aysima",5));
        list1.add(new Player("halime",7));

        //Collections.sort(list1,new KucuktanBuyugePlayer());
          //Collections.sort(list1, new KucuktenBuyugeStringPlayer());
        Collections.sort(list1, new Comparator<Player>() {//anonim obje oluşturarakta sıralanabilir
            @Override
            public int compare(Player o1, Player o2) {

                return o1.getIsim().compareTo(o2.getIsim());
            }
        });

            for(Player p: list1){
                 System.out.println(p);
        }










    }
}
