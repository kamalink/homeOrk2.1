package module2.homeOrk1;

import java.util.Arrays;
import java.util.Random;

class secondLargest {
    static int[] arr = new int[10];
    static double[] arr1 = new double[10];

    static void secondLargest(int[]arr) {

        Random randomize = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomize.nextInt(48);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("\n" + "secondLargest int is: " + arr[8] + "\n");
    }

    static void secondLargest(double[]arr1){

        Random randomize = new Random();
        for(int i=0; i<arr1.length; i++){
            arr1[i] = 3 - randomize.nextInt(12);
        }

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("\n" + "secondLargest double is " + arr1[8]);
    }
}
