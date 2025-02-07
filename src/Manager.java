import java.io.Serializable;

public class Manager extends Employee implements IPayble {
    private double managerBonus;

    private double baseSalary;
    private double hourlyRate;


    public Manager(double baseSalary, double hourlyRate, double bonus) {
        super(baseSalary, hourlyRate);
        setBonus(bonus);
    }

    public double getBonus() {
        return managerBonus;
    }

    public void setBonus(double bonus) {
        if(bonus < 0){
            throw new IllegalArgumentException("Bonus cannot be negative");
        }
        this.managerBonus = bonus;
    }

    @Override
    public double calculateWage() {
        return super.getBaseSalary() + + getBonus();
    }
}


