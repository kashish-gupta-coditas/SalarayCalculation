public class Main {
    public static void main(String[] args) {

        Developer dev = new Developer("Nishi", 80000, 28, 4, 10); // 10 overtime hours
        System.out.println("Net Salary of " + dev.getName() + "  is : " + dev.calculateNetSalary());
        dev.printSalarySlip();


        Manager mgr = new Manager("Kartik", 120000, 30, 5, 5); // 5 team members
        mgr.printSalarySlip();


        Intern intern = new Intern("Anuj", 10000, 20, 3); // 20 days attendance
        intern.printSalarySlip();
    }
}
