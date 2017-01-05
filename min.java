package module2.homeOrk1;

import java.util.Arrays;
import java.util.Random;

class min {
    static int[] arr = new int[10];
    static double[] arr1 = new double[10];

    static void min(int[]arr) {

        Random randomize = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 386 - randomize.nextInt(549);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("\n" + "min int is: " + arr[0] + "\n");
    }

    static void min(double[]arr1){

        Random randomize = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 384 - randomize.nextInt(746);
        }

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("\n" + "min double is: " + arr1[0] + "\n");

    }
}
