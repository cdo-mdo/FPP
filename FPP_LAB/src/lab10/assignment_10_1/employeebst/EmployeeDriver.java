package lab10.assignment_10_1.employeebst;

import lab10.assignment_10_1.bst.EmployeeBST;

public class EmployeeDriver {

	public static void main(String[] args) {
		new EmployeeDriver();

	}

	public EmployeeDriver() {
		EmployeeBST bst = new EmployeeBST();
		bst.insert(new Employee("George", 40000, 1996,11,5));
		bst.insert(new Employee("Dave", 50000, 2000, 1, 3)); 
		bst.insert(new Employee("Sally", 45000, 2001, 2, 7)); 
		bst.insert(new Employee("Richard", 80000, 1986,3,23)); 
		
		bst.printTree();
	}
}
