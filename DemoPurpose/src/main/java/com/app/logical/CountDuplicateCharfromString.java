package com.app.logical;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDuplicateCharfromString {
    public static void main(String[] args) {
    String str="butter is very nice";
    countCharFromString(str);
    }
    public static void countCharFromString(String input){
        char[] chars=input.toCharArray();
        Map<Character,Integer> charCountMap=new HashMap<>();

        for(char ch:chars){
            if(charCountMap.containsKey(ch)){
                charCountMap.put(ch,charCountMap.get(ch)+1);
            }
            else
            {
                charCountMap.put(ch,1);
            }
        }
        Set<Character> characters = charCountMap.keySet();
        System.out.println("Duplicate Char from String :"+input);
        for (Character c:characters){
            if (charCountMap.get(c)>1){
                System.out.println(c +" : "+charCountMap.get(c));
            }
        }
    }
}
