package dev.lpa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayChalenge {
    public static void main(String[] args) {
        Random arraySizeRandom = new Random();
        int arraySize = arraySizeRandom.nextInt(5, 50);
        Random randomElement = new Random();
        int[] newInt = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            newInt[i] = randomElement.nextInt(1, 100);
        }
//        int[] newInt = {200, 57, 96, 72, 100, 40};
        System.out.print("before newInt array: ");
        System.out.println(Arrays.toString(newInt));

        int[] sortArray = new int[newInt.length];
        int[] indexArray = new int[newInt.length];


        for (int t = 0; t < indexArray.length; t++) {
            indexArray[t] = -1;
        }

        System.out.print("before index array: ");
        System.out.println(Arrays.toString(indexArray));

        for (int i = 0; i < newInt.length; i++) {
            int highestNumber = 0;
            int index = 0;
            for (int j = 0; j < newInt.length; j++) {
                boolean get = false;
                for(int indEl: indexArray){
                    if(j == indEl){
                        get = true;
                    }
                }
                if(get){
                    continue;
                }
                if (newInt[j] >= highestNumber){
                highestNumber = newInt[j];
                index = j;
                }
            }
            sortArray[i]= highestNumber;
            indexArray[i]= index;
        }
        System.out.println(Arrays.toString(sortArray));

    }
}