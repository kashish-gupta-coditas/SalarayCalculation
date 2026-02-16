abstract class Employee {
    // Common attributes for all employees
    protected String name;
    protected double baseSalary;
    protected int attendanceDays;
    protected int performanceRating;

    // PF is fixed for all employees
    protected static final double PF_PERCENT = 0.12;

    public Employee(String name, double baseSalary, int attendanceDays, int performanceRating) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.attendanceDays = attendanceDays;
        this.performanceRating = performanceRating;
    }

    // Abstract method for Gross Salary calculation (will differ for each employee type)
    public abstract double calculateGrossSalary();

    // Attendance Deduction (common for all employees)
    public double calculateAttendanceDeduction() {
        double dailySalary = baseSalary / 30;
        int absentDays = 30 - attendanceDays;
        return absentDays * dailySalary;
    }

    // Performance Bonus Calculation (common logic, percentage differs by rating)
    public double calculateBonus(double grossSalary) {
        double bonusPercent = 0;
        switch (performanceRating) {
            case 5: bonusPercent = 0.20; break;
            case 4: bonusPercent = 0.15; break;
            case 3: bonusPercent = 0.10; break;
            case 2: bonusPercent = 0.05; break;
            case 1: bonusPercent = 0.0; break;
        }
        return grossSalary * bonusPercent;
    }

    // PF Deduction (common for all)
    public double calculatePF() {
        return baseSalary * PF_PERCENT;
    }

    // Tax Calculation (common slab logic)
    public double calculateTax(double grossSalary, double bonus) {
        double taxableIncome = grossSalary + bonus;
        double taxRate = 0;
        if (taxableIncome <= 50000) {
            taxRate = 0.05;
        } else if (taxableIncome <= 100000) {
            taxRate = 0.10;
        } else if (taxableIncome <= 150000) {
            taxRate = 0.15;
        } else {
            taxRate = 0.20;
        }
        return taxableIncome * taxRate;
    }

    // Net Salary Calculation
    public double calculateNetSalary() {
        double grossSalary = calculateGrossSalary();
        double bonus = calculateBonus(grossSalary);
        double pf = calculatePF();
        double attendanceDeduction = calculateAttendanceDeduction();
        double tax = calculateTax(grossSalary, bonus);

        return grossSalary + bonus - pf - attendanceDeduction - tax;
    }

    // Display salary breakdown
    public void printSalarySlip() {
        double grossSalary = calculateGrossSalary();
        double bonus = calculateBonus(grossSalary);
        double pf = calculatePF();
        double attendanceDeduction = calculateAttendanceDeduction();
        double tax = calculateTax(grossSalary, bonus);
        double netSalary = calculateNetSalary();

        System.out.println("Salary Slip for " + name);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("PF Deduction: " + pf);
        System.out.println("Attendance Deduction: " + attendanceDeduction);
        System.out.println("Tax: " + tax);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("-----------------------------");
    }
}
