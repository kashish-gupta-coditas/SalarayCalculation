class Intern extends Employee {

    public Intern(String name, double baseSalary, int attendanceDays, int performanceRating) {
        super(name, baseSalary, attendanceDays, performanceRating);
    }


    @Override
    public double calculateGrossSalary() {
        double attendancePercent = (getAttendanceDays()/ 30.0) * 100;
        if (attendancePercent < 70) {
            return getBaseSalary() - (getBaseSalary() * 0.20); // 20% deduction if attendance < 70%
        } else {
            return getBaseSalary();
        }
    }
}
