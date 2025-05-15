import java.io.*;

public class json {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("sample.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch); // Print each character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 }