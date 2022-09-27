package com.examples.Strings;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        String name="god";
        char[] chars= name.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
