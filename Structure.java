// Converted from C++ to Java
import java.util.*;

public class Structure {

    // collection of items of different data types
    static class Employee {
        int id;
        String name;
        float salary;

        Employee(int id, String name, float salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] e = new Employee[2];
        System.out.println("enter the details");
        for (int i = 0; i < 2; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            float salary = scanner.nextFloat();
            e[i] = new Employee(id, name, salary);
        }

        System.out.println("employee details are:");
        for (int i = 0; i < 2; i++) {
            System.out.println(e[i].id);
            System.out.println(e[i].name);
            System.out.println(e[i].salary);
        }
    }
}
