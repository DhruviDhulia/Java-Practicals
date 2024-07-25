import java.util.Scanner;

class Member {
    String name;
    int age;
    long phone;
    String address;
    int salary;

    void printSalary() {
        System.out.println("The salary of the person is " + salary);
    }

    void display(String n, int a, long p, String ad, int s) {
        name = n;
        age = a;
        phone = p;
        address = ad;
        salary = s;
        System.out.println("\n_____________________________________________________________________");
        System.out.println("\nName of the person is : " + n);
        System.out.println("\nAge is : " + a);
        System.out.println("\nPhone are : " + p);
        System.out.println("\nAddress is : " + ad);
        printSalary();
    }
}

class Employee extends Member {
    String specialization;
    String department;

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class Manager extends Member {
    String specialization;
    String department;

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class prac17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Name of employee: ");
        String n = input.nextLine();
        
        System.out.println("Age: ");
        int a = input.nextInt();
        
        System.out.println("Phone: ");
        long p = input.nextLong();
        input.nextLine();
        
        System.out.println("Address: ");
        String ad = input.nextLine();
        
        System.out.println("Salary: ");
        int s = input.nextInt();
        input.nextLine();
        
        System.out.println("Department of Employee: ");
        String dep = input.nextLine();
        
        System.out.println("Specialization of Employee: ");
        String sep = input.nextLine();

        System.out.println("\nName of manager: ");
        String n2 = input.nextLine();
        
        System.out.println("Age: ");
        int a2 = input.nextInt();
        
        System.out.println("Phone: ");
        long p2 = input.nextLong();
        input.nextLine();
        
        System.out.println("Address: ");
        String ad2= input.nextLine();
        
        System.out.println("Salary: ");
        int s2 = input.nextInt();
        input.nextLine();
        
        System.out.println("Department of Manager: ");
        String dep2 = input.nextLine();
        
        System.out.println("Specialization of Manager: ");
        String sep2 = input.nextLine();

        Employee emp = new Employee();
        emp.display(n, a, p, ad, s);
        emp.setSpecialization(sep);
        emp.setDepartment(dep);

        Manager mgr = new Manager();
        mgr.display(n2, a2, p2, ad2, s2);
        mgr.setSpecialization(sep2);
        mgr.setDepartment(dep2);
        
        System.out.println("\nID: 23DIT009");
        
        input.close();
    }
}
