import java.util.*;
public class HashMapDemo {
    
    HashMap<Integer, String> employeeRecords = new HashMap<Integer, String>();

    void registerEmployees()
    {
        employeeRecords.put(101, "Peter");
        employeeRecords.put(102, "Laura");
        employeeRecords.put(103, "Casselyn");
        employeeRecords.put(104, "Andika");
        employeeRecords.put(105, "Jessica");
    }

    void showKeyValuePairs()
    {
        //fetch using .get Method, it requires key as an argument
        System.out.println("Employee 103: " + employeeRecords.get(103));

        //remobing Key/Value pair using .remove Method, it requires key as an argument
        System.out.println(employeeRecords.remove(103));

        //using Entry Interface for Fetching the Key/Value pairs

        for(Map.Entry<Integer, String> entry : employeeRecords.entrySet())
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapDemo obj = new HashMapDemo();
        obj.registerEmployees();
        obj.showKeyValuePairs();
    }
}
