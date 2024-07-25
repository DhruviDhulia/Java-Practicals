class Employee{

    String first_name = "";
    String last_name = "";
    double salary = 0.0;

    Employee(String first,String last,double sal)
    {
        first_name = first;
        last_name = last;
        salary = sal;

    }
    Employee()
    {
        first_name = "";
        last_name = "";
        salary = 0.0;

    }


    public void set(String first,String last, double sal)
    {
        first_name = first;
        last_name = last;
        salary = sal;

    }
    public void get()
    {
        System.out.println(first_name + " " + last_name + " your salary is "+salary);
       
    }


    public static void main(String[] args) {

        Employee e1 = new Employee("Dhruvi", "Dhulia",100000);
        Employee e2 = new Employee("Palak", "Patel",200000);
        
        e1.get();
        e2.get();
        e1.set("Dhruvi","Dhulia",(100000 + 100000/10));
        e2.set("Palak","Patel",(200000 + 200000/10));
        e1.get();
        e2.get();


        System.out.println("\nID: 23DIT009");
    }
    
}