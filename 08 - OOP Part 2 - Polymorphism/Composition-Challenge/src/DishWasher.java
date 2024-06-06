public class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher( ) {

    }


    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }



    public void doDishes(){
        if (hasWorkToDo==true){

            System.out.println("Dish washer is done");
            hasWorkToDo = false;

        } else {
            System.out.println("Dish washer is not done");
        }
    }
}
