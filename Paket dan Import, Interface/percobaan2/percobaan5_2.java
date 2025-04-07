import perbankan.Nasabah;
import perbankan.Tabungan;

public class percobaan5_2 {
    public static void main(String[] args) {
        double tmp;
        boolean status;

        Nasabah nasabah = new Nasabah("Agus", "Daryanto");
        System.out.println("Nasabah atas nama : " + nasabah.getNamaAwal() + " " + nasabah.getNamaAkhir());

        nasabah.setTabungan(new Tabungan(5000));

        tmp = nasabah.getTabungan().getSaldo();
        System.out.println("Saldo saat ini : " + tmp);

        nasabah.getTabungan().simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000");

        status = nasabah.getTabungan().ambilUang(6000);
        System.out.print("Jumlah uang yang diambil : 6000 ");
        if (status) {
            System.out.println("Ok");
        } else {
            System.out.println("Transaksi gagal");
        }

        nasabah.getTabungan().simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan : 3500");

        status = nasabah.getTabungan().ambilUang(4000);
        System.out.print("Jumlah uang yang diambil : 4000 ");
        if (status) {
            System.out.println("Ok");
        } else {
            System.out.println("Transaksi gagal");
        }

        status = nasabah.getTabungan().ambilUang(1600);
        System.out.print("Jumlah uang yang diambil : 1600 ");
        if (status) {
            System.out.println("Ok");
        } else {
            System.out.println("Transaksi gagal");
        }

        nasabah.getTabungan().simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan : 2000");

        tmp = nasabah.getTabungan().getSaldo();
        System.out.println("Saldo saat ini : " + tmp);
    }
}