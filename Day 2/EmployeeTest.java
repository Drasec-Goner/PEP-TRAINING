class Employee {
    String firstName, lastName;
    double salary;

    public Employee() {
        firstName = " ";
        lastName = " ";
        salary = 0.0;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        if (salary < 0.0) {
            salary = 0.0;
        }
        this.salary = salary;
    }

    public double getYearlySalary() {
        return salary * 12;
    }

    public void applyRaise(double percentage) {
        salary += salary * (percentage / 100);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.setFirstName("Timmie");
        emp1.setLastName("Sigma");
        emp1.setSalary(5000.0);

        emp2.setFirstName("Tojo");
        emp2.setLastName("Hammerton");
        emp2.setSalary(-2.0);

        System.out.println("Employee 1: " + emp1.firstName + " " + emp1.lastName + " Yearly Salary: " + emp1.getYearlySalary());
        System.out.println("Employee 2: " + emp2.firstName + " " + emp2.lastName + " Yearly Salary: " + emp2.getYearlySalary());

        // Apply 10% raise to monthly salary
        emp1.applyRaise(10);
        emp2.applyRaise(10);

        System.out.println("After 10% raise:");
        System.out.println("Employee 1: " + emp1.firstName + " " + emp1.lastName + " Yearly Salary: " + emp1.getYearlySalary());
        System.out.println("Employee 2: " + emp2.firstName + " " + emp2.lastName + " Yearly Salary: " + emp2.getYearlySalary());
    }
}
