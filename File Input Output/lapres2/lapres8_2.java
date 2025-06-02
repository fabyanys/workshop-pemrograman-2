package lapres2;

import java.io.File;

public class lapres8_2 {
    public static void main(String[] args) {
        // Tentukan nama dan path file yang ingin dihapus
        File file = new File("contoh.txt"); // Bisa diganti dengan path lengkap seperti "D:\\folder\\file3.txt"

        // Cek apakah file ada dan coba hapus
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File berhasil dihapus.");
            } else {
                System.out.println("File tidak bisa dihapus.");
            }
        } else {
            System.out.println("File tidak ditemukan.");
        }
    }
}
