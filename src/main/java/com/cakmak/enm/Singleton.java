package com.cakmak.enm;

public class Singleton {

    private static Singleton myinstance;

    private Singleton(){

    }

    public static Singleton  instance(){
        if(myinstance==null){
            System.out.println("New ile yer alındı.");
            myinstance = new Singleton();
        }
        return myinstance;
    }

}
