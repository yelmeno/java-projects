public class Sayisal extends Aday{
    public Sayisal(int turkce, int matematik, int fizik, int edebiyat, String isim) {
        super(turkce, matematik, fizik, edebiyat, isim);
    }

    @Override
    int puanHesapla() {
        return getTurkce()*5 + getMatematik()*5 + getFizik()*4 + getEdebiyat()*1;

    }
}

