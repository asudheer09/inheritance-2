package com.examples.Strings;

public interface VowlesCount {
    public static void main(String[] args) {
        String name="asudheer";
        int count=0;
        char[] chars=name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='a' || chars[i]=='e' || chars[i]=='i' || chars[i]=='o' || chars[i]=='u'){
                count++;
            }
        }
        System.out.println("no of vowles present is "+count);
    }
}
