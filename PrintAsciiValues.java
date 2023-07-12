public class PrintAsciiValues {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("This is ASCII value for A to Z \n" );

        for (char ch = 'A'; ch <= 'Z'; ch++){
            int asciiValue = (int) ch;
            System.out.println("Character:" + ch + ", ASCII Value: " + asciiValue);
        }
        System.out.println("\n");
        System.out.println("This is ASCII value for a to z \n" );

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int asciiValue = (int) ch;
            System.out.println("Character: " + ch + ", ASCII Value: " + asciiValue);
        }
        
    }
}