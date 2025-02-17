import java.util.ArrayList;
import java.util.List;

public class EmployeeStorage<T extends Employee> {
    private List<T> employees = new ArrayList<>();

    public void add(T employee) {
        employees.add(employee);
    }

    public T get(int index) {
        return employees.get(index);
    }

    public int size() {
        return employees.size();
    }

    public void remove(int index) {
        employees.remove(index);
    }
}

// employees.add("Hello")


// EmployeeStorage<Developer>
// employees.add(new Developer(...))

