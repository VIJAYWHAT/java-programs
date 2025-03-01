import java.io.*;

public class file_io {
    public static void main(String args[]) throws IOException {
       
        FileReader in = new FileReader("java.txt");
        FileWriter out = new FileWriter("copy.txt");

        try {
            
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }

        } finally {
            // Ensuring resources are closed
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
            System.out.println("File copied successfully.");
        }
    }
}
