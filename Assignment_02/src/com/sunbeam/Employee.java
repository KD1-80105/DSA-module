package com.sunbeam;

import java.util.Arrays;

public class Employee {
	private String name;
	private double Salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, double salary) {
		this.name = name;
		Salary = salary;
	}

	public double getSalary() {
		return Salary;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", Salary=" + Salary + "]";
	}

	public static int empSal(Employee[] arr) {
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				count++;

				if (arr[i].getSalary() > arr[j].getSalary()) {
					Employee temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		System.out.println("no. of iterations...." + count);

		return 0;

	}

	public static void main(String[] args) {
		Employee[] arr = { new Employee("akhil", 45000.0), 
				new Employee("virat", 56000.0),
				new Employee("dhoni", 48000.0), 
				new Employee("Elon", 78000.0) ,
				new Employee("rohit", 98000.0), 
				};

		System.out.println("Employees Before Sorting...." + Arrays.toString(arr));
		empSal(arr);
		System.out.println("Employees after Sorting...." + Arrays.toString(arr));

	}

}
