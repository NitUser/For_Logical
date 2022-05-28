package com.app.logical;

public class PushZeroToEndOfArray
{
    public static void main(String[] args) {
      int array[]={1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
      pushZeroToEnd(array);
        System.out.println("Array after pushing zero to end ");
        for(int i=0;i< array.length;i++)
        System.out.print(array[i]+ " ");

    }

    private static void pushZeroToEnd(int[] array) {
        int count=0;
        int len=array.length;
        for(int i=0;i<len;i++)
            if(array[i]!=0)
                array[count++]=array[i];

        while (count<len)
            array[count++]=0;
    }

}
