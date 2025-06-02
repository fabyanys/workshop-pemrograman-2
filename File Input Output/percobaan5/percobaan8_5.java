package percobaan5;
import java.io.*;

public class percobaan8_5 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile berkas = null;
        berkas = new RandomAccessFile("abc.dat", "rw");
        berkas.writeBytes("ABCDEFGHIJKLMNOPQRSTUVW");
        char kar;

        berkas.seek(0);
        System.out.println("Isi berkas : ");
        while (berkas.getFilePointer() < berkas.length()){
            kar = (char) berkas.readByte();
            System.out.println(kar);
        }
        System.out.println("");

        berkas.seek(3);
        berkas.writeByte((int) 'Z');

        System.out.println("Sesudah penggantian");

        berkas.seek(0);
        System.out.println("Isi Berkas");
        while (berkas.getFilePointer() < berkas.length()) {
            kar = (char) berkas.readByte();
            System.out.println(kar);
        }
    }    
}
