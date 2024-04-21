public class Hello {
    public static void main(String[] args) {
        System.out.println("hello Sabbir");
        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is not an Alien");
        }
        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myMultiplication = (myFirstDouble+mySecondDouble)*100d;
        double myReminder = myMultiplication %40.00d;
        System.out.println("the reminder"+myReminder);
        boolean myBoolean = (myReminder==0.0) ? true : false;
        System.out.println(myBoolean);
        if(!myBoolean){
            System.out.println("Got some reminder");
        }
    }
}
