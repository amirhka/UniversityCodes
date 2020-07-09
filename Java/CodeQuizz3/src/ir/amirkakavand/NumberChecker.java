package ir.amirkakavand;

import java.io.*;
import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                try {
                    int a = Integer.parseInt(data);
                    System.out.print(a + ": ");
                    if (a > 0) {
                        System.out.println(Math.sqrt(a));
                    } else {
                        System.out.println("this integer is negative");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("not an integer");
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}