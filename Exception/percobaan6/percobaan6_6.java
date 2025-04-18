package percobaan6;

public class percobaan6_6 {
    static void demo() {
        NullPointerException t;
        t = new NullPointerException("Coba Throw");
        throw t;
    }
    public static void main(String[] args) {
        try {
            demo();
            System.out.println("Selesai");
        } catch (NullPointerException ex) {
            System.out.println("Saya tangkap sinyal " + ex);
        }
    }
}
