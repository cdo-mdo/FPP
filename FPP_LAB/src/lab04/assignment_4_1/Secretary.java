package lab04.assignment_4_1;

public class Secretary extends DepEmployee {
	private double overtimeHours;

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	public double computeSalary() {
		return this.salary + OVERTIME_MULTIPLY_FACTOR * overtimeHours;
	}

	Secretary(String name, int year, int month, int day, int salary) {
		super(name, year, month, day, salary);
	}

	private final double OVERTIME_MULTIPLY_FACTOR = 12;
}
