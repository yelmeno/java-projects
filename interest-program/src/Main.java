import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("HOŞGELDİNİZ");
        Scanner scanner = new Scanner(System.in);
        int anapara,vade;
        System.out.println("Yatırmak istediğiniz tutar");
        anapara=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Paranızı kaç yıl vade ile yatırmak istiyorsunuz");
        vade = scanner.nextInt();
        double toplampara = anapara;
        double faizorani = 0.06;
        for (int i= 1 ;  i<= vade; i++){
            toplampara = (toplampara * faizorani) + toplampara;
            System.out.println(i + "Yılın sonunda toplam para: "+(int)toplampara +" TLdir");

        }


    }
}