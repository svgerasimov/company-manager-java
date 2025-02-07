public class Main {
    public static void main(String[] args) {

//        var emp1 = new Employee(40_000, 40);
//        System.out.println(Employee.getNumberOfEmployees());
//
//        var emp2 = new Employee(50_000, 45);
//        System.out.println(Employee.getNumberOfEmployees());
         var manager1 = new Manager(50_000, 45, 100);

         var manager2 = new Manager(60_000, 55, 500);

        System.out.println(manager1.calculateWage());
        System.out.println(manager2.calculateWage());


        var developer1 = new Developer(150_000, 1000, 5);
        System.out.println( developer1.calculateWage());



    }
}