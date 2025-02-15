import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

      EmployeeStorage<Manager> allDevs = new EmployeeStorage<>();

//      allDevs.add(new Developer(150_000, 500, 20));
      allDevs.add(new Manager(50_000, 300, 2000));



    }
}