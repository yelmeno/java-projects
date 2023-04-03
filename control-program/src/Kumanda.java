import java.util.ArrayList;
import java.util.Iterator;

public class Kumanda implements Iterable<String> {
    private ArrayList<String> kanallar = new ArrayList<String>();

    public  class kumandaIterator implements Iterator <String> {
        private int index;

        @Override
        public boolean hasNext() {
            if (index >= kanallar.size()) {
                return false;

            } else {
                return true;

            }
        }

        @Override
        public String next() {
                String kanal = kanallar.get(index);
                index++;
                return kanal;

            }

        }


    public void KanalEkle(String kanal) {
        kanallar.add(kanal);

    }

    public void KanalSil(String kanal) {
        if (kanallar.contains(kanal)) {
            kanallar.remove(kanal);

        } else {
            System.out.println("Böyle bir kanal bulunmamaktadır..");
        }
    }

    public int KanalSayisi() {
        return kanallar.size();

    }


    @Override
    public Iterator<String> iterator() {

        return new kumandaIterator();
    }
}



