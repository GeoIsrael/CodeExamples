package tasks;

import com.google.common.primitives.Ints;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Graphs {

    static int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7};
    static int counter = 0;



    static void permutation(int p) {

            if (p <= 1) {
                System.out.println(++counter + ":" + Arrays.toString(numbers));
                return;
            }

            for (int m = 0; m < p; m++) {
                swap(m, p);
                permutation(p - 1);
                swap(m, p);
            }

        }

    static void swap(int m, int p) {
            int tmp = numbers[p - 1];
            numbers[p - 1] = numbers[m];
            numbers[m] = tmp;
        }


    public static void main(String[] args) {

        permutation(7);


    }







}
