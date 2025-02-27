import java.util.Scanner;

public class percobaan3b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jam, menit, detik, totdet;
        System.out.print("Masukkan Jam : ");
        jam = input.nextInt();
        System.out.print("Masukkan Menit : ");
        menit = input.nextInt();
        System.out.print("Masukkan Detik : ");
        detik = input.nextInt();

        totdet = (jam * 3600) + (menit * 60) + detik;
        System.out.println("Total detik: " + totdet);
    }
}