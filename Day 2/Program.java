public class Program {
    public static void main(String[] args) {
        
        Employee timi = new Employee();

        System.out.println("Employee Salary: " + timi.Salary);
        timi.takeAttendance();
    }
}


class Employee {
    public int Salary = 5000;

    public void takeAttendance() {
        System.out.println("I take Attendance");
    }
}