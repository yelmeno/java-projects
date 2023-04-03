import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Matematik ve Fizik problemleri çözme uygulamasına hoşgeldiniz..");
        String islemler = "1- Daire alanı hesaplamak \n"
                         +"2- Üçgen Çevresi hesaplamak \n"
                         +"3- 3 Boyutlu vektör  çarpımı \n"
                         +"Çıkmak için q ya basınız..";
        System.out.println(islemler);
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
        while (true){
            Scanner scanner = new Scanner(System.in);
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor..");
                break;
            }else if ( islem.equals("1")){
                System.out.println("Lütfen dairenin yarıçapını giriniz..");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                problem.MatematikProblemi.DaireAlan(yaricap);
            }
            else if( islem.equals("2")){
                System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz");
                int kenar1 = scanner.nextInt();
                int kenar2 = scanner.nextInt();
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                problem.MatematikProblemi.UcgeninCevresi(kenar1,kenar2,kenar3);


            }
            else if (islem.equals("3")){
                vec vec1 = new vec("Vektör1");
                vec vec2 = new vec("Vektör2");
                problem.FizikProblemi.icCarpim(vec1,vec2);

            }
            else { System.out.println("Geçersiz işlem");
        }
      }
    }
}
