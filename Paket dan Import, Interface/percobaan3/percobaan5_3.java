interface A {
    public void method1();
    public void method2();
}

interface B extends A {
    public void method3();
    public void method4();
}

class implementasi implements B {
    public void method1() {
        System.out.println("Implementasi method 1......");
    }

    public void method2() {
        System.out.println("Implementasi method 2......");
    }

    public void method3() {
        System.out.println("Implementasi method 3......");
    }

    public void method4() {
        System.out.println("Implementasi method 4......");
    }
}

public class percobaan5_3 {
    public static void main(String[] args) {
        implementasi impl = new implementasi();
        impl.method1();
        impl.method2();
        impl.method3();
        impl.method4();
    }
}
