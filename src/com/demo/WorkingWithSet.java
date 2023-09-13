package com.demo;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSet {
    /** VALUE CAN NOT DUPLICATE */
    public static void main(String[] args) {
        Set<Ball> ball = new HashSet<>();
        ball.add(new Ball("red"));
        ball.add(new Ball("blue"));
        ball.add(new Ball("purple"));
        ball.add(new Ball("yellow"));
        ball.add(new Ball("yellow"));

        System.out.println(ball.size());
        ball.forEach(System.out::println);
    }

    record Ball(String color){}
}
