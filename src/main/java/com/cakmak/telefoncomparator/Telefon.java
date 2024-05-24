package com.cakmak.telefoncomparator;

import java.util.ArrayList;

public class Telefon implements Comparable<Telefon> {
    private String model;
    private String marka;
    private int ram;
    private int hafiza;

    public Telefon(String model,String marka,int ram,int hafiza){
        this.model=model;
        this.marka=marka;
        this.ram=ram;
        this.hafiza=hafiza;
    }

    public int getHafiza() {
        return hafiza;
    }

    public void setHafiza(int hafiza) {
        this.hafiza = hafiza;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", ram=" + ram +
                ", hafiza=" + hafiza;

    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public int compareTo(Telefon o) {
        if (hafiza<o.hafiza) {
            return -1;
        } else if (hafiza>o.hafiza) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void butunTelefonlariYazzdir(ArrayList<Telefon> telefonlar){
        for (Telefon telefon: telefonlar){
            System.out.println(telefon);
        }
    }
}
