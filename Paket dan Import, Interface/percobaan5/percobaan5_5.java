package percobaan5;

interface Flayer {
    void Takoff();
    void Landing();
    void Fly();
}

class Airplane implements Flayer {
    public void Takoff() {
        System.out.println("take off");
    }

    public void Landing() {
        System.out.println("mendarat");
    }

    public void Fly() {
        System.out.println("terbang");
    }
}

class Bird implements Flayer {
    public void Takoff() {
        System.out.println("take off");
    }
    
    public void Landing() {
        System.out.println("mendarat");
    }

    public void Fly() {
        System.out.println("terbang");
    }

    public void BuildNest() {
        System.out.println("membuat sarang");
    }

    public void LayEggs() {
        System.out.println("bertelur");
    }
}
public class percobaan5_5 {
    public static void main(String[] args) {
        Airplane p = new Airplane();
        System.out.println("Airplane:");
        p.Takoff();
        p.Landing();
        p.Fly();

        System.out.println();
        
        Bird b = new Bird();
        System.out.println("Bird:");
        b.Takoff();
        b.Landing();
        b.Fly();
        b.BuildNest();
        b.LayEggs();
    }
}
