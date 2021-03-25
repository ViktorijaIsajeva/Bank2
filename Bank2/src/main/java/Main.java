import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User user = new User("498593485", 100, "Good Potato", 321);
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        bank.setActiveUser(user);
        bank.getUserBalance();

        System.out.println("Welcome ");
        System.out.println("Enter your ID ");
        int userID = scanner.nextInt();

        String giveMeMore = "";

        if (userID != 321) {
            System.out.println("Sign in failed");
        } else {
            System.out.println("Welcome, " + user.name);
            System.out.println("Current balance is " + user.getBalance() + " euros\n");

            do {
                Scanner amount = new Scanner(System.in);
                System.out.println("Enter amount to withdraw ");
                int response = amount.nextInt();

                String response1 = bank.debitUser(response);
                System.out.println(response1);
                System.out.println("Current balance " + bank.getUserBalance());

                if (bank.getUserBalance() <= 0) {
                    System.out.println("Insufficient balance");
                    break;
                }

                System.out.println("Enter OK ");
                giveMeMore = amount.next();

            } while (giveMeMore.equalsIgnoreCase("OK"));
        }
    }
}
