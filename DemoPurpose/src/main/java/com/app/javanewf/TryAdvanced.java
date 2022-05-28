package com.app.javanewf;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class TryAdvanced {
    public static void main(String[] args) {
        //Stream strings= Stream.of("java","python","dotNet","scala","kotlin");
        List<String> strings= Arrays.asList("java","python","dotNet","scala","kotlin");
        Spliterator spliterator = strings.spliterator();
        spliterator.tryAdvance(System.out::println);
        spliterator.tryAdvance(System.out::println);
    }
}
