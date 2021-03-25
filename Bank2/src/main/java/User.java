public class User {


    public String accountNumber;
    private double balance;
    public String name;
    public int userID;

    public User(String accountNumber, double balance, String name, int userID) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.userID = userID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;


    }

}
