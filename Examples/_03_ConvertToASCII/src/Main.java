import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lütfen bir metin veya karakter giriniz");
        String girdi = new Scanner(System.in).nextLine();

        for (int i = 0; i < girdi.length(); i++) {
            char karakter = girdi.charAt(i);
            System.out.print((int) karakter + " ");
        }
    }
}