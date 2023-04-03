public class Kare extends Sekil {
    private int kenar;

    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void AlanHesapla() {
        System.out.println(getIsim() + "Alanı "+ (kenar*kenar));

    }
}
