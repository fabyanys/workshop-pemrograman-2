package percobaan6;

interface BangunDatar {
    public double hitungLuas();
}

class Segitiga implements BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }
}

class PersegiPanjang implements BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
}

public class percobaan5_6 {
    public static void main(String[] args) {
        Segitiga s = new Segitiga(10, 5);
        PersegiPanjang pp = new PersegiPanjang(3, 4);

        System.out.println("Luas Segitiga: " + s.hitungLuas());
        System.out.println("Luas PersePersegiPanjang " + pp.hitungLuas());
    }
}
