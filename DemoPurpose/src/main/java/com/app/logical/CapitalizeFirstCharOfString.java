package com.app.logical;

import java.util.Locale;

public class CapitalizeFirstCharOfString {
    public static void main(String[] args) {
        String str = "learning is a great things";
        System.out.println(chapitalizeFirstOfString(str));

    }

    public static String chapitalizeFirstOfString(String str) {
        if (str.isEmpty() || str == null) {
            return str;
        } else {
            return str.substring(0,1).toUpperCase()+str.substring(1);
        }
    }
}
