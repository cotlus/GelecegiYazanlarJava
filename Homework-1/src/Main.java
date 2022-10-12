import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lütfen bir isim giriniz");
        String input = new Scanner(System.in).nextLine();
        input = input.replace("a", "1").replace("e","2").replace("ı","3").replace("i","4").replace("o", "5").replace("ö", "6").replace("u","7").replace("ü","8");
        System.out.println(input);
    }
}