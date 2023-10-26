package com.sunbeam;


public class Prac_employee {
	int empid;
	String name;
	double salary;

	public Prac_employee() {
		// TODO Auto-generated constructor stub
	}

	public Prac_employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Prac_employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	public static Prac_employee searchEmployeeById(Prac_employee[] employees, int empid) {
		for (Prac_employee employee : employees) {
			if (employee.empid == empid) {
				System.out.println("Employee Found !! at " + employee);
				return employee;
			}
		}
		return null;
	}

	public static Prac_employee searchByName(Prac_employee[] employee, String name) {
		for (Prac_employee employeeName : employee) {
			if (employeeName.name == name) {
				System.out.println("Employee Found !! at " + employeeName);
				return employeeName;
			}
		}

		return null;

	}

	public static Prac_employee searchBySalary(Prac_employee[] employee, double salary) {
		for (Prac_employee employeeSal : employee) {
			if (employeeSal.salary == salary) {
				System.out.println("Employee Found !! at " + employeeSal);
				return employeeSal;
			}
		}

		return null;

	}

	public static class Employeesearch {
		public static void main(String[] args) {
//			Scanner sc=new Scanner(System.in);

			Prac_employee[] employee = { new Prac_employee(1, "akhil", 50000), new Prac_employee(2, "pavandada", 80000),
					new Prac_employee(3, "prashan", 550000), new Prac_employee(4, "suyesh", 62500) };

			int keyId = 22;
			Prac_employee empById = searchEmployeeById(employee, keyId);

			if (empById != null) {
				System.out.println("Employee Found !! " + empById.toString());
			}
			String Keyname = "akhil";
			Prac_employee empByName = searchByName(employee, Keyname);

			if (empByName != null) {
				System.out.println("Employee Found!!! at " + empByName.toString());
			}
			double KeySalary = 2500;
			Prac_employee empBySalary = searchBySalary(employee, KeySalary);

			if (empBySalary != null) {
				System.out.println("Employee Found !! at" + empBySalary.toString());
			}

		}
	}

}