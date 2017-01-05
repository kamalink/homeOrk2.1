package module2.homeOrk1;

import java.util.Random;
import java.util.Arrays;

class sum {
    static int[]arr = new int[10];
    static double[] arr1 = new double[10];

    static void sum(int[]arr) {

        Random randomize = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 8 - randomize.nextInt(10);
            arr[4] = 21;
        }
        System.out.println(Arrays.toString(arr) + "\n");

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of int is " + sum);

    }
    static void sum(double[]arr1){

        Random randomize = new Random();
        for(int i=0; i<arr1.length; i++){
            arr1[i] = randomize.nextInt(68);
        }

        double sum2 = 0;
        for(int i = 0; i<arr1.length; i++){
            sum2+= arr1[i];
        }
        System.out.println("\n" + "The sum of double is " + sum2);
    }
}
