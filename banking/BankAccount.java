package banking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BankAccount {

    public static boolean depositPrint(int acNo, int amount) {

        int balance = balanceCheck(acNo) + amount;

        String currentDate = getCurrentDate();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("banking/ac_statements/" + acNo + ".txt", true))) {

            writer.write(String.format("%s\tDeposit\t\t    Credit\t\t%d  \t    %d%n", currentDate, amount, balance));
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

    private static int balanceCheck(int acNo) {
        return 10000;
    }

    public static void main(String[] args) {
        int accountNumber = 127101234;
        int depositAmount = 5500;

        boolean success = depositPrint(accountNumber, depositAmount);
        if (success) {
            System.out.println("Transaction successfully recorded.");
        } else {
            System.out.println("Failed to record the transaction.");
        }
    }
}
