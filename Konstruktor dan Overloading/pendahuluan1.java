class Lingkaran {
    private double jari;
    
    public void isijari(double jari){
        this.jari = jari;
    }
    
    public double getluas(){
        return 3.14 * jari * jari;
    }

    public double getkeliling(){
        return 2 * 3.14 * jari;
    }

    public void gethasil(){
        System.out.println("Jadi Luasnya " + getluas() + " sedangkan Kelilingnya " + getkeliling());
    }
}

public class pendahuluan1 {
    public static void main(String[] args) {
        Lingkaran a = new Lingkaran();
        a.isijari(10);
        a.gethasil();
    }
}