import java.util.*;

public class captcha {

    public static void main(String[] args) {
        
        RandomStringGenerator random = new RandomStringGenerator();
        Scanner sc = new Scanner(System.in); 
        boolean isCaptchaCorrect = false;

        while (!isCaptchaCorrect) {
            
            String Captcha = random.getRandomString(6);
            
            System.out.println("captcha: " + Captcha);

            System.out.print("Enter Captcha: ");
            String valid = sc.nextLine();

            if (valid.equals(Captcha)) {
                System.out.println("Captcha is correct!");
                isCaptchaCorrect = true;
            }
            else{
                System.out.println("Incorrect captcha! Try again");
            }
        }
        sc.close();
    }
}