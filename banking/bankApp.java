package banking;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public class bankApp extends Account {

    bankApp(){
        super(null);
    }
   
    public static ArrayList<User> users = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void initializeUsers() {
        users.add(new User(127101234, "Vijay", "vijay@123"));
        users.add(new User(127102345, "Gopi", "gopi@123"));
        users.add(new User(127103456, "Ram", "ram@123"));
        users.add(new User(127104567, "Hari", "hari@123"));
    }
     

    public static void welcome() { 
        System.out.println("===========================================");
        System.out.println("\tWelcome to Banking App");
        System.out.println("===========================================");
        initializeUsers();
    }

    public static void login() {
        int attempts = 0;
        while (attempts < 3) {
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
            case 4 -> account.deposit(user.getAccountNo());
            case 5 -> account.Withdraw(user.getAccountNo());

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

    public static boolean depositPrint(int acNo, int amount) {
        
        String currentDate = getCurrentDate();
        int balance = (int) GetAcBalance() + amount;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("banking/ac_statements/" + acNo + ".txt", true))) {

            writer.write(String.format("%s\tDeposit\t\t    Credit\t\t%d  \t    %d%n", currentDate, amount, balance));
            return true; 
        } catch (IOException e) {
            System.err.println("Error opening file: " + e.getMessage());
            return false; 
        }
    }

    public static boolean WithdrawalPrint(int acNo, int amount) {

        String currentDate = getCurrentDate();
        int balance = (int) GetAcBalance() - amount;
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("banking/ac_statements/" + acNo + ".txt", true))) {

            writer.write(String.format("%s\tWithdrawal\t    Debit\t\t%d  \t    %d\n", currentDate, amount, balance));
            return true; 
        } catch (IOException e) {
            System.err.println("Error opening file: " + e.getMessage());
            return false; 
        }
    }

    private static String getCurrentDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.now().format(formatter);
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
            System.exit(0);
        }
    }

    public static void cls() {
        System.out.print("\033\143"); // clear console
    }

}
