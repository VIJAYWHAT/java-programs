import java.util.*;

public class captcha {

    public static void main(String[] args) {
        
        Random random = new Random();
        String character = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder Captcha = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 6; i++){
            int index = random.nextInt(character.length());
            Captcha.append(character.charAt(index));
        }

        System.out.println("captcha: " + Captcha);

        System.out.print("Enter Captcha: ");
        String valid = sc.nextLine();

        if (valid.equals(Captcha.toString())) {
            System.out.println("Captcha is correct!");
        }
        else{
            System.out.println("Incorrect captcha! Try again");
        }

    }
}
