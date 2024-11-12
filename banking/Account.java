package banking;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Account {

    private User user;
    Scanner sc = new Scanner(System.in);

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
    
    public void deposit(int ac_no) {
        
        bankApp.cls();
        System.out.print("Enter the amount you want to deposit: ");
        int amount = sc.nextInt();
        bankApp.cls();

        System.out.print("Are you sure want to deposit: " + amount + "? (y/n): ");
        char c = sc.next().charAt(0);

        if(c == 'y' || c == 'Y') {
            int balance = (int) GetAcBalance() + amount;
            boolean deposited = bankApp.depositPrint(ac_no, amount, balance);
            if (deposited) {
                System.out.println("Amount deposited successfully");
            }
            else
                System.out.println("Deposit failed");
        }
        else
            System.out.println("Deposit cancelled");

    }

    public void Withdraw(int ac_no) {
        bankApp.cls();
        int Trypass = 0;
        System.out.println("Your balance: " + GetAcBalance());
        System.out.print("Enter the amount you want to withdraw: ");
        int amount = sc.nextInt();
    
        if (amount <= GetAcBalance()) {
            bankApp.cls();
            System.out.print("Are you sure you want to withdraw " + amount + "? (y/n): ");
            char ch = sc.next().charAt(0);
    
            if (ch == 'y' || ch == 'Y') {

                boolean authenticated = false;
                
                while (Trypass < 4 && !authenticated) {
                    System.out.println("Enter your password: ");
                    String password = sc.next();
                    
                    if (password.equals(user.getPassword())) {
                        authenticated = true;
                    } else {
                        Trypass++;
                        System.out.println("Password Wrong! Try again...");
                        if (Trypass == 4) {
                            System.out.println("You have exceeded the number of attempts!!!");
                            return;
                        }
                    }
                }
    
                if (authenticated) {
                    int balance = (int) (GetAcBalance() - amount);
                    boolean withdrawn = bankApp.WithdrawalPrint(ac_no, amount, balance);
                    if (withdrawn) {
                        System.out.println("Withdrawal Successful");
                        System.out.println("Your current balance: $" + balance);
                    } else {
                        System.out.println("Withdrawal Failed");
                    }
                }
            } else {
                System.out.println("Withdraw Cancelled");
            }
        } else {
            System.out.println("Insufficient balance");
        }
    }
    

}
