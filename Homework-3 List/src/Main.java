import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lütfen bir metin giriniz");
        Scanner isim = new Scanner(System.in);
        String metin = isim.nextLine();
        List<String> index = new ArrayList<String>();

        for (int i = 0; i < metin.length(); i++) {
            String harf = metin.substring(i, i + 1);
            index.add(i, harf);
        }

        for (int a = 0; a < metin.length(); a++) {
            int count = Collections.frequency(index, index.get(a));
            System.out.print(index.get(a) + "(" + count + ")");
        }
    }
}
