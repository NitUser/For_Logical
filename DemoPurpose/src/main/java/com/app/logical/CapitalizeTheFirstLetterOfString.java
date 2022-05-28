package com.app.logical;

public class CapitalizeTheFirstLetterOfString {
    public static void main(String[] args) {
        /*String arr[]={"ram","shyam","mohan","rohan"};
        for (String str:arr) {
            String output = str.substring(0, 1).toUpperCase() + str.substring(1);
            System.out.print(output+" ");
        }*/
        String str="ram is a good boy !";
        String output=str.substring(0,1).toUpperCase()+str.substring(1);
        System.out.print(output+" ");
    }

}
