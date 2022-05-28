package com.app.logical;

public class ReverseString {
    /* public static void main(String[] args) {
         String str="Java";
         char ch[]=str.toCharArray();
         for(int i=str.length()-1;i>=0;i--){
             System.out.print(ch[i]);
         }
     }*/
    public static void main(String[] args) {
        String str = "java";
        System.out.println(reverseString(str));
    }
    public static String reverseString(String input) {
        String str=input;
        if (str.isEmpty()) {
            return str;
        }else{
            return reverseString(str.substring(1))+str.charAt(0);
        }
    }
}