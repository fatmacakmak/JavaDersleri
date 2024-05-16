package com.cakmak.enm;

public class Main {
    public static void main(String[] args) {
        Week m = Week.FRIDAY;

        if(m.equals(Week.TUESDAY)){
            System.out.println("bu Salıdır.");
        }else{
            System.out.println("bu sayılı değildir."+m.getKey());
        }




        Singleton a = Singleton.instance();

        Singleton b = Singleton.instance();

        Singleton c = Singleton.instance();


        System.out.println("AAA : "+StaticBlockDenemesi.getAaaa());

        System.out.println("-------------");

        StaticBlockDenemesi aa = new StaticBlockDenemesi();
        StaticBlockDenemesi bb = new StaticBlockDenemesi();

    }
}
