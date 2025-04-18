package percobaan4;

public class percobaan6_4 {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"A", "B", "C"};
        try {
            System.out.println(bil / 0);
            System.out.println(b[3]);
        } catch (ArithmeticException ai) {
            System.out.println("Error aritmetik");
        } catch (ArrayIndexOutOfBoundsException n) {
            System.out.println("Indeks array di luar batas");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan");
        }
    }
}
