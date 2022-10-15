import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the first number:");
        int girdiA = new Scanner(System.in).nextInt();

        System.out.println("Please enter the second number:");
        int girdiB = new Scanner(System.in).nextInt();

        System.out.println("Please enter the third number:");
        int girdiC = new Scanner(System.in).nextInt();

        System.out.println("Please enter the fourth number:");
        int girdiD = new Scanner(System.in).nextInt();
        int toplam = girdiA + girdiB + girdiC + girdiD;
        System.out.println("Sum of numbers:: " + toplam);
        System.out.println("Average of numbers: " + toplam / 4);
    }
}