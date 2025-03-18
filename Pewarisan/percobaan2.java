abstract class Bentuk {
    public abstract double getLuas();
}

class Lingkaran extends Bentuk {
    private double r;
    public Lingkaran(double r){
        this.r = r;
    }
    public double getR(){
        return r;
    }
    public double getLuas(){
        return 3.14 * r * r;
    }
}

class Persegipanjang extends Bentuk {
    private double p;
    private double l;
    public Persegipanjang(double p, double l){
        this.p = p;
        this.l = l;
    }
    public double getpanjang(){
        return p;
    }
    public double getlebar(){
        return l;
    }
    public double getLuas(){
        return p * l;
    }
}

class Segitiga extends Bentuk {
    private double a;
    private double t;
    public Segitiga(double a, double t){
        this.a = a;
        this.t = t;
    }
    public double getAlas(){
        return a;
    }
    public double getTinggi(){
        return t;
    }
    public double getLuas(){
        return 0.5 * a * t;
    }
}

public class percobaan2 {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(10);
        Persegipanjang p = new Persegipanjang(5, 4);
        Segitiga s = new Segitiga(6, 7);
        Bentuk b[] = new Bentuk[10];

        b[0] = new Lingkaran(Math.random() * 10);
        double luaslingkaran = b[0].getLuas();
        System.out.println("Luas Lingkaran : " + luaslingkaran);

        System.out.println("Luas Lingkaran : " + l.getLuas());
        System.out.println("Luas Persegi Panjang : " + p.getLuas());
        System.out.println("Luas Segitiga : " + s.getLuas());
    }
}