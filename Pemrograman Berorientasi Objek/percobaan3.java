class acaraTV {
    private String StasiunTV;
    private String Acara;

    public String getStasiunTV() {
        return StasiunTV;
    }

    public void setStasiunTV(String StasiunTV) {
        this.StasiunTV = StasiunTV;
    }

    public String getAcara() {
        return Acara;
    }

    public void setAcara(String Acara) {
        this.Acara = Acara;
    }

    public void cetak(){
        System.out.println("Acara " + Acara + " StasiunTV " + StasiunTV);
    }
}

public class percobaan3 {
    public static void main(String[] args) {
        acaraTV a = new acaraTV();
        a.setStasiunTV ("Indosiar");
        a.setAcara("Sinetron");
        a.cetak();
    }
}