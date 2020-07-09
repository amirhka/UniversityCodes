package ir.amirkakavand;

import java.util.Scanner;

public class SubString {
    String sent;
    String[] words = new String[100];

    public SubString(String s) {
        this.sent = s;
        loop();
    }

    public String[] loop() {
        int a = -1, flag = 0;
        for (int i = 0; i < sent.length(); i++) {
            if (sent.charAt(i) == ' ') {
                words[flag] = sent.substring(a + 1, i);
                a = i;
                flag++;
            }
            if (i == sent.length() - 1)
                words[flag] = sent.substring(a + 1, i + 1);
        }
        for (int i = 0; words[i] != null; i++)
            System.out.println(words[i]);
        return words;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter your sentence:");
        String string = scanner.nextLine();
        new SubString(string);
    }
}
