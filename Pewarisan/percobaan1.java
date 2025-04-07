import java.util.Date;

class Employee1 {
    private static final double BASE_SALARY = 15000.00;
    private String name;
    private double salary;
    private Date birthDate;

    public Employee1(String name, double salary, Date DoB) {
        this.name = name;
        this.salary = salary;
        this.birthDate = DoB;
    }

    public Employee1(String name, double salary) {
        this(name, salary, null);
    }

    public Employee1(String name, Date DoB) {
        this(name, BASE_SALARY, DoB);
    }

    public Employee1(String name) {
        this(name, BASE_SALARY);
    }

    public void getinfo(){
        System.out.println("Nama : " + name);
        if (birthDate != null) {
            System.out.println("Tanggal Lahir : " + birthDate);
        } else {
            System.out.print("");
        }
        System.out.println("Gaji Bulanan : " + salary);
    }
}

class Manager extends Employee1 {
    private String department;

    public Manager(String name, double salary, String dept) {
        super(name, salary);
        this.department = dept;
    }
    
    public Manager (String n, String dept) {
        super(n);
        this.department = dept;
    }

    public Manager (String dept){
        super(null);
        this.department = dept;
    }
    public void getinfo(){
        super.getinfo();
        System.out.println("Department : " + department);
    }
}

public class percobaan1 {
    public static void main(String[] args) {
        Employee1 e = new Employee1("Budi", new Date(2000, 10, 10));
        Manager m = new Manager("Andi", 20000, "Telkom");
        e.getinfo();
        m.getinfo();
    }
}