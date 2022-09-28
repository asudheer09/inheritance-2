package com.example.arrays;

class PrintDups{
    public void printDuplicates(int[] arr){
        //int[] newArr= new int[]{10,20,30,40,50,20,30,40};
        int len=arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }

    }
}

public class PrintDuplicatesInArray {
    public static void main(String[] args) {
        /*int[] arr= new int[10];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        //System.out.println(arr[5]); AIOBE
        System.out.println(arr[0]);
        int[] myArr={10,20,30,40,50};
        int[] newArr= new int[]{10,20,30,40,50,20,30,40};*/
        int[] newArr= new int[]{10,20,30,40,50,20,30,40};
        PrintDups pd= new PrintDups();
        pd.printDuplicates(newArr);


    }
}
