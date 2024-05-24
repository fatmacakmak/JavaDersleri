package com.cakmak.finall;

 public class Database {
    public  void baglantiKur( String username, String password){//final bi metot override edilemez override edilmesini istemedigin metodu final tanımlayabilirsin
        username="root";
        password= String.valueOf(123);


        System.out.println(username);
        System.out.println(password);
    }
}
