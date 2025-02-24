import java.util.Scanner;

public class pendahuluan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.err.println("Kalkulator Luas Lingkaran");
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();
        double luas = Math.PI * Math.pow(jariJari, 2);

        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah " + luas);
    }
}