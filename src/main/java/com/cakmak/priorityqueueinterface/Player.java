package com.cakmak.priorityqueueinterface;

public class   Player implements Comparable<Player>{


    private static Double score;
    private String isim;
    private int id;
    public Player(String isim,int id,Double score){
        this.isim=isim;
        this.id=id;
        Player.score = score;
    }
    public  void setİsim(String isim){
        this.score = 1.2;
        this.isim=isim;
    }
    public String getİsim(){
        return isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Player player) {
        if (this.id<player.id){
            return -1;
        }
        else if (this.id>player.id){
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "isim='" + isim + '\'' +
                ", id=" + id +
                '}';
    }
}