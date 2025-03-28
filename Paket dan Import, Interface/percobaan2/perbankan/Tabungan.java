package perbankan;

public class Tabungan {
    private double saldo;
    
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void simpanUang(double jumlah) {
        saldo += jumlah;
    }

    public boolean  ambilUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }
}
