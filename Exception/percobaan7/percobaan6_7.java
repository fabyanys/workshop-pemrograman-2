import java.util.Scanner;

public class percobaan6_7 {
    public static void main(String[] args) {
        int Y = 100;
        boolean valid = true;
        int Bagi, angka = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            try{
                System.out.print("Masukkan angka : ");
                angka = scanner.nextInt();
                if (angka == 0) {
                    throw new ArithmeticException();
                } else {
                    valid = true;
                }
            } catch (ArithmeticException e) {
                System.out.println("Tidak Bisa dibagi dengan 0");
                scanner.nextLine();
                valid = false;
            } catch (Exception e) {
                System.out.println("Input harus berupa angka");
                scanner.nextLine();
                valid = false;
            } 
        } while (!valid);

        Bagi = Y / angka;
        System.out.println("Hasil bagi " + Y + " / " + angka + " = " + Bagi);
        System.out.println("Data sudah benar");
    }
}
