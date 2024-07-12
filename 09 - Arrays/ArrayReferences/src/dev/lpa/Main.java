package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myNum = myInt(10);
        System.out.println(myNum);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        anotherArray[0] = 1;
        modifyArray(myIntArray);

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotehrArray = " + Arrays.toString(anotherArray));



    }
    public static int myInt(int a){
        return a+10;
    }

    private static void modifyArray(int[] array){
        array[1] = 2;
    }
}
