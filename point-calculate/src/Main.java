import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Puan hesaplama programına hoşgeldiniz..");
        String islemler = "1- Eşit ağırlık birinicisi"
                + "2- Sayısal birincisi";
        System.out.println("----------------------------------");
        System.out.println(islemler);
        System.out.println("----------------------------------");
        String islem = scanner.nextLine();
        while (true) {
            System.out.println("Birinci öğrencinin ismi ve netlerini giriniz");
            String isim1 = scanner.nextLine();
            int turkce1 = scanner.nextInt();
            int matematik1 = scanner.nextInt();
            int fizik1 = scanner.nextInt();
            int edebiyat1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("İkinci öğrencinin ismi ve netlerini giriniz");
            String isim2 = scanner.nextLine();
            int turkce2 = scanner.nextInt();
            int matematik2 = scanner.nextInt();
            int fizik2 = scanner.nextInt();
            int edebiyat2 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("İkinci öğrencinin ismi ve netlerini giriniz");
            String isim3 = scanner.nextLine();
            int turkce3 = scanner.nextInt();
            int matematik3 = scanner.nextInt();
            int fizik3 = scanner.nextInt();
            int edebiyat3 = scanner.nextInt();
            scanner.nextLine();


            if (islem.equals("1")) {
                Esitagirlik esitagirlik = new Esitagirlik(turkce1, matematik1, fizik1, edebiyat1, isim1);
                Esitagirlik esitagirlik1 = new Esitagirlik(turkce2, matematik2, fizik2, edebiyat2, isim2);
                Esitagirlik esitagirlik2 = new Esitagirlik(turkce3, matematik3, fizik3, edebiyat3, isim3);
                Esitagirlik birinci = birinci(esitagirlik1, esitagirlik2, esitagirlik);
                System.out.println("Eşit ağırlık birincisi" + birinci);
                System.out.println("Eşit ağırlık birincisinin puanı" + birinci.puanHesapla());

            } else if (islem.equals("2")) {
                Sayisal sayisal = new Sayisal(turkce1, matematik1, fizik1, edebiyat1, isim1);
                Sayisal sayisal1 = new Sayisal(turkce2, matematik2, fizik2, edebiyat2, isim2);
                Sayisal sayisal2 = new Sayisal(turkce3, matematik3, fizik3, edebiyat3, isim3);
                Sayisal birinci = birinci(sayisal2, sayisal1, sayisal);
                System.out.println("Sayısal birincisi" + birinci);
                System.out.println("Sayısal birincisinin puanı" + birinci.puanHesapla());

            }


        }


    }

    public static <E extends Aday> E birinci(E e1, E e2, E e3) {
        if (e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()) {
            return e1;
        } else if (e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()) {
            return e2;
        } else {
            return e3;
        }

    }
}