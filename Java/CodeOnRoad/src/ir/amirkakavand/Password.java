package ir.amirkakavand;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
	// write your code here
        int n = 0;
        String pass = "";
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        scanner.nextLine();
        pass = scanner.nextLine().toLowerCase();

        if (n > 100) {
            System.out.println("NO");
        } else {
            System.out.println(check(n, pass));
        }

    }

    static String check(int n, String pass) {

        if (n < 26) {
            return "NO";
        }

        if (n != pass.length()) {
            return "NO";
        }

        for (char i = 97; i < 123; i++) {

            if(!pass.contains("" + i)) {
                return "NO";
            }
        }

        return "YES";
    }
}
