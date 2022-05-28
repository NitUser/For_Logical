package com.app.logical;

import java.util.Arrays;

public class ReverseStringInPlace {
    public static void main(String[] args) {
        String arr[]={"John", "Jammy", "Luke"};
        reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseString(String[] arr){

        if(arr.length==0||arr.length<2){
            return;
        }
        for (int i=0;i<arr.length/2;i++){
            String temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
}
