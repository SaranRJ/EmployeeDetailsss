package org.emp;

public class Employee {

	public void empID(int a) {
		System.out.println("Employee ID:" + a);
	}

	public void empID(String s) {
		System.out.println("Employee ID:" + s);
	}

	public void empID(Float w) {
		System.out.println("Employee ID:" + w);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empID(1843);
		e.empID("Saran14");
		e.empID(7654.36545f);

	}

}
