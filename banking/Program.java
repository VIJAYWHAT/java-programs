package banking;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        System.out.println("Balance: " + balanceCheck() );
    }

    public static float balanceCheck() {

        float balance = 0.0f;
        try (BufferedReader reader = new BufferedReader(new FileReader("banking/ac_statements/" + 127101234 + ".txt"))) {
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
            System.err.println("Invalid balance format.");
        }

        return balance;
    }
}
