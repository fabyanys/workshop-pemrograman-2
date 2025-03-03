class Mahasiswa {
    private int nrp;
    private String nama;
    public void setNrp(int i) {
        nrp = i;
    }
    public void setNama(String i) {
        nama = i;
    }
    public int getNrp() {
        return nrp;
    }
    public String getNama() {
        return nama;
    }
}

public class percobaan2 {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNrp(7206);
        mhs.setNama("ali ridho");
        System.out.println("Nama Mahasiswa " + mhs.getNama() + " NRP " + mhs.getNrp());
    }
}