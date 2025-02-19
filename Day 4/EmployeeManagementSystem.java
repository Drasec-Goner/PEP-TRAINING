import java.util.*;
class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }
}

public class EmployeeManagementSystem
{
    private List<Employee> employees = new ArrayList<Employee>();

    public void addEmployee(int id, String name, String department, double salary) {
        Employee newEmployee = new Employee(id, name, department, salary);
        employees.add(newEmployee);
        System.out.println("Added employee "+newEmployee);
    }

    public void removeEmployee(int id) {
        boolean found=false;
        for (int i=0;i<employees.size();i++) {
            if (employees.get(i).getId() == id) {
                System.out.println("Removed employee "+employees.get(i));
                employees.remove(i);
                found=true;
                return;
            }
        }
        if(!found)
            System.out.println("Employee "+id+" not found");
    }

    public void searchByDepartment(String department) {
        boolean found=false;
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department)) {
                System.out.println("Found employee "+employee);
                found=true;
            }
        }
        if(!found)
            System.out.println("Employee in department "+department+" not found");
    }

    public void updateEmployee(int id, String name, String department, double salary) {
        boolean found=false;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee.setName(name);
                employee.setDepartment(department);
                employee.setSalary(salary);
                System.out.println("Updated employee "+employee);
                found=true;
                break;
            }
        }
        if(!found)
            System.out.println("Employee "+id+" not found");
    }
    public void sortEmployee() {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });
        System.out.println("Sorted employees "+employees);
        listAllEmployees();
    }

    public void listAllEmployees() {
        System.out.println("All employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static void main(String[] args) {

        System.out.println("Employee Management System");
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        ems.addEmployee(1, "John", "HR", 50000);
        ems.addEmployee(2, "Jane", "IT", 60000);
        ems.addEmployee(3, "Doe", "HR", 55000);
        ems.addEmployee(4, "Smith", "IT", 65000);

        ems.listAllEmployees();
        ems.removeEmployee(1);
        ems.listAllEmployees();
        ems.searchByDepartment("HR");
        ems.updateEmployee(2, "Jane Doe", "IT", 70000);
        ems.listAllEmployees();
    }
}