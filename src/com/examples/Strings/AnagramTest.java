package com.examples.Strings;

import java.util.Arrays;

public class AnagramTest {
    public static void main(String[] args) {
        String name = "Dog"; //race
        String name1 = "gOd"; //care
        name = name.toLowerCase();
        name1 = name1.toLowerCase();
        if (name.length() == name1.length()) {
            char[] chars1 = name.toCharArray(); //dog-->dgo
            char[] chars2 = name1.toCharArray();//god -->dgo
            Arrays.sort(chars1);
            Arrays.sort(chars2);
            boolean res = Arrays.equals(chars1, chars2);
            if (res) {
                System.out.println(name + " and " + name1 + " are anagram for each other");
            } else {
                System.out.println(name + " and " + name1 + " are anagram for each other");
            }
        } else {
            System.out.println(name + " and " + name1 + " are anagram for each other");

        }
    }
}
