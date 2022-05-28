package com.app.logical;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        String str="13";
        Integer integer = Integer.valueOf(str);
        if(integer%2==0){
            System.out.println("Even number :"+integer);
        }else
        {
            System.out.println("Odd number :"+integer);
        }
    }


}
