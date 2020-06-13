package ir.amirkakavand;

import java.io.*;
import java.util.Scanner;

public class Shop {

    public static void main(String[] args) throws IOException  {

        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        System.in));

        short n = 0, c = 0;
        int max = 0, sum = 0;
        int[] p = new int[100000000];
        int[] s = new int[100000000];
        int[] b = new int[100000000];
        int[] f = new int[100000000];
        String[] input;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextShort();

        for (int i = 0; i < n; i++) {
            input = in.readLine().split(" ");

            p[i] = Integer.parseInt(input[0]);
            s[i] = Integer.parseInt(input[1]);
        }

        c = scanner.nextShort();

        for (int i = 0; i < c; i++) {
            input = in.readLine().split(" ");

            b[i] = Integer.parseInt(input[0]);
            f[i] = Integer.parseInt(input[1]);
        }

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i] == p[j]) {
                    if (f[i] == s[j] || f[i] == s[j] - 1) {

                        p[j] = 0;
                        s[j] = 0;
                    }
                } else if(b[i] > p[j]) {

                    if (f[i] == s[j] || f[i] == s[j] - 1) {

                        sum += maxFinder(p);

                        p[j] = 0;
                        s[j] = 0;
                    }
                }
            }
        }

        System.out.println(sum);
    }

    public static int maxFinder(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] >= max) {
                max = arr[i];
            }
        }

        return max;
    }
}
