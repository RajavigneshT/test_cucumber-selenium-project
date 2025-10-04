package utlity;

/**
 * Company Payroll Management Example
 * Demonstrates: OOP Concepts, Constructors, Access Specifiers, Static Members,
 * Data Types, Arrays, Control Statements, Methods, and Polymorphism.
 */
class Person {
    String name;
    int age;

    Person(String name, int age) { // Parameterized Constructor
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Inheritance Example
class Employee extends Person {
    private double salary;
    private String department;
    static int totalEmployees = 0; // Static member

    // Constructor using super()
    Employee(String name, int age, double salary, String department) {
        super(name, age);
        this.salary = salary;
        this.department = department;
        totalEmployees++;
    }

    // Encapsulation: Getter for private data
    public double getSalary() {
        return salary;
    }

    // Polymorphism: Overriding parent method
    @Override
    void displayInfo() {
        System.out.println("Employee: " + name + " | Age: " + age + " | Dept: " + department + " | Salary: " + salary);
    }

    // Static method
    static void showTotalEmployees() {
        System.out.println("Total Employees in the Company: " + totalEmployees);
    }
}

public class CompanyPayroll {
    public static void main(String[] args) {

        System.out.println("=== Welcome to Company Payroll System ===\n");

        // Data types and variables
        int workingDays = 22;
        double dailyRate = 2500.50;
        boolean eligibleForBonus = true;

        // Control statement
        double baseSalary = workingDays * dailyRate;
        if (eligibleForBonus && baseSalary > 50000) {
            baseSalary += 5000; // Bonus
            System.out.println("Bonus Applied! Updated Salary: " + baseSalary);
        } else {
            System.out.println("No Bonus Applied");
        }

        // Arrays
        String[] departments = {"HR", "Finance", "Development", "Testing"};
        System.out.println("\nDepartments in the Company:");
        for (String dept : departments) {
            System.out.println("- " + dept);
        }

        // Creating Employee Objects
        Employee e1 = new Employee("Ravi", 28, 65000, "Development");
        Employee e2 = new Employee("Priya", 25, 55000, "Testing");
        Employee e3 = new Employee("Anand", 30, 70000, "Finance");

        // Method calls
        System.out.println("\nEmployee Details:");
        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();

        // Static member and method call
        Employee.showTotalEmployees();

        // Operator example
        double averageSalary = (e1.getSalary() + e2.getSalary() + e3.getSalary()) / 3;
        System.out.println("\nAverage Salary of Employees: " + averageSalary);

        // End message
        System.out.println("\nPayroll Processing Completed Successfully.");
    }
}
