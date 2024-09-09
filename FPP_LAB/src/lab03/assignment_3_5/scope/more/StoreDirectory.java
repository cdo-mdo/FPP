package lab03.assignment_3_5.scope.more;

public class StoreDirectory {
	Bookstore bookstore;
	Market market;

	public StoreDirectory(String custId) {
		bookstore = new Bookstore(custId);
		market = new Market();
	}

	// books
	public int getNumberOfBooks() {
		return bookstore.getNumBooks();
	}

	public int getNumberOfBookstoreEmployees() {
		return bookstore.getNumEmployees();
	}

	public boolean addNewEmployee(String employeeId) {
		return bookstore.addNewEmployee(employeeId);
	}

	public boolean bookIsInStock(String bookId) {
		return bookstore.bookIsInStock(bookId);
	}

	public int getNumCDsInBookstore() {
		return bookstore.getNumCds();
	}

	public boolean addNewCD(int cdId) {
		bookstore.addCd(cdId);
		return false;
	}

	public boolean addNewBook(String bookId) {
		bookstore.addNewBook(bookId);
		return true;
	}

	// market
	public boolean marketCarriesFoodItem(String foodItem) {
		market.carriesFoodItem(foodItem);
		return false;
	}

}