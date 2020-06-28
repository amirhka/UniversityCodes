package ir.amirkakavand;

import java.util.Arrays;

public class Sum {

    public static void main(String[] args) {

        int[] arr = {473, 62, 305, 1865, 6, 80, 9, 908, 97};

        System.out.println(Arrays.toString(sorter(arr)));
        System.out.println(summer(arr));

    }

    static String summer(int[] arr) {
        int[] newArr = sorter(arr);
        String num = "maxNumber is = ";

        for (int value : arr) {
            num += Integer.toString(value);
        }

        return num;
    }

    static int[] sorter(int[] arr) {
        int flag = 0;

        double[] fArr = new double[arr.length];

        for (int j = 0; j < arr.length; j++) {
            fArr[j] = (arr[j] / Math.pow(10, String.valueOf(arr[j]).length() - 1));
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (fArr[i] < fArr[j]) {
                    flag = arr[i];
                    arr[i] = arr[j];
                    arr[j] = flag;

                }
            }
        }

        return arr;
    }

}
