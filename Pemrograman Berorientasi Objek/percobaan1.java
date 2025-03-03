class Buku {
    String judul;
    String pengarang;
}

public class percobaan1 {
    public static void main(String[] args) {
        Buku a,b;
        a = new Buku();
        b = new Buku();

        a.pengarang = "Helga Anindya";
        a.judul = "Siaga Merah";

        b.pengarang = "David Noor";
        b.judul = "Siaga Hitam";

        System.out.println("Judul: " + a.judul + ", Pengarang: " + a.pengarang);
        System.out.println("Judul: " + b.judul + ", Pengarang: " + b.pengarang);
    }
}