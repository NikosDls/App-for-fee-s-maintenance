package reversingarrays;

import java.util.Scanner;

public class ReversingArrays {

    public static void main(String[] args) {
        System.out.print("Give the size of array:");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Give the the value for array[%d]:", i);
            array[i] = scan.nextInt();
        }

        System.out.println("\nArray before reverse:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t", array[i]);
        }

        reverse(array);

        System.out.println("\nArray after reverse:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t", array[i]);
        }
    }

    public static void reverse(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - (i+1)];
            array[array.length - (i+1)] = temp;
        }
    }

}
