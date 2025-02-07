public class Developer extends Employee  {
    private int overtimeHours;

    public Developer(double baseSalary, double hourlyRate, int overtimeHours) {
        super(baseSalary, hourlyRate);
        setOvertimeHours(overtimeHours);
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateWage() {
        // Допустим сверхурочные оплачиваются по удвоенной ставке
        return super.getBaseSalary() + (super.getHourlyRate() * 2 * overtimeHours);
    }
}
