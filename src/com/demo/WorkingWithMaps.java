package com.demo;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {

    /** Hash map - key mus be unique otherwise it will over-ride*/
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Joe"));
        map.put(3, new Person("Deo"));

        System.out.println(map);
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());

        map.entrySet()
                .forEach(x-> System.out.println(x.getKey()+" " + x.getValue()));

        map.forEach((key, person) ->{
            System.out.println(key + " - " + person);
        });
    }

    record Person(String name){}
}
