package dev.lpa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World again");
        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);


        System.out.println("Variable Args");
        String[] splitStringsVarArgs = "Variable Args".split(" ");
        printText(splitStringsVarArgs);


        System.out.println("_".repeat(20));
        printTextVariableArgs("Hello", "Sabbir", "!!!!");
        System.out.println("_".repeat(20));
        printTextVariableArgs();

        String[] sArray = {"first","second","third","fourth","fifth"};
        System.out.println(String.join(",", sArray));


        printTextVariableArgs(splitStrings);

    }
    private static void printText(String[] textList){
        for(String t : textList){
            System.out.println(t);
        }
    }

    private static void printTextVariableArgs(String... textList){
        for(String t : textList){
            System.out.println(t);
        }
    }
}
