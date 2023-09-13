package com.demo;
import java.util.Arrays;

public class WorkingWithArrays {

    public static void main(String[] args) {
        System.out.println("---------------- String Array ------------ ");
        String[] colors = new String[5];

        colors[0] = "purple";
        colors[1] = "blue";
        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);

        colors[2] = "yellow";
        System.out.println(Arrays.toString(colors));

        System.out.println("---------------- Integer Array ------------ ");
        int[] numbers = new int[2];
        numbers[0] = 100;
        numbers[1] = 200;
        System.out.println(Arrays.toString(numbers));

        /** Normal For loop  */
        System.out.println("---------------- Normal For Loop ------------ ");
        for (int i =0; i<colors.length; i++){

            System.out.println(colors[i]);
        }
        /** Enhance For loop */
        System.out.println("---------------- Enhance For loop ------------ ");
        for (String color: colors){
            System.out.println(color);
        }
        /** Enhance For By Using Stream */
        System.out.println("---------------- Stream For loop ------------ ");
        Arrays.stream(colors).forEach(System.out::println);

        /** Binary Search*/
        int value = Arrays.binarySearch(colors,"yellow");
        System.out.println(value);
    }
}
