package banking;
import java.util.ArrayList;
import java.util.Scanner;
public class bankApp {
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
        while (attempts < 4) {
            System.out.print("Enter UserName: ");
            String username = scanner.next();
            System.out.print("Enter Password: ");
            String password = scanner.next();

            User user = findUser(username, password);
            if(user != null) {
                System.out.println("Login successful");
                userMenu();
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
    
    
   
}
