class Tabungan {
    int saldo;
    Tabungan(int initsaldo) {
        saldo = initsaldo;
    }
    void ambilUang(int jumlah) {
        saldo = saldo - jumlah;
    }
}

public class percobaan1 {
    public static void main(String[] args) {
        Tabungan a = new Tabungan(5000);
        System.out.println("Saldo awal : " + a.saldo);
        a.ambilUang(2300);
        System.out.println("Jumlah uang yang diambil : 2300");
        System.out.println("Saldo sekarang : " + a.saldo);
    }
}