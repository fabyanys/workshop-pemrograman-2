import java.util.Scanner;

public class percobaan6_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        do { 
            try {
                System.out.print("Masukkan username: ");
                username = scanner.nextLine();
                if (username.matches("[a-zA-Z0-9]+")) {
                    System.out.println("Username valid!");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Error: Username tidak valid. Silakan masukkan username yang hanya mengandung huruf dan angka.");
                scanner.reset();
            }
        } while (true);
        System.out.println("Username OK: " + username);
    }
}
