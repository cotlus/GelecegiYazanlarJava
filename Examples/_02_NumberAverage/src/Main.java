import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the first number:");
        int number1 = new Scanner(System.in).nextInt();

        System.out.println("Please enter the second number:");
        int number2 = new Scanner(System.in).nextInt();

        System.out.println("Please enter the third number:");
        int number3 = new Scanner(System.in).nextInt();

        System.out.println("Please enter the fourth number:");
        int number4 = new Scanner(System.in).nextInt();
        int total = number1 + number2 + number3 + number4;
        System.out.println("Sum of numbers:: " + total);
        System.out.println("Average of numbers: " + total / 4);
    }
}