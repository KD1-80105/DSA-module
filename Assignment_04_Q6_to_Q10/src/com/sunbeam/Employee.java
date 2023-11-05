package com.sunbeam;

import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double empSalary;
    Employee next;

    public Employee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.next = null;
    }
}

class EmployeeLinkedList {
    Employee head;

    public void addEmployee(int empId, String empName, double empSalary) {
        Employee newEmployee = new Employee(empId, empName, empSalary);
        if (head == null) {
            head = newEmployee;
        } else {
            Employee temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newEmployee;
        }
        System.out.println("Employee added successfully!");
    }

    public void displayEmployees() {
        if (head == null) {
            System.out.println("No employees to display.");
            return;
        }
        Employee current = head;
        while (current != null) {
            System.out.println("Employee ID: " + current.empId +
                    ", Name: " + current.empName +
                    ", Salary: " + current.empSalary);
            current = current.next;
        }
    }

    public void searchEmployeeByName(String empName) {
        if (head == null) {
            System.out.println("No employees to search.");
            return;
        }
        Employee current = head;
        boolean found = false;
        while (current != null) {
            if (current.empName.equalsIgnoreCase(empName)) {
                System.out.println("Employee found - ID: " + current.empId +
                        ", Name: " + current.empName +
                        ", Salary: " + current.empSalary);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("Employee not found with the given name.");
        }
    }

    public void deleteEmployeeById(int empId) {
        if (head == null) {
            System.out.println("No employees to delete.");
            return;
        }
        if (head.empId == empId) {
            head = head.next;
            System.out.println("Employee with ID " + empId + " deleted successfully!");
            return;
        }
        Employee current = head;
        Employee prev = null;
        boolean found = false;
        while (current != null) {
            if (current.empId == empId) {
                prev.next = current.next;
                System.out.println("Employee with ID " + empId + " deleted successfully!");
                found = true;
                break;
            }
            prev = current;
            current = current.next;
        }
        if (!found) {
            System.out.println("Employee not found with the given ID.");
        }
    }

    public void updateSalary(int empId, double newSalary) {
        if (head == null) {
            System.out.println("No employees to update.");
            return;
        }
        Employee current = head;
        boolean found = false;
        while (current != null) {
            if (current.empId == empId) {
                current.empSalary = newSalary;
                System.out.println("Salary updated successfully for employee ID: " + empId);
                found = true;
                break;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("Employee not found with the given ID.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeLinkedList employeeList = new EmployeeLinkedList();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Delete Employee by ID");
            System.out.println("5. Update Salary of Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int empId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter Employee Name: ");
                    String empName = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double empSalary = scanner.nextDouble();
                    employeeList.addEmployee(empId, empName, empSalary);
                    break;
                case 2:
                    employeeList.displayEmployees();
                    break;
                case 3:
                    System.out.print("Enter Employee Name to Search: ");
                    String searchName = scanner.nextLine();
                    employeeList.searchEmployeeByName(searchName);
                    break;
                case 4:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = scanner.nextInt();
                    employeeList.deleteEmployeeById(deleteId);
                    break;
                case 5:
                    System.out.print("Enter Employee ID to Update Salary: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter New Salary: ");
                    double newSalary = scanner.nextDouble();
                    employeeList.updateSalary(updateId, newSalary);
                    break;
                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
