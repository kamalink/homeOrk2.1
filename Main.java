package module2.homeOrk1;

import module6.homeOrk1and3.ArrayUtils;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        /*Invoking methods from module2 homeOrk1and3 */

        modulus.modulus(modulus.arr);
        modulus.modulus(modulus.arr1);

        multiplication.mult(multiplication.arr);
        multiplication.mult(multiplication.arr1);

        sum.sum(sum.arr);
        sum.sum(sum.arr1);

        secondLargest.secondLargest(secondLargest.arr);
        secondLargest.secondLargest(secondLargest.arr1);

        min.min(min.arr);
        min.min(min.arr1);

        max.max(max.arr);
        max.max(max.arr1);

        maxPositive.maxPositive(maxPositive.arr);
        maxPositive.maxPositive(maxPositive.arr1);

        /*Invoking methods from ArrayUtils */
        int[]arr = {2,6,13,92,10};

        ArrayUtils.sum(sum.arr);
        ArrayUtils.min(min.arr);
        ArrayUtils.max(max.arr);
        ArrayUtils.maxPositive(maxPositive.arr);
        ArrayUtils.modulus(modulus.arr);
        ArrayUtils.mult(multiplication.arr);
        ArrayUtils.secondLargest(secondLargest.arr);
        System.out.println("Reverse sort " + Arrays.toString(ArrayUtils.reverse(arr))+"\n");
        System.out.println("Even elements " + Arrays.toString(ArrayUtils.findEvenElements(arr)));
    }
}
