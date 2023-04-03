import java.util.InputMismatchException;
import java.util.Scanner;
class CarpmaExceptions extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Lütfen daha küçük sayılar giriniz..");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz.");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz..");
        String islemler = "1-Toplama işlemi.."
                + "2- Çıkarma işlemi.."
                + "3-Bölme işlemi.."
                + "4-Çarpma işlemi..";
        System.out.println("------------------------");
        System.out.println(islemler);
        System.out.println("------------------------");
        Scanner scanner = new Scanner(System.in);
        String islem = scanner.nextLine();
        int a;
        int b;
        try {


            switch (islem) {


                case "1":
                    System.out.println("Lütfen toplamak istediğiniz değerleri giriniz..");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println("Toplam: " + (a + b));
                    break;
                case "2":
                    System.out.println("Lütfen çıkarmak istediğiniz değerleri giriniz..");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println("Toplam: " + (a - b));
                    break;
                case "3":
                    System.out.println("Lütfen bölmek istediğiniz değerleri giriniz..");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println("Toplam: " + (a / b));
                    break;
                case "4":
                    System.out.println("Lütfen çarpmak istediğiniz değerleri giriniz..");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    if (a > 10000 && b > 10000) {
                        throw new CarpmaExceptions();
                    }
                    System.out.println("Toplam: " + (a * b));
                    break;
                default: System.out.println("Geçersiz işlem..");
            }


    } catch (ArithmeticException e) {
            System.out.println("Bir sayı 0 a bölünemez..");


         }
        catch (InputMismatchException e ) {
            System.out.println("Lütfen doğru formatta giriniz.." );



        } catch (CarpmaExceptions e) {
            e.printStackTrace();
        }

    }

    }