package com.example.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayUsingBubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========MENU========");
        System.out.println(" please enter a number that should be 1 or 2");
        System.out.println("  1. Ascending order");
        System.out.println("  2. descending order");
        System.out.println("====================");
        int n = scanner.nextInt();
        int[] arr = {180, 50, 209, 10, 20, 25,};//10 20 25 55 63 96
        int size = arr.length;
        int temp = 0;
        if (n == 1) {
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        } else if (n == 2) {
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] < arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("you have given invalid option");
        }

    }
}
