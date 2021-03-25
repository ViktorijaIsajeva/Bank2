public class Bank {

    private User user;
    public String setActiveUser(User user){
        this.user = user;
        return "user updated ";
    }

    public double getUserBalance() {
        return user.getBalance();
    }
    public String debitUser(double amount){
        double newBalance = user.getBalance() - amount;
        this.user.setBalance(newBalance);
        return amount  + " EUR was deducted from your balance";
    }

}