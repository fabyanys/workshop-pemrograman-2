import java.util.Scanner;

public class pendahuluan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis konversi:");
        System.out.println("1. Celcius ke Fahrenheit");
        System.out.println("2. Fahrenheit ke Celcius");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan suhu dalam Celcius: ");
            double celcius = input.nextDouble();
            double fahrenheit = (celcius * 9 / 5) + 32;
            System.out.println("Suhu dalam Fahrenheit: " + fahrenheit + " °F");
        } else if (pilihan == 2) {
            System.out.print("Masukkan suhu dalam Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celcius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Suhu dalam Celcius: " + celcius + " °C");
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }
}