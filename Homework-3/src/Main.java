import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        LinkedHashMap<Character, Integer> characterCounter = new LinkedHashMap<Character, Integer>();
        System.out.println("Lütfen bir metin giriniz");
        String input = new Scanner(System.in).nextLine();

        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }

        for (Character ch : list) {
            if (characterCounter.containsKey(ch)) {
                characterCounter.put(ch, characterCounter.get(ch) + 1);
            } else {
                characterCounter.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : characterCounter.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }
    }
}