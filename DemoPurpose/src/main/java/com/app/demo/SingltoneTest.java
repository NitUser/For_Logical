package com.app.demo;

public class SingltoneTest {
    public static void main(String[] args) {
        DoubleCheckingForSingletone first=DoubleCheckingForSingletone.get_instance();
        DoubleCheckingForSingletone second=DoubleCheckingForSingletone.get_instance();
        System.out.println("First object hash code :"+first.hashCode());
        System.out.println("Second object hash code :"+second.hashCode());
    }
}
