import java.io.*;

public class percobaan8_1 {
    public static void main(String[] args) {
        FileInputStream finput = null;
        int data;

        try {
            finput = new FileInputStream("file.txt");
        } catch (FileNotFoundException fnfe) {
            System.out.println("File tidak ditemukan");
            return;
        }

        try {
            while ((data = finput.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage() );
        }

        try {
            finput.close();
        } catch (IOException ioe) {}
    }
}