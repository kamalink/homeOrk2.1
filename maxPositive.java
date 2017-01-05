package module2.homeOrk1;

import java.util.Arrays;
import java.util.Random;

class maxPositive {
    static int[] arr = new int[10];
    static double[] arr1 = new double[10];

    static void maxPositive(int[]arr) {

        Random randomize = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 50 - randomize.nextInt(100);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("\n" + "maxPositive int is " + arr[9] + "\n");
    }

    static void maxPositive(double[]arr1){

        Random randomize = new Random();
        for(int i =0; i<arr1.length; i++) {
            arr1[i] = 120 - randomize.nextInt(200);
        }

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("\n" + "maxPositive double is " + arr1[9]);

    }
}
