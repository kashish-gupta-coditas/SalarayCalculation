public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double baseSalary, int attendanceDays, int performanceRating, int teamSize) {
        super(name, baseSalary, attendanceDays, performanceRating);
        this.teamSize = teamSize;
    }

    // Gross Salary = BaseSalary + (TeamSize * 1000)
    @Override
    public double calculateGrossSalary() {
        return baseSalary + (teamSize * 1000);
    }
}
