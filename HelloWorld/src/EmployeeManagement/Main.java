package EmployeeManagement;

import java.util.Scanner;
public class Main {

    static boolean ordering = true;
    EmployeeImpl service = new EmployeeImpl();

    public static void menu() {
        System.out.println("****************Welcome To Employee Managment System *********** "
                + "\n1. Add Employee "
                + "\n2.View Employee"
                + "\n3. Delete Employee"
                + "\n4.View All Employee"
                + "\n5. Exist ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeImpl service = new EmployeeImpl();

        do {
            menu();
            System.out.println("Enter your Choice");
            int choice=sc.nextInt();
            switch(choice) {

                case 1:
                    System.out.println("Add Employee");
                    service.addEmploys();
                    break;
                case 2:
                    System.out.println("View Employee");
                    service.viewEmp();
                    break;
                case 3:
                    System.out.println("Delete Employee");
                    service.deleteEmployee();
                    break;
                case 4:
                    System.out.println("view All Employee");
                    service.viewAllEmps();
                    break;
                case 5:
                    System.out.println("Thank you for using application!!");
                    System.exit(0);

                default:
                    System.out.println("Please enter valid choice");
                    break;
            }
        } while (ordering);
    }
}
