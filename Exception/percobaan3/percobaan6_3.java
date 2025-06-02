package percobaan3;

public class percobaan6_3 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println("Hasil bagi: " + (bil / 0));
        } catch (ArithmeticException ai) {
            System.out.println("Error aritmetik");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan");
        }
    }
}
