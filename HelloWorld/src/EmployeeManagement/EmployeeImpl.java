package EmployeeManagement;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeImpl implements IEmployee {

    HashSet<Employee> setEmployees = new HashSet<>();

    Employee emp1 = new Employee(101, "Marin", 24, "Developer", 25000);
    Employee emp2 = new Employee(102, "Costel", 26, "Tester", 57000);
    Employee emp3 = new Employee(103, "Bob", 20, "DevOps Eng", 5000);
    Employee emp4 = new Employee(104, "Dan", 27, "System Eng", 70000);

    Scanner sc = new Scanner(System.in);
    boolean found = false;
    int id;
    String name;
    int age;
    String department;
    double salary;

    public EmployeeImpl() {

        setEmployees.add(emp1);
        setEmployees.add(emp2);
        setEmployees.add(emp3);
        setEmployees.add(emp4);

    }

    //view all employees
    @Override
    public void viewAllEmps() {
        for (Employee emp : setEmployees) {
            System.out.println(emp);
        }
    }

    //view emp based on there id
    @Override
    public void viewEmp() {

        System.out.println("Enter id: ");
        id = sc.nextInt();
        for (Employee emp : setEmployees) {
            if (emp.getId() == id) {
                System.out.println(emp);
                found = true;
            }

        }
        if (!found) {
            System.out.println("Employee with this id is not present");
        }
    }

    //delete emp
    @Override
    public void deleteEmployee() {
        System.out.println("Enter id");
        id = sc.nextInt();
        boolean found = false;
        Employee empdelete = null;
        for (Employee emp : setEmployees) {
            if (emp.getId() == id) {
                empdelete = emp;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee is not present");
        } else {
            setEmployees.remove(empdelete);
            System.out.println("Employee deleted successfully!!");
        }
    }

    //add emp
    @Override
    public void addEmploys() {
        System.out.println("Enter id:");
        id = sc.nextInt();
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter age");
        age = sc.nextInt();
        System.out.println("Enter Department");
        department = sc.next();
        System.out.println("Enter salary");
        sc.nextDouble();

        Employee emp = new Employee(id, name, age, department, salary);

        setEmployees.add(emp);
        System.out.println(emp);
        System.out.println("Employtee addeed successsfully");
    }
}