package percobaan3;
import java.io.*;

public class percobaan8_3 {
    public static void main(String[] args) {
        FileInputStream finput = null;
        FileOutputStream foutput = null;
        int data;

        try {
            finput = new FileInputStream("d:/file1.txt");
        } catch (FileNotFoundException fnfe) {
            System.out.println("File tidak ditemukan");
            return;
        }
        try {
            foutput = new FileOutputStream("d:/file2.txt");
        } catch (FileNotFoundException fnfe) {
            System.out.println("File tidak terbentuk");
            return;
        }

        try {
            while ((data = finput.read()) != -1){
                foutput.write(data);
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            return;
        }

        try {
            finput.close();
            foutput.close();
        } catch (IOException ioe) {}
    }    
}
