import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a text or character:");
        String input = new Scanner(System.in).nextLine();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            System.out.print((int) character + " ");
        }
    }
}