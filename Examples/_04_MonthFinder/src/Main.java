import java.util.Scanner;

public class Main {
    public enum months{
        January, February, March, April, May, June, July, August, September, October, November, December
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of the month you want to find:");
        int month = new Scanner(System.in).nextInt()-1;
        months value = months.values()[month];
        System.out.println("The month you are looking for: " + value);
    }
}