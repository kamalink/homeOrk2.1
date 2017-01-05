package module2.homeOrk1;

import java.util.Random;

class multiplication {
    static int[]arr = new int[10];
    static double[]arr1 = new double[10];

    static void mult(int[] arr) {

        Random randomize = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 6 - randomize.nextInt(5);
        }

        int mult1 = 1;
        for (int i = 0; i < arr.length; i++) {
            mult1*= arr[i];
        }
        System.out.println(mult1);
    }

    static void mult(double[] arr1) {

        Random randomize = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 8 - randomize.nextInt(6);
        }

        double mult2 = 1;
        for (int i = 0; i < arr1.length; i++) {
            mult2*= arr1[i];
        }
        System.out.println(mult2);

    }
}



