import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz");
        System.out.println("Lütfen üçgenin bir kenarını giriniz..");
        Scanner scanner = new Scanner(System.in);
        int kenar1;
        int kenar2;
        int thiskenar1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Lütfen üçgenin diğer kenarını giriniz..");
        int thiskenar2 = scanner.nextInt();
        double hipotenus = Math.sqrt(thiskenar1 * thiskenar1 + thiskenar2 * thiskenar2);
        System.out.println("Üçgeninin hipotenüsü: " + hipotenus );
    }
}