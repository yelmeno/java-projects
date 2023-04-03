public class Esitagirlik extends Aday {

    public Esitagirlik(int turkce, int matematik, int fizik, int edebiyat , String isim) {
        super(turkce, matematik, fizik, edebiyat,isim);
    }

    @Override
    int puanHesapla() {
        return getTurkce()*5+ getMatematik()*5 + getFizik()*1 + getEdebiyat()*4;
    }
}