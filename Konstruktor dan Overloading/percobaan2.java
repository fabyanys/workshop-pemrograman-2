class Kenaikangaji {
    private double gajipokok;
    private double persen;
    private String jabatan;
    private String id;

    public Kenaikangaji(String id, String jabatan, double gajipokok, double persen){
        this.id = id;
        this.jabatan = jabatan;
        this.gajipokok = gajipokok;
        this.persen = persen;
    }

    public double getGajiPokok(){
        return gajipokok + (persen / 100) * gajipokok;
    }

    public String getJabatan(){
        return jabatan;
    }

    public String getId(){
        return id;
    }
}

public class percobaan2 {
    public static void main(String[] args) {
        double gajisanti, gajironny, gajiindra;
        String jabatansanti, jabatanronny, jabatanindra, idsanti, idronny, idindra;
        Kenaikangaji Santi = new Kenaikangaji("SBY0001", "Manager", 4000000, 5);
        Kenaikangaji Ronny = new Kenaikangaji("BDG0317", "Staff", 2000000, 7.5);
        Kenaikangaji Indra = new Kenaikangaji("JKT0189", "Direktur", 8000000, 3);

        gajisanti = Santi.getGajiPokok();
        gajironny = Ronny.getGajiPokok();
        gajiindra = Indra.getGajiPokok();

        jabatansanti = Santi.getJabatan();
        jabatanronny = Ronny.getJabatan();
        jabatanindra = Indra.getJabatan();

        idsanti = Santi.getId();
        idronny = Ronny.getId();
        idindra = Indra.getId();

        System.out.println("Santi");
        System.out.println("No Pegawai : " + idsanti);
        System.out.println("Jabatan : " + jabatansanti);
        System.out.println("Gaji Baru : " + gajisanti);
        System.out.println();

        System.out.println("Ronny");
        System.out.println("No Pegawai : " + idronny);
        System.out.println("Jabatan : " + jabatanronny);
        System.out.println("Gaji Baru : " + gajironny);
        System.out.println();

        System.out.println("Indra");
        System.out.println("No Pegawai : " + idindra);
        System.out.println("Jabatan : " + jabatanindra);
        System.out.println("Gaji Baru : " + gajiindra);
    }
}