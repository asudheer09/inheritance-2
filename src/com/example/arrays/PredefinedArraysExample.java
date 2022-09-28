package com.example.arrays;

import java.util.Arrays;
import java.util.Collections;

public class PredefinedArraysExample {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 5, 3, 2, 6};
        Integer[] arr1 = {1, 9, 8, 5, 3, 2, 6};
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3, 4};

       /* for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        System.out.println("ascending order");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //System.out.println(arr);//[I@5e2de80c
        boolean res = Arrays.equals(a1, a2);
        System.out.println(res);

        System.out.println("descending order");
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));

        int result=Arrays.binarySearch(arr1,15);
        if(result<0){
            System.out.println("element not found");
        }else{
            System.out.println("element found");
        }
    }
}
