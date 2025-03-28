class PENS{
    private String nama;
    private int NRP;
    public PENS(String nama, int NRP){
        this.nama = nama;
        this.NRP = NRP;
    }
    public void info(){
        System.out.println("Nama : " + nama);
        System.out.println("NRP : " + NRP);
    }
}

class Telkom extends PENS{
    private String matkul;
    public Telkom(String nama, int NRP, String matkul){
        super(nama, NRP);
        this.matkul = matkul;
    }
    public void info(){
        super.info();
        System.out.println("Prodi : " + matkul);
    }
}

class TRI extends PENS{
    private String matkul;
    public TRI(String nama, int NRP, String matkul){
        super(nama, NRP);
        this.matkul = matkul;
    }
    public void info(){
        super.info();
        System.out.println("Prodi : " + matkul);
    }
}

public class percobaan3 {
    public static void main(String[] args) {
        Telkom t = new Telkom("Andi", 062, "Elektromagnetika");
        TRI tr = new TRI("Budi", 124, "Matematika");
        t.info();
        tr.info();
    }
}