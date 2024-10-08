import java.util.Random;

public class RandomStringGenerator {

    public String getRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        RandomStringGenerator random = new RandomStringGenerator();
        String randomString = random.getRandomString(6);
        System.out.println("Random String: " + randomString);
    }
}
