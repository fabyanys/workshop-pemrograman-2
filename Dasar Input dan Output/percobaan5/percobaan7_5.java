package percobaan5;
import java.io.*;

public class percobaan7_5 {
    public static void main(String[] args) {
        int kar = 1;
        String st = "";
        boolean selesai = false;
        System.out.println("Ketikkan suatu kalimat");
        while (!selesai) {
                try {
                    kar = System.in.read();
                if (kar < -1 || kar == '\n') {
                    selesai = true;
                }
                st += (char) kar;
                
            } catch (IOException e) {
                System.out.println("Salah");
            }
        }
        System.out.println("String: " + st);
    }
}
