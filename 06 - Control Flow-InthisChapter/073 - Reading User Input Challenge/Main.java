import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double mySum = getInputFromScanner();
    System.out.println(mySum);
    }
    public static double getInputFromScanner(){
        Scanner scanner = new Scanner(System.in);


        double getNumber = 0;
        double getDoubleData = 0d;
        try{
        for(int i =0; i<5; i++){
            System.out.println("Enter 5 valid numbers #"+ (i+1)+":");
            getDoubleData = Double.parseDouble(scanner.nextLine());
            if (checkValidity(getDoubleData)){
                getNumber  = getNumber + getDoubleData;
            }
             else{
                 System.out.println("Invalid number");
                 break;
            }
        }
        } catch (NumberFormatException e){
            System.out.println("Invalid number");
        }
        return getNumber;
    }

    public static boolean checkValidity(Object myObject) {
        return myObject instanceof Double;
    }
}
