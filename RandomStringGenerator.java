import java.util.Random;

public class RandomStringGenerator {

    public static String getRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            System.out.println("i : " + i);
            int index = random.nextInt(characters.length());
            System.out.println("index: " + index);
            System.out.println("character: " +characters.charAt(index));
            result.append(characters.charAt(index));
            System.out.println("result: " + result);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String randomString = getRandomString(10);
        System.out.println("Random String: " + randomString);
    }
}
