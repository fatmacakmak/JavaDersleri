package com.cakmak.finallyblogu;

public class Main {
    public static void main(String[] args) {
        try{
              int a = 30/0;//bu hataya uygun catch blogunun olmamasına ragmen finally blogu calısır***

        }
        catch(NullPointerException e){
            System.out.println("null referans hatası..");
        }
        finally {
            System.out.println("finally blogu herzaman calışır");
        }
        System.out.println("burasıda calısıyor");//ama burası çalışmıyor**
    }
}
