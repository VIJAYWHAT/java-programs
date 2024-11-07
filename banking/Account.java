package banking;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Account {

    private User user;

    public Account(User user) {
        this.user = user;
    }

    public void checkBalance() {
        System.out.print("\033\143"); // for clear console
        System.out.println("Current Balance: $" + user.getBalance());
    }

    public void viewProfile() {
        bankApp.cls();
        System.out.println("===================");
        System.out.println("***** Profile *****");
        System.out.println("===================\n");
        System.out.println("User Name: " + user.getUserName());
        System.out.println("Account no: " + user.getAccountNo());
        System.out.println("Current Balance: $" + user.getBalance());
    }

    public void printStatement() {
        try(BufferedReader reader = new BufferedReader(new FileReader(user.getAccountNo() + ".txt"))) {
            String line;
            System.out.println("Transaction statement: ");
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("Error reading statement: " + e.getMessage());
        }
    }
    

}
