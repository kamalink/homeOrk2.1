package module2.homeOrk1;

import java.util.Arrays;
import java.util.Random;

class max {
    static int[] arr = new int[10];
    static double[] arr1 = new double[10];

    static void max(int[]arr) {

        Random randomize = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 22 - randomize.nextInt(32);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("\n" + "max int is: " + arr[9] + "\n");
    }

    static void max(double[]arr1){

        Random randomize = new Random();
        for(int i=0; i< arr1.length; i++){
            arr1[i] = 10 - randomize.nextInt(30);
        }

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("\n" + "max double is: " + arr1[9] + "\n");
    }
}
