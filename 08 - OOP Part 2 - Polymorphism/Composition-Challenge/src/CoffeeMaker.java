public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker() {

    }


    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }


    public void brewCoffee(){
        if (hasWorkToDo==true){
        System.out.println("Coffee maker is done");
        hasWorkToDo = false;

        } else {
            System.out.println("Coffee maker is not done");
        }
    }

}
