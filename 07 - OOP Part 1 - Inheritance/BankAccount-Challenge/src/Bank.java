public class Bank {
    private int accountNumber;
    private double accountBalance=0;

    private String customerName;

    private String email;

    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDepositFund(double dipositeAmount){
        this.accountBalance = this.accountBalance + dipositeAmount;
    }

    public  void setWithdrawFund(double withdrawAmount){
        if (this.accountBalance - withdrawAmount >= 0) {
            this.accountBalance = this.accountBalance - withdrawAmount;
        }
    }
}
