package banking;
import java.util.ArrayList;
import java.util.Scanner;
public class bankApp {
    public static ArrayList<User> users = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void initializeUsers() {
        users.add(new User(127101234, "Vijay", "vijay@123", 5000));
        users.add(new User(127102345, "Gopi", "gopi@123", 4000));
        users.add(new User(127103456, "Ram", "ram@123", 2500));
        users.add(new User(127104567, "Hari", "hari@123", 1000));
    }

    public static void welcome() { 
        System.out.println("===========================================");
        System.out.println("\tWelcome to Banking App");
        System.out.println("===========================================");
        initializeUsers();
    }

    public static void login() {
        int attempts = 0;
        while (attempts < 4) {
            System.out.print("Enter UserName: ");
            String username = scanner.next();
            System.out.print("Enter Password: ");
            String password = scanner.next();

            User user = findUser(username, password);
            if(user != null) {
                cls(); // for clear console
                System.out.println("Login successful");
                userDetails(user);
                return;
            } else {
                System.out.println("Invalid creadentials, try again!");
                attempts++;
            } 
        }
        System.out.println("Maximum attempts exceeded.");
    }
    
    private static User findUser(String username, String password) {
        for (User user : users) {
            if(user.getUserName().equals(username) && user.getPassword().equals(password))
                return user;
        }
        return null;
    }
    
    public static void userMenu() {
            System.out.println("\n--- User Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. View Profile");
            System.out.println("3. Print Statement");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
    }

    private static void userDetails(User user) {
        Account account = new Account(user);
        
        userMenu();
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> account.checkBalance();
            case 2 -> account.viewProfile();
            case 3 -> account.printStatement();

            default -> System.out.println("Invalid choice, please try again.");
        }
        cont_check(user);
    }

    private static void cont_check(User user) {
        System.out.print("\nContinue (C)/ Logout(L): ");
        char cont = scanner.next().charAt(0);
        if (cont == 'C' || cont == 'c') {
            cls();
            userDetails(user);
        }
        else if(cont == 'L' || cont == 'l')
            logout();
        else {
            System.out.println("Invalid choice, please try again.");
            cont_check(user);
        }
    }

    private static void logout() {
        cls();
        System.out.println("\nYou have successfully logged out.");
        System.out.print("\nLogin(Y) / Exit(N): ");
        char c = scanner.next().charAt(0);
        
        if(c == 'Y' || c == 'y'){
            cls();
            login();
        }
        else{
            cls();
            System.out.println("Thank you for using our services.\n");
            return;
        }
    }

    public static void cls() {
        System.out.print("\033\143"); // clear console
    }

}
