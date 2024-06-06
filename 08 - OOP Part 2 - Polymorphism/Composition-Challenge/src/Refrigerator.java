public class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator() {

    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if (hasWorkToDo==true){

            System.out.println("Refrigeration is done");
            hasWorkToDo = false;

        } else {
            System.out.println("Refrigeration is not done");
        }
    }
}
