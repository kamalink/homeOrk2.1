package module2.homeOrk1;

import java.util.Random;

class modulus {
    static int[] arr = {10,2,3,4,5,6,7,8,9,4};
    static double[] arr1 = new double[10];

    static void modulus(int[]arr){
        int x = arr[0];
        int y = arr[9];
        int sum;

        sum = x%y;
        System.out.println("modulus of first and last elements is " + sum);
    }

    static void modulus(double[]arr1){
        Random randomize = new Random();
        for(int i=0; i<arr1.length; i++){
            arr1[i] = randomize.nextInt(33);
        }
        double x = arr1[0];
        double y = arr1[9];
        double sum;

        sum = x%y;
        System.out.println("\n" + "modulus of first and last random elements is " + sum);
    }
}


