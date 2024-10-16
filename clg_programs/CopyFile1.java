package clg_programs;

import java.io.*;

public class CopyFile1 {
    public static void main(String args[]) throws IOException {
       
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("java.txt");
            out = new FileWriter("arun.txt");
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
        }
    }
}
