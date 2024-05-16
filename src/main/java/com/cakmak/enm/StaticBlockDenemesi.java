package com.cakmak.enm;

public class StaticBlockDenemesi {

    private static Integer aaaa = new Integer(3333);
    static {
        System.out.println("Fatma aaaa" + aaaa);
        aaaa = new Integer(1234);
        System.out.println("aaaa : "+aaaa);
    }

    public StaticBlockDenemesi(){
        System.out.println("Ben ilk defa cagrıldım.");
    }

    public static Integer getAaaa() {
        return aaaa;
    }

    public static void setAaaa(Integer aaaa) {
        StaticBlockDenemesi.aaaa = aaaa;
    }
}
