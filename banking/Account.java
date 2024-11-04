package banking;

public class Account {

    private User user;

    public Account(User user) {
        this.user = user;
    }

    public void checkBalance() {
        System.out.print("\033\143"); // for clear console
        System.out.println("Current Balance: $" + user.getBalance());
    }
}
