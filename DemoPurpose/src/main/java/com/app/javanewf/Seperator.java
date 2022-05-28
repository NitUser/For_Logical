package com.app.javanewf;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Seperator {
    public static void main(String[] args) {

        //Spliterator of string
        String[] strings={"java","python","dotNet","scala","kotlin"};
        Spliterator<String> spliterator = Arrays.spliterator(strings);
        for(int i=0;i<strings.length;i++){
           // System.out.println(strings[i]);
        }
        //Spliterator of list
        List<String> list = Arrays.asList("java", "python", "dotNet", "scala", "kotlin");
        Spliterator<String> spliterator1 = list.spliterator();
        //System.out.println(spliterator1);
        //Spliterator of stream
        Stream<String> javastream = Stream.of("java", "python", "dotNet", "scala", "kotlin");
        javastream.spliterator();
    }
}
