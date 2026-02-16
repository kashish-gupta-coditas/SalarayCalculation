public class Main {
    public static void main(String[] args) {
        // Create a Developer
        Developer dev = new Developer("Nishi", 80000, 28, 4, 10); // 10 overtime hours
        dev.printSalarySlip();

        // Create a Manager
        Manager mgr = new Manager("Kartik", 120000, 30, 5, 5); // 5 team members
        mgr.printSalarySlip();

        // Create an Intern
        Intern intern = new Intern("Anuj", 30000, 20, 3); // 20 days attendance
        intern.printSalarySlip();
    }
}
