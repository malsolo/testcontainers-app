package com.malsolo.testcontainers;

import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        System.out.println( "Hello World!" );

    	Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    	   .filter(i -> i % 2 == 0)
    	   .map(i -> String.format("Number %d", i))
    	   .forEach(System.out::println);
    }
}
