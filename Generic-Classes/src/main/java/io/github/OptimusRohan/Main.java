package io.github.OptimusRohan;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static int add(int a, int b) {
        return a+b;
    }
    public static double add(double a, double b) {
        return a+b;
    }

    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 6;
        Integer c = a+b;
        System.out.println(c);
        List<Integer> intArray = new ArrayList<>();
        intArray.add(12);
        intArray.add(76);

        Integer boxedInt = 5;
        Character boxedChar = 'a';
        Boolean boxedBool = true;
        Long boxedLong = 100L;
        Double boxedDouble = 5.67;
        Float boxedFloat = 43.2f;
        Short boxedShort = 4;
        Byte boxedByte = 2;

        List<String> stringArray = new ArrayList<>();
        stringArray.add("First");
        stringArray.add("Second");

        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}