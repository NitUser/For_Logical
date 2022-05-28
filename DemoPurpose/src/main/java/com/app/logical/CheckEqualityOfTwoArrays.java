package com.app.logical;

public class CheckEqualityOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1={1,3,2,4,6,5,7,8,9,10};
        int[] arr2={2,8,4,6,5,10,1,3,7};
        checkEqualityOf(arr1,arr2);
    }

    private static void checkEqualityOf(int[] arr1, int[] arr2) {
       boolean flag=true;
        if (arr1.length==arr2.length){
            for (int i=0;i<arr1.length;i++){
                if (arr1[i]!=arr1[i]){
                    flag=false;
                }
            }
        }
        else
        {
            flag=false;
        }
        if (flag){
            System.out.println("Both Arrays are equals");
        }
        else
        {
            System.out.println("Both Arrays are not equals");
        }
    }
}
