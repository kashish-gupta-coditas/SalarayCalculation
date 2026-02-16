public class Developer extends Employee {
    private int overtimeHours;

    public Developer(String name, double baseSalary, int attendanceDays, int performanceRating, int overtimeHours) {
        super(name, baseSalary, attendanceDays, performanceRating);
        this.overtimeHours = overtimeHours;
    }

    // Gross Salary = BaseSalary + (OvertimeHours * 500)
    @Override
    public double calculateGrossSalary() {
        return baseSalary + (overtimeHours * 500);
    }
}
