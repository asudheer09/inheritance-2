package com.examples.Strings;

public class JavaTest {
    public static void main(String[] args) {
        String words="I Love Programming";
        // Programming Love I
       String[] newWords= words.split(" ");

      /* for(String w:newWords){
           System.out.println(w);
       }*/

        StringBuilder sb= new StringBuilder("");

        for (int i = newWords.length-1; i >=0 ; i--) {
            sb.append(newWords[i]+" ");
        }

        String reverse= sb.toString();

        System.out.println(reverse);


    }
}
