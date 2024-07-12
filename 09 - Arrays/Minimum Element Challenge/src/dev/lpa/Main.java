package dev.lpa;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
    int[] getIntArray = readIntegers();
    System.out.println(Arrays.toString(getIntArray));

    int lowestNumber = findMin(getIntArray);
    System.out.println(lowestNumber);

    }

    private static int[] readIntegers(){
//        int[] myarray={1,2,3,4,5,6,7};
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your numbers separated with comma : ");
        String s = in.nextLine();

        String[] myStrArray= s.split(",");

//        System.out.println(myStrArray[0].getClass().getName());
//        System.out.println(Integer.parseInt(myStrArray[0]));

        int[] myIntArray = new int[myStrArray.length];

        for(int i = 0; i< myStrArray.length; i++){
            myIntArray[i] = Integer.parseInt(myStrArray[i]);
        }

        return myIntArray;
    }

    private static int findMin(int[] myIntArray ) {
        int lowestNumber = 0;
        for (int i = 0; i < myIntArray.length; i++) {
            if (i==0){
                lowestNumber = myIntArray[0];
            }
            if (myIntArray[i] <= lowestNumber){
                lowestNumber = myIntArray[i];
            }
        }
        return lowestNumber;
    }

}
