public class hasta implements Comparable <hasta> {
    private String isim;
    private String sikayet;

    private int oncelik;


    public hasta(String isim, String sikayet) {
        this.isim = isim;
        this.sikayet = sikayet;

        if (sikayet.equals("Apandist")){
            this.oncelik= 3;

        }else if (sikayet.equals("Yanık")){
            this.oncelik = 2;

        }else {
            this.oncelik = 1;

        }

    }

    @Override
    public String toString()  {

        String bilgiler = "Hasta Adı" + isim
                          +"\nHasta şikayeti " + sikayet
                          +"\nHasta önceliği "+ oncelik;
        return bilgiler;

    }

    @Override
    public int compareTo(hasta Hasta) {
        if ( this.oncelik > Hasta.oncelik){
            return -1;

        }
        else if (this.oncelik< Hasta.oncelik){
            return 1;
        }else {
            return 0;
        }
    }
}

