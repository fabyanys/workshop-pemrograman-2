package lapres1;

import java.io.File;
import java.io.IOException;

public class lapres8_1 {
    public static void main(String[] args) {
        try {
            // Tentukan nama dan lokasi file yang ingin dibuat
            File fileBaru = new File("contoh.txt");

            // Cek apakah file sudah ada
            if (fileBaru.createNewFile()) {
                System.out.println("File berhasil dibuat: " + fileBaru.getAbsolutePath());
            } else {
                System.out.println("File sudah ada.");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membuat file.");
            e.printStackTrace();
        }
    }
}
