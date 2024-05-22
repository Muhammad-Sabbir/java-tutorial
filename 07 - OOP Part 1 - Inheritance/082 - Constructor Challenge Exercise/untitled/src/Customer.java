public class Customer {
    private String name;
    private double limit;
    private String email;

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getAddress() {
        return email;
    }

    public Customer(String name, double limit, String email){
        this.name = name;
        this.limit = limit;
        this.email = email;

    }

    public  Customer(){
        this("Sabbir","Uttarkhan");
    }

    public  Customer(String name, String email){
        this(name, 99, email);

    }
}
