package com.cakmak.genericmetot;

public class Sayisal extends Aday {
    public Sayisal(int turkce, int matematik, int fizik, int kimya,int edebiyat) {
        super(turkce, matematik, fizik, kimya,edebiyat);
    }

    @Override
    public int puanHesapla() {
        return getTurkce()*5+getMatematik()*5+getFizik()*4+getKimya()*4+getEdebiyat()*1;
    }
}
