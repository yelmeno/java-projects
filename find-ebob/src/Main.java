import java.util.Scanner;

public class Main {
    public static int EbobBulma (int sayi1, int sayi2){
        int ebob =1;
        for (int i =1; i<= sayi1 && i<=sayi2; i++) {
            if ((sayi1 % i == 0) && (sayi2 % i ==0)){
                ebob = i;
            }
        }return ebob;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyi giriniz");
        int sayi1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("İkinci sayıyı giriniz");
        int sayi2 = scanner.nextInt();
        System.out.println("Girdiğiniz sayıların ebobu: "+ EbobBulma(sayi1, sayi2));


    }
}