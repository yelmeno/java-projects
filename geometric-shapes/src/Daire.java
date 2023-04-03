public class Daire extends Sekil{
    private int yaricap;

    public Daire(String isim, int yaricap) {
        super(isim);
        this.yaricap=yaricap;
    }

    @Override
    void AlanHesapla() {
        System.out.println(getIsim() + "Alanı " + (Math.PI * (yaricap*yaricap)));

    }
}
