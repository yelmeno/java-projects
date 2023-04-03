import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz");
        System.out.println("Lütfen 1. sayı değerini giriniz..");
        Scanner scanner = new Scanner(System.in);
        int sayi1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Lütfen 2. sayı değerini giriniz..");
        int sayi2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Lütfen 3. sayı değerini giriniz..");
        int sayi3 = scanner.nextInt();
        if (sayi1 > sayi2 && sayi1 > sayi3){
            System.out.println("En büyük sayınız 1. girdiğiniz değerdir: "+sayi1);
        }else if (sayi2 > sayi1 && sayi2 > sayi3){
            System.out.println("En büyük sayınız 2. girdiğiniz değerdir: "+sayi2);
        }else if (sayi3 > sayi1 && sayi3 > sayi2){
            System.out.println("en büyük sayınız 3. girdiğiniz değerdir: "+sayi3);
        }else  { System.out.println("Girdiğiniz değerler geçersiz ya da birbirine eşit değerlerdir..");
        }

    }
}