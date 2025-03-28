abstract class hewan {
    protected String nama;
    protected String bunyi;
    public abstract void suara();
}

class kucing extends hewan {
    public kucing() {
        this.nama = "mili";
        this.bunyi = "meong";
    }
    public void suara() {
        System.out.println(nama + " bersuara : " + bunyi);
    }
}

class beo extends hewan {
    public beo() {
        this.nama = "beoku";
        this.bunyi = "halo";
    }
    public void suara() {
        System.out.println(nama + " bersuara : " + bunyi);
    }
}

public class tugas1 {
    public static void main(String[] args) {
        hewan k = new kucing();
        hewan b = new beo();
        k.suara();
        b.suara();
    }
}
