import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lütfen ilk sayıyı giriniz:");
        int girdiA = new Scanner(System.in).nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz:");
        int girdiB = new Scanner(System.in).nextInt();

        System.out.println("Lütfen üçüncü sayıyı giriniz:");
        int girdiC = new Scanner(System.in).nextInt();

        System.out.println("Lütfen dördüncü sayıyı giriniz:");
        int girdiD = new Scanner(System.in).nextInt();
        int toplam = girdiA + girdiB + girdiC + girdiD;
        System.out.println("Sayıların toplamı: " + toplam);
        System.out.println("Sayıların ortalaması: " + toplam / 4);
    }
}