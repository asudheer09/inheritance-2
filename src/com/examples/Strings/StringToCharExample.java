package com.examples.Strings;

public class StringToCharExample {
    public static void main(String[] args) {
        String name="java";
       /* char[] chars=name.toCharArray();
       // chars[0]='j'; chars[1]='a'; chars[2]='v'; chars[3]='a';
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("revers order");

        for (int i = chars.length-1; i >=0 ; i--) {
            System.out.println(chars[i]);
        }*/

        System.out.println(name.charAt(0));//j
        System.out.println(name.charAt(1));//a
    }
}
