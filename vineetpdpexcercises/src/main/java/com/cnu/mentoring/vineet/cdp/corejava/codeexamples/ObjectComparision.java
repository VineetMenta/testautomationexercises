package com.cnu.mentoring.vineet.cdp.corejava.codeexamples;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	int empId;
	String empName;

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public boolean equals(Object o) {
		if (this.hashCode() == o.hashCode()) {
			Employee emp = (Employee) o;
			return empId == emp.empId && empName.equals(emp.empName);
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return (123 + 456) + empId;
	}

	@Override
	public int compareTo(Employee o) {
		return this.empId - o.empId;
	}

	@Override
	public String toString() {
		return this.empName + " " + this.empId;
	}
}

public class ObjectComparision {
	private static final Logger LOGGER = Logger.getLogger(ObjectComparision.class);

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		LOGGER.info(new Employee(10, "Harry").equals(new Employee(10, "Harry")));
		Employee harry = new Employee(10, "Harry");
		Employee hermoine = new Employee(13, "Hermoine");
		Employee ron = new Employee(15, "ron");
		Employee hagrid = new Employee(2, "Hagrid");
		Employee snape = new Employee(6, "Snape");
		Employee malfoy = new Employee(17, "Malfoy");
		Employee neville = new Employee(15, "neville");
		list.add(harry);
		list.add(hermoine);
		list.add(ron);
		list.add(hagrid);
		list.add(snape);
		list.add(malfoy);
		list.add(neville);
		LOGGER.info(list.toString());
		Collections.sort(list);
		LOGGER.info(list.toString());
	}
}
