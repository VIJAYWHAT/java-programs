package banking;
import java.io.Serializable;

public class User implements Serializable {

    private int accountNo;
    private String userName;
    private String password;
    private static double balance;
    
        public User(int accountNo, String userName, String password) {
            this.accountNo = accountNo;
            this.userName = userName;
            this.password = password;
        }
        
        public int getAccountNo() { return accountNo; }
        public String getUserName() { return userName; }
        public String getPassword() { return password; }
        public double getBalance() { return balance; }
    
        public static void setBalance(double Balance) {  balance = Balance; }
    
}
