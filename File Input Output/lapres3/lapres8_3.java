package lapres3;

import java.io.File;

public class lapres8_3 {
    public static void main(String[] args) {
        // Tentukan nama dan lokasi direktori
        File direktoriBaru = new File("FolderBaru"); // Bisa juga: new File("D:\\data\\FolderBaru")

        // Coba buat direktori
        if (direktoriBaru.mkdir()) {
            System.out.println("Direktori berhasil dibuat: " + direktoriBaru.getAbsolutePath());
        } else {
            System.out.println("Gagal membuat direktori. Mungkin sudah ada.");
        }
    }
}

