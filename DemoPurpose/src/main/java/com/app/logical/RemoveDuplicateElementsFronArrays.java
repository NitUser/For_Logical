package com.app.logical;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class RemoveDuplicateElementsFronArrays
{
    public static void main(String[] args) {
    int arrs[]={2,4,6,4,8,9,1,9,2,1,2,6};
        removeDuplicateElement(arrs);
    }
    //by hashmap()
    public static void removeDuplicateElement(int[] arrs){
        Map<Integer, Integer> hashMap=new HashMap<>();
        for (int number:arrs){
            if(!hashMap.containsKey(number)){
                hashMap.put(number,1);
            }
            else
            {
             hashMap.put(number,hashMap.get(number)+1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<Integer,Integer> entry:entries){
            if (entry.getValue()>1){
                System.out.println("Dupicate Element :"+entry.getKey()+" : "+entry.getValue());
            }
        }
    }
}
