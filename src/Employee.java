
public class Employee implements IPayble {

    private double baseSalary;
    private double hourlyRate;

    private static int numberOfEmployees = 0;


    protected double getBaseSalary() {
        return baseSalary;
    }

    protected void setBaseSalary(double baseSalary) throws InvalidSalaryException {
        if(baseSalary < 0){
            throw new InvalidSalaryException("Base Salary cannot be negative");
        }
        this.baseSalary = baseSalary;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Осн констурктор
    public Employee(double baseSalary, double hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
//        numberOfEmployees++;
    }
    public Employee(double baseSalary) {
        this(baseSalary,0);
    }


    public final int getNumberOfEmployees() {
        return numberOfEmployees;
    }


//    public abstract double calculateWage();

     //Базовая реализация расчета зарплаты штатного сотрудника (БЕЗ УЧЕТА ОТРАБОТАННЫХ ЧАСОВ)
   public double calculateWage(){
        return baseSalary;
   }

   // Перегруженный метод для расчета зп с УЧЕТОМ ОТРАБОТАННЫХ ЧАСОВ
   public double calculateWage(int hoursWorked){
        if(hoursWorked < 0){
            throw new IllegalArgumentException("Hours Worked cannot be negative");
        }
        return baseSalary + (hoursWorked * hourlyRate);
   }



   // employee.calculateWage()
   // employee.calculateWage()
}

// new Employee(30_000, 100)
// new Employee(50_000, 200)





