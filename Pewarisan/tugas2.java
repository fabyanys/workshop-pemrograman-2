class hewan {
    protected String nama;
    protected int umur;
    public void hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    public void info() {
        System.out.print(nama);
        System.out.print(" umur " + umur + " tahun ");
    }
}

class kucing extends hewan {
    private String bunyi;
    public kucing(String nama, int umur, String bunyi) {
        super.hewan(nama, umur);
        this.bunyi = bunyi;
    }
    public void info() {
        super.info();
        System.out.println("bersuara: " + bunyi);
    }
}

class beo extends hewan {
    private String bunyi;
    public beo(String nama, int umur, String bunyi) {
        super.hewan(nama, umur);
        this.bunyi = bunyi;
    }
    public void info() {
        super.info();
        System.out.println("bersuara: " + bunyi);
    }
}

public class tugas2 {
    public static void main(String[] args) {
        kucing k = new kucing("mili", 2, "meong");
        beo b = new beo("beoku", 3, "halo");
        k.info();
        b.info();
    }
}
