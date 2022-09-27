package com.examples.Strings;

public class StringPalindromeExample {
    public static void main(String[] args) {

        String name="HELLO";
        StringBuilder reverse= new StringBuilder("");
        char[] input=name.toCharArray();

        for (int i =input.length-1 ; i >=0 ; i--) {
            reverse.append(input[i]);
        }

        String newName=reverse.toString();

        if(name.equals(newName)){
            System.out.println("given String is palindrome");
        }else{
            System.out.println("given String is not a palindrome");
        }




    }
}
