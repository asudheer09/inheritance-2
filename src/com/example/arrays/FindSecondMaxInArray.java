package com.example.arrays;

import java.util.Arrays;

public class FindSecondMaxInArray {
    public static void main(String[] args) {
        findMaxAndSecondMaxFromArray();
    }

    private static void findMaxAndSecondMaxFromArray() {
        int[] arr={180,50,209,10,20,25,};//10 20 25 55 63 96
        int size=arr.length;
        int temp=0;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j <size ; j++) {
                if(arr[i]>arr[j]){
                   temp=arr[i] ;
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("max value is "+arr[size-1]);
        System.out.println("second max value is "+arr[size-2]);
    }
}
