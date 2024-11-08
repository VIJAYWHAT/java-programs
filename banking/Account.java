package banking;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Account {

    private User user;

    public Account(User user) {
        this.user = user;
    }

    public void checkBalance() {
        System.out.print("\033\143"); // for clear console
        System.out.println("Current Balance: $" + GetAcBalance());
    }

    public void viewProfile() {
        bankApp.cls();
        System.out.println("===================");
        System.out.println("***** Profile *****");
        System.out.println("===================\n");
        System.out.println("User Name: " + user.getUserName());
        System.out.println("Account no: " + user.getAccountNo());
        System.out.println("Current Balance: $" + GetAcBalance());
    }

    public void printStatement() {
        bankApp.cls();
        try (BufferedReader reader = new BufferedReader(new FileReader("banking/ac_statements/" + user.getAccountNo() + ".txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }       
    }

    public float GetAcBalance() {

        float balance = 0.0f;
        try (BufferedReader reader = new BufferedReader(new FileReader("banking/ac_statements/" + user.getAccountNo() + ".txt"))) {
            String line;
            String balanceStr = null;


            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\s+"); 
                if (tokens.length > 0) {
                    balanceStr = tokens[tokens.length - 1];
                }
            }

            if (balanceStr != null) {
                balance = Float.parseFloat(balanceStr);
            }

        } catch (IOException e) {
            System.err.println("Error reading account statement: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid balance format in the file.");
        }
        
        return balance;
    }
    

}
