import java.util.Scanner;

public class Main{
    public  static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "İşlemler \n"
                         +"1- Kare Alan Hesapla\n"
                         +"2- Üçgen Alan Hesapla\n"
                         +"3- Daire Alan Hesapla\n"
                         +"Çıkmak için q ya bas..";
        while (true){
            String sekil_turu= scanner.nextLine();
            System.out.println(islemler);
            System.out.println("Hnagi şeklin alanını hesaplamak istiyorsunuz ?");
            Sekil sekil = null;
            if (sekil_turu.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;

            }
            else if (sekil_turu.equals("1")){
                System.out.println("Lütfen kenar uzunluğunu girinizç");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                sekil = new Kare("kare1", 4);
                sekil.AlanHesapla();

            }
            else if (sekil_turu.equals("2")){
                System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz..");
                int uzunkenar = scanner.nextInt();
                int kisakenar1 = scanner.nextInt();
                int kisakenar2 = scanner.nextInt();
                scanner.nextLine();
                sekil = new Ucgen("Ucgen1",kisakenar1,kisakenar2,uzunkenar);
                sekil.AlanHesapla();
            }else if (sekil_turu.equals("3")){
                System.out.println("Lütfen dairenin yarıçapını giriniz..");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                sekil = new Daire("Daire1", yaricap);
                sekil.AlanHesapla();
            }else { System.out.println("Geçersiz işlem..");

        }
    }
  }
}