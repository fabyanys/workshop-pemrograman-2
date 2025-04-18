package percobaan5;

public class percobaan6_5 {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"A", "B", "C"};
        try {
            System.out.println(bil / 0);
        } catch (ArithmeticException ai) {
            System.out.println("Pesan dari getMessage():");
            System.out.println(ai.getMessage());
        } finally {
            System.out.println("Blok finally dijalankan");
        }
    }
}
