public class Main {
    public static void main(String[] args) {
        Bank sabbir = new Bank();
        sabbir.setCustomerName("Sabbir");
        sabbir.setAccountNumber(101);
        sabbir.setPhoneNumber("+8801790909090");
        sabbir.setEmail("example@email.com");
        sabbir.setAccountBalance(900000000000d);

        System.out.println(sabbir.getAccountBalance());
    }
}
