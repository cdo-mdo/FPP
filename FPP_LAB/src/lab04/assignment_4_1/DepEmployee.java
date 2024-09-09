package lab04.assignment_4_1;

import java.util.Date;
import java.util.GregorianCalendar;

public class DepEmployee {
	protected String name;
	protected Date hiredDate;
	protected double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHiredDate() {
		return (Date) hiredDate.clone();
	}

	public void setHiredDate(Date hiredDate) {
		this.hiredDate = hiredDate;
	}

	public double computeSalary() {
		return this.salary;
	}

	DepEmployee(String name, int year, int month, int day, int salary) {
		this.name = name;
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.set(year, month - 1, day);
		this.hiredDate = gregorianCalendar.getTime();
		this.salary = salary;
	}
}
