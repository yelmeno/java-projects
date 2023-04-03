import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kumanda programına hoşgeldiniz");
        Scanner scanner = new Scanner(System.in);
        String islemler = "1.İşlem Kanalları göster\n"+
                          "2.İşlem Kanal Ekle \n"+
                          "3.İşlem Kanal sil\n"+
                          "4. Kanal sayısını öğren\n"+
                          "Çıkmak için q ya basınız..";
        Kumanda kumanda = new Kumanda();

        while (true){
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz..");
            System.out.println(islemler);
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            }else if (islem.equals("1")){
                KanallariGoster(kumanda);

            }else if (islem.equals("2")){
                System.out.println("Eklenecek kanal");
                String kanal = scanner.nextLine();
                kumanda.KanalEkle(kanal);

            }else if (islem.equals("3")){
                System.out.println("Silinecek kanal");
                String kanal = scanner.nextLine();
                kumanda.KanalSil(kanal);

            }else if (islem.equals("4")){
                System.out.println("Kanal sayısı : " +kumanda.KanalSayisi());


            } else {
                System.out.println("Geçersiz işlem..");
            }

        }
    }
    public static void KanallariGoster (Kumanda kumanda){
        if ( kumanda.KanalSayisi() == 0){
            System.out.println("Kanal bulunmamaktadır");

        }else {
            for ( String kanal : kumanda){
                System.out.println("Kanal : "+kanal);
            }
        }
    }
}