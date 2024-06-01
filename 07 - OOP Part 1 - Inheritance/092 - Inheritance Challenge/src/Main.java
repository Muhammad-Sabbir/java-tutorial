public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "1985-08-30", "2003-01-01");
        System.out.println(tim.getAge());

        SalariedEmployee joe = new SalariedEmployee("Tim", "1985-08-30", "2003-01-01", 39000);
        joe.terminate("2020-01-01");
        System.out.println(joe.collectPay());


        HourlyEmployee mary = new HourlyEmployee("Mary", "1985-08-30", "2003-01-01", 30);

        System.out.println(mary.getDoublePay());
        System.out.println(mary.collectPay());
    }
}
