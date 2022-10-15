import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int number;
        Random randomNumber = new Random();
        for (int i = 0; i < 10; i++) {
            number = randomNumber.nextInt(1, 1000);
            System.out.println(i + 1 + ". Number: " + number);
        }
    }
}