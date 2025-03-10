public class Employee {

    private int id;
    private int salary;
    private final int minSalary = 10000;

    public Employee(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    public void setSalary(int salary) {
        if (salary < minSalary) {
            System.out.println("Salary is below the minimum threshold amount");
        } else {
            this.salary = salary;
            System.out.println("Salary: " + this.salary);
        }
    }

    public static void main(String[] args) {

        Employee emp = new Employee(101, 20000);

        emp.setSalary(25000); 
        emp.setSalary(200);    
    }
}
