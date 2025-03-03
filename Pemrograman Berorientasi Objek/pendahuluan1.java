class Siswa {
    int nrp;
    public void setNrp(int i) {
        nrp = i;
    }
}

public class pendahuluan1 {
    public static void main(String[] args) {
        Siswa anak = new Siswa();
        anak.setNrp(5);
        System.out.println(anak.nrp);
    }
}