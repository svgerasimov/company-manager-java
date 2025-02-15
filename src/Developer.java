import java.io.Serializable;

public class Developer extends Employee implements IPayble, IWorkable {
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


    @Override
    public void work() {
        System.out.println("Разработчик пишет код программы, фиксит баги ...");
    }
}
