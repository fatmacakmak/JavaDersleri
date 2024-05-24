package com.cakmak.genericmetot;

public class EsitAgirlik extends Aday{
    public EsitAgirlik(int turkce, int matematik, int fizik, int kimya, int edebiyat) {
        super(turkce, matematik, fizik, kimya, edebiyat);
    }

    @Override
    public int puanHesapla() {
        return  getTurkce()*5+getMatematik()*5+getFizik()*1+getKimya()*1+getEdebiyat()*4;
    }
}
