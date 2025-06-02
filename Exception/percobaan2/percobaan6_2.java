package percobaan2;

public class percobaan6_2 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println("Hasil bagi: " + (bil / 0));
            System.out.println("Bilangan yang dibagi: " + bil);
        } catch (Exception e) {
            System.out.println("Terjadi pembagian dengan nol");
        }
    }
}
