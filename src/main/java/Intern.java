class Intern extends Employee {

    public Intern(String name, double baseSalary, int attendanceDays, int performanceRating) {
        super(name, baseSalary, attendanceDays, performanceRating);
    }

    // Gross Salary depends on attendance percentage
    @Override
    public double calculateGrossSalary() {
        double attendancePercent = (attendanceDays / 30.0) * 100;
        if (attendancePercent < 70) {
            return baseSalary - (baseSalary * 0.20); // 20% deduction if attendance < 70%
        } else {
            return baseSalary;
        }
    }
}
