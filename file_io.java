import java.io.*;

public class file_io {
    public static void main(String args[]) throws IOException {
       
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("java.txt");
            out = new FileWriter("copy.txt");
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
