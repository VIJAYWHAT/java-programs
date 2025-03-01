import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class stream_io {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("java.txt");
            FileOutputStream output = new FileOutputStream("output.txt")) {
            int data;

            while ((data = input.read()) != -1) {
                output.write(data);
            }
            System.out.println("File copied successfully using Byte Streams!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
