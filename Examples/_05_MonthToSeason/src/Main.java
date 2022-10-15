import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a month in text");
        String month = new Scanner(System.in).nextLine().toUpperCase();

        switch (month) {
            case "DECEMBER", "JANUARY", "FEBRUARY" -> System.out.println(month + " is a Winter month");
            case "MARCH", "APRIL", "MAY" -> System.out.println(month + " is a Spring month");
            case "JUNE", "JULY", "AUGUST" -> System.out.println(month + " is a Summer month");
            case "SEPTEMBER", "OCTOBER", "NOVEMBER" -> System.out.println(month + " is an Autumn month");
            default -> System.out.println("You made an incorrect entry!");
        }
    }
}