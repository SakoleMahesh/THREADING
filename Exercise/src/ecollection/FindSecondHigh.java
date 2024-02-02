package ecollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee
{
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getYearOfJoining()
    {
        return yearOfJoining;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return " Id : "+id
                +"\r Name : "+name
                +"\r age : "+age
                +"\r Gender : "+gender
                +"\r Department : "+department
                +"\r Year Of Joining : "+yearOfJoining
                +"\r Salary : "+salary;
    }
}
public class FindSecondHigh
{
    public static void main(String[] args)
    {
        // Create a list of Employee objects
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "John", 30, "Male", "IT", 2010, 6022000));
        employeeList.add(new Employee(2, "Jane", 28, "Female", "HR", 2012, 55000));
        employeeList.add(new Employee(3, "Bob", 35, "Male", "Finance", 2008, 70000));
        employeeList.add(new Employee(4, "Alice", 32, "Female", "Marketing", 2015, 65000));

        // Find the second highest paid employee
        Employee secondHighestPaidEmployee = findSecondHighestPaidEmployee(employeeList);

        // Display the result
        System.out.println("Second Highest Paid Employee: ");
        System.out.println(secondHighestPaidEmployee);
    }

    // Method to find the second highest paid employee
    private static Employee findSecondHighestPaidEmployee(List<Employee> employeeList) {
        // Sort the list of employees based on salary in descending order
        Collections.sort(employeeList, Comparator.comparingDouble(Employee::getSalary).reversed());

        // Get the second element in the sorted list
        return employeeList.get(1);
    }
}