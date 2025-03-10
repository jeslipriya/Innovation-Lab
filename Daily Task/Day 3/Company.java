public class Company {

    static String companyName = "TCS";
    String employeeName;
    
    public Company(String employeeName){
        this.employeeName = employeeName;
    }

    void display(){
        System.out.println("COmpany Name: " + companyName);
        System.out.println("Employee Name: " + employeeName);
    }

    public static void main(String[] args) {
        Company company1 = new Company("John");
        Company company2 = new Company("Paul");
        Company company3 = new Company("Jeslin");
        
        
        company1.display();
        company2.display();
        company3.display();
    }
}
