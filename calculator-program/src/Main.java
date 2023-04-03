import java.util.Scanner;

public class Main {
    public static int toplama ( int a , int b){
        return ( a + b );
    }
    public static int cikarma ( int a , int b){
        return ( a - b );
    }
    public static double bolme (int a , int b){
        return (a / b);
    }
    public static int carpma (int a , int b){
        return (a * b);
    }public static int toplama (int a , int b , int c){
        return (a + b + c);
    }public static int carpma (int a , int b , int c){
        return (a * b * c);
    }

    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz");
        String islemler = "1. Toplama İşlemi\n"
                + "2. Çıkarma İşlemi\n"
                + "3. Çarpma İşlemi\n"
                + "4. Bölme İşlemi\n"
                + "Çıkmak için q ya basınız..";
        Scanner scanner = new Scanner(System.in);

        System.out.println(islemler);

        while (true) {
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Kaç değer toplayacaksınız");
                int kacsayi = scanner.nextInt();
                if (kacsayi == 2) {
                    System.out.println("Lütfen toplamak istediğiniz değerleri giriniz..");
                    System.out.println("A:");
                    int a = scanner.nextInt();
                    System.out.println("B:");
                    int b = scanner.nextInt();
                    System.out.println("Toplam değer" + (toplama(a, b)));
                } else if (kacsayi == 3) {
                    System.out.println("Lütfen toplamak istediğiniz değerleri giriniz..");
                    System.out.println("A:");
                    int a = scanner.nextInt();
                    System.out.println("B:");
                    int b = scanner.nextInt();
                    System.out.println("C:");
                    int c = scanner.nextInt();
                    System.out.println("Toplam değer" + (toplama(a, b, c)));
                }
            } else if (islem.equals("2")) {
                System.out.println("Lütfen birbirinden çıkarmak istediğiniz değerleri giriniz..");
                System.out.println("A:");
                int a = scanner.nextInt();
                System.out.println("B:");
                int b = scanner.nextInt();
                System.out.println("İşlem sonucunuz: " + cikarma(a, b));
            } else if (islem.equals("3")) {
                System.out.println("Kaç değer çarpacaksınız?");
                int kacsayi = scanner.nextInt();
                if (kacsayi == 2) {
                    System.out.println("Lütfen çarpmak istediğiniz değerleri giriniz..");
                    System.out.println("A:");
                    int a = scanner.nextInt();
                    System.out.println("B:");
                    int b = scanner.nextInt();
                    System.out.println("İşlem Sonucu" + (carpma(a, b)));

                } else if (kacsayi == 3) {
                    System.out.println("Lütfen çarpmak istediğiniz değerleri giriniz..");
                    System.out.println("A:");
                    int a = scanner.nextInt();
                    System.out.println("B:");
                    int b = scanner.nextInt();
                    System.out.println("C:");
                    int c = scanner.nextInt();
                    System.out.println("İşlem Sonucu" + carpma(a, b, c));
                }

            }else if (islem.equals("4")){
                System.out.println("Lütfen birbirine bölmek istediğiniz değerleri giriniz..");
                System.out.println("A:");
                int a = scanner.nextInt();
                System.out.println("B:");
                int b = scanner.nextInt();
                System.out.println("İşlem sonucunuz: " + bolme(a , b));

            }
        }
    }
}