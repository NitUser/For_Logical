package com.app.logical;

import java.util.Arrays;

public class CheckAnagramOfString {
    public static void main(String[] args) {
        String str1 = "mother in law";
        String str2 = "hitler woman";
        checkAnagram(str1, str2);
    }

    private static void checkAnagram(String string1, String string2) {
        String str1=string1.replaceAll("\\s","");
        String str2=string2.replaceAll("\\s","");
        boolean flag = true;
        if (str1.length() != str2.length()) {
            flag = false;
        } else {
            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            for (int i = 0; i < str1.length(); i++) {
                if (ch1[i] != ch2[i]) {
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println("This is Anagram");
        }
        else
        {
            System.out.println("This is not Anagram");
        }
    }
}
