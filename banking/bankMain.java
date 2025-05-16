package banking;
import java.io.Serializable;
import java.util.Scanner;
import java.util.ArrayList;
import banking.bankApp;
import banking.User;
import banking.Account;


public class bankMain {
    public static void main(String[] args) {
        
        new bankApp();
        bankApp.welcome();
        bankApp.login();
       
    }
}
