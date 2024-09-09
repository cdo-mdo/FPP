package lab04.assignment_4_1;

public class Professor extends DepEmployee {
	private int numberOfPublications;

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

	Professor(String name, int year, int month, int day, int salary) {
		super(name, year, month, day, salary);
	}
}
